package com.congfandi.customtextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.congfandi.lib.EditTextRupiah;
import com.congfandi.lib.Separator;
import com.congfandi.lib.TextViewRupiah;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText data = findViewById(R.id.data);

        final EditTextRupiah count = findViewById(R.id.counting);//auto convert
        final TextViewRupiah hasil = findViewById(R.id.hasil);//Have 3 methode
//                                                     hasil.convertToIDR(); => input from Edittex,TextView and String
//                                                     hasil.convertToDollar();=> input from Edittex,TextView and String
//                                                     hasil.convertCustom();=> input from Edittex,TextView and String
//


        Button oke = findViewById(R.id.oke);
        oke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("TAG", "result: "+count.getNumber());//getting number from edittex

                hasil
                        .setSeparator(Separator.COMA)//separator of Textview mode
                        .convertCustom("USD", "1234");//custom textview show

            }
        });

    }
}
