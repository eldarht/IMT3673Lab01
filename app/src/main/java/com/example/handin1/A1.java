package com.example.handin1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class A1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
    }

    public void startA2(View view){

        Intent intent = new Intent(this, A2.class);

        EditText A1 = findViewById(R.id.A1);

        startActivity(intent);
    }
}
