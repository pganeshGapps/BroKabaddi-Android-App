package com.ganeshgapps.clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnClick,btnReset;
    TextView txtCount;

    Button btnClick2,btnReset2;
    TextView txtCount2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // linking MainActivity.java to layout activity_main.xml

        //link buttons and label to this activity
        btnClick=(Button)findViewById(R.id.buttonClick);// findViewById() returns a view and then casting to button
        btnReset=(Button)findViewById(R.id.buttonReset);

        txtCount=(TextView)findViewById(R.id.textViewCount);

        /*Event Handling
        *setting onClickListener
        */

        //Left Side
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int countValue= Integer.parseInt(txtCount.getText().toString());
                ++countValue;
                txtCount.setText(String.valueOf(countValue));

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtCount.setText(String.valueOf(0000));
            }
        });


        //Right Side
        btnClick2=(Button)findViewById(R.id.buttonClick2);
        btnReset2=(Button)findViewById(R.id.buttonReset2);
        txtCount2=(TextView)findViewById(R.id.textViewCount2);

        btnClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int countValue=Integer.parseInt(txtCount2.getText().toString());
                ++countValue;
                txtCount2.setText(String.valueOf(countValue));
            }
        });

        btnReset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtCount2.setText(String.valueOf(0000));
            }
        });

    }


}
