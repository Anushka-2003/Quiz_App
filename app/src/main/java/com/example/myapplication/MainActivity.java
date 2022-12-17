package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();

        Button btn = (Button)findViewById(R.id.button);
        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        Toast ts = Toast.makeText(context,"Please select an option.",Toast.LENGTH_SHORT);
        int n = rg.getCheckedRadioButtonId();


            // one of the radio buttons is checked
            btn.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    }

            });
        }

    }
