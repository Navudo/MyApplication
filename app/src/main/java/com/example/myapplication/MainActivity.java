package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a reference to the button btnActivity2
        Button btnOpenActivity2 = findViewById(R.id.btnActivity2);
        btnOpenActivity2.setOnClickListener(this);

        Button btnOpenActivity3 = findViewById(R.id.btnActivity3);
        btnOpenActivity3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if(R.id.btnActivity2 == id){
            //open activity2
            Intent intent = new Intent(this,Activity2.class);
            startActivity(intent);

        }else if(R.id.btnActivity3 == id){
            Intent intent = new Intent(this,Activity3.class);
            startActivity(intent);
        }
    }
}
