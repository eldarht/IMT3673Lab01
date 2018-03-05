package com.example.handin1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class A2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);

        Intent intent = getIntent();
        String txtT1 = intent.getStringExtra("txtT1");

        TextView T2 = findViewById(R.id.T2);
        T2.setText("Hello " + txtT1);
    }

    protected void startA3(View view){

        Intent intent = new Intent(this, A3.class);
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int requestStatus, Intent intent){

        if (requestCode == 1 ){

            if(requestStatus == RESULT_OK) {

                String txtT4 = intent.getStringExtra("txtT4");

                TextView txtT3 = findViewById(R.id.T3);

                txtT3.setText(txtT4 + " From A3");

            }else{
                Log.v("Debug", "result !ok");
            }
        }
    }
}
