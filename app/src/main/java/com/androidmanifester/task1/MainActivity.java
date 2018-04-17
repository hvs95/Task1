package com.androidmanifester.task1;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2, editText3;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        checkBox = findViewById(R.id.checkBox);


    }

    public void tst(View view) {
        if (checkBox.isChecked()) {
            String s1 = editText1.getText().toString();
            String s2 = editText2.getText().toString();
            String s3 = editText3.getText().toString();

            Toast.makeText(this, s1 + " " + s2 + " " + s3, Toast.LENGTH_SHORT).show();

        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

            builder.setTitle("Alert!");
            builder.setMessage("Pleae Check the checkbox");
            builder.setIcon(android.R.drawable.ic_media_play);
            builder.show();
        }

    }

    public void gte(View view) {
        if (checkBox.isChecked()) {
            String s1 = editText1.getText().toString();
            String s2 = editText2.getText().toString();
            String s3 = editText3.getText().toString();

            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("harsh",s1);
            intent.putExtra("vinay",s2);
            intent.putExtra("anuj",s3);
            startActivity(intent);

        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

            builder.setTitle("Alert!");
            builder.setMessage("Pleae Check the checkbox");
            builder.setIcon(android.R.drawable.ic_media_play);
            builder.show();
        }
    }
}