package com.congfandi.lib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by congf on 22/12/2017.
 */

public class TextViewRupiah extends TextView {
    private Separator separator = Separator.DOT;

    public Separator getSeparator() {
        return separator;
    }

    public TextViewRupiah setSeparator(Separator separator) {
        this.separator = separator;
        return this;
    }

    public TextViewRupiah(final Context context) {
        super(context);
    }

    public TextViewRupiah(Context context, AttributeSet attrs) {
        super(context, attrs);

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

        return hasil.replaceAll(",", getSeparator() == Separator.DOT ? "." : ",");
    }

    @SuppressLint("SetTextI18n")
    public TextViewRupiah convertToIDR(EditText input) {
        setText("Rp." + toRp(input.getText().toString()));
        return this;
    }

    @SuppressLint("SetTextI18n")
    public TextViewRupiah convertToIDR(TextView input) {
        setText("Rp." + toRp(input.getText().toString()));
        return this;
    }

    @SuppressLint("SetTextI18n")
    public TextViewRupiah convertToIDR(String input) {
        setText("Rp." + toRp(input));
        return this;
    }

    @SuppressLint("SetTextI18n")
    public TextViewRupiah convertToDollar(EditText input) {
        setText("$" + toRp(input.getText().toString()));
        return this;
    }

    @SuppressLint("SetTextI18n")
    public TextViewRupiah convertToDollar(TextView input) {
        setText("$" + toRp(input.getText().toString()));
        return this;
    }

    @SuppressLint("SetTextI18n")
    public TextViewRupiah convertToDollar(String input) {
        setText("$" + toRp(input));
        return this;
    }

    @SuppressLint("SetTextI18n")
    public TextViewRupiah convertCustom(String format, EditText input) {
        setText(format + "" + toRp(input.getText().toString()));
        return this;
    }

    @SuppressLint("SetTextI18n")
    public TextViewRupiah convertCustom(String format, TextView input) {
        setText(format + "" + toRp(input.getText().toString()));
        return this;
    }

    @SuppressLint("SetTextI18n")
    public TextViewRupiah convertCustom(String format, String input) {
        setText(format + "" + toRp(input));
        return this;
    }
}
