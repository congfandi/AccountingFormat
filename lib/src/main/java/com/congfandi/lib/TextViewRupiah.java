package com.congfandi.lib;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by congf on 22/12/2017.
 */

public class TextViewRupiah extends TextView {
    public TextViewRupiah(final Context context) {
        super(context);
    }

    public TextViewRupiah(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    private String toRp(String angka) {
        String hasil = "";
        String asli = "";
        angka = angka.replaceAll(",", "");
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

    public void convertToIDR(EditText input) {
        setText("Rp." + toRp(input.getText().toString()));
    }

    public void convertToIDR(TextView input) {
        setText("Rp." + toRp(input.getText().toString()));
    }

    public void convertToIDR(String input) {
        setText("Rp." + toRp(input));
    }

    public void convertToDollar(EditText input) {
        setText("$" + toRp(input.getText().toString()));
    }

    public void convertToDollar(TextView input) {
        setText("$" + toRp(input.getText().toString()));
    }

    public void convertToDollar(String input) {
        setText("$" + toRp(input.toString()));
    }

    public void convertCustom(String format, EditText input) {
        setText(format + "" + toRp(input.getText().toString()));
    }

    public void convertCustom(String format, TextView input) {
        setText(format + "" + toRp(input.getText().toString()));
    }

    public void convertCustom(String format, String input) {
        setText(format + "" + toRp(input.toString()));
    }
}
