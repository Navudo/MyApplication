package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //get references to checkboxes
        final CheckBox chkFifty = findViewById(R.id.chkFifty);
        final CheckBox chkTwentyFive = findViewById(R.id.chkTwentyFive);
        final CheckBox chkTen = findViewById(R.id.chkTen);
        final CheckBox chkFive = findViewById(R.id.chkFiv);

        //add onclick event using anonymous class
        Button btnProcess = findViewById(R.id.btnAct2Process);
        btnProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int points = 0;
                if(chkFifty.isChecked())
                    points+=50;
                if(chkTwentyFive.isChecked())
                    points+=25;
                if(chkTen.isChecked())
                    points+=10;
                if(chkFive.isChecked())
                    points+=5;

                //display in a Toast
                Toast.makeText(getApplicationContext(),
                        "points: "+ points,
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
