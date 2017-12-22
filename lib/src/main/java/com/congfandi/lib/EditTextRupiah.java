package com.congfandi.lib;

import android.content.Context;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by congf on 22/12/2017.
 */

public class EditTextRupiah extends EditText {
    public EditTextRupiah(final Context context) {
        super(context);
    }

    public EditTextRupiah(Context context, AttributeSet attrs) {
        super(context, attrs);
        setInputType(InputType.TYPE_CLASS_NUMBER);
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                removeTextChangedListener(this);
                setText(toRp(getText().toString()));
                setSelection(getText().length());
                addTextChangedListener(this);
            }
        });
    }

    private String toRp(String angka) {
        String hasil = "";
        String asli = "";
        angka = angka.replaceAll(",", "").replace("Rp.", "");
        try {
            angka = "" + Integer.parseInt(angka);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        for (int i = angka.length() - 1; i >= 0; i -= 1) {
            hasil = angka.charAt(i) + hasil;
            asli = angka.charAt(i) + asli;
            if (asli.length() % 3 == 0 && i != 0)
                hasil = "," + hasil;
        }
        return hasil;
    }

    public String getNumber() {
        return getText().toString().replace(",", "");
    }

}
