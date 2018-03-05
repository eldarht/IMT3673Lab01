package com.example.handin1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class A1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);

        // Supply values to the spinner
        Spinner spnL1 = findViewById(R.id.L1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spnL1, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spnL1.setAdapter(adapter);

        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);

        int intSaved = sharedPref.getInt("spnL1Selected", -1);

        if (intSaved != -1){
            spnL1.setSelection(intSaved);
        }

        spnL1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                // Save selected to shared preferences
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();

                editor.putInt("spnL1Selected", i);
                editor.commit();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Log.v("Debug", "selected nothing");
            }
        });

    }

    public void startA2(View view){

        Intent intent = new Intent(this, A2.class);

        EditText edtT1 = findViewById(R.id.T1);
        String txtT1 = edtT1.getText().toString();

        intent.putExtra("txtT1", txtT1);
        startActivity(intent);
    }

}
