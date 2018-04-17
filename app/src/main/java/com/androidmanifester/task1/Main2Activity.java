package com.androidmanifester.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.textView4);
        t2=findViewById(R.id.textView5);
        t3=findViewById(R.id.textView6);

       String s1=  getIntent().getStringExtra("harsh");
       String s2=  getIntent().getStringExtra("vinay");
       String s3=  getIntent().getStringExtra("anuj");

       t1.setText(s1);
       t2.setText(s2);
       t3.setText(s3);

    }
}
