package com.example.handin1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class A3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);
    }

    public void startA2(View view){

        Intent intent = new Intent();

        EditText edtT4 = findViewById(R.id.T4);
        String txtT4 = edtT4.getText().toString();

        intent.putExtra("txtT4", txtT4);

        setResult(RESULT_OK, intent);
        this.finish();
    }
}
