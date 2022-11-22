package com.example.checkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class home_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        ImageButton ethiopia = findViewById(R.id.eth_btn);

        ethiopia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ethiopian_version.class);
                startActivity(i);
            }
        });



        ImageButton america = findViewById(R.id.usa);

        america.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), american_version.class);
                startActivity(i);
            }
        });


        Button background = findViewById(R.id.btn1);

        background.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               background.setBackgroundColor(Color.RED);
            }
        });



    }
}