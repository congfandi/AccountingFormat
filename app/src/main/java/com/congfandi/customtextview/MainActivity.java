package com.congfandi.customtextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.congfandi.lib.EditTextRupiah;
import com.congfandi.lib.TextViewRupiah;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextViewRupiah hasil = findViewById(R.id.hasil);
        final EditText data =  findViewById(R.id.data);
        final EditTextRupiah count =  findViewById(R.id.counting);
        Button oke =  findViewById(R.id.oke);
        oke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.setText(count.getNumber());
                hasil.convertCustom("USD",data);
            }
        });

    }
}
