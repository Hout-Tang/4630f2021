package com.example.firstapp_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class S1_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          Button gsButton;
//        Button moveButton2;
//
          gsButton = findViewById(R.id.getStartButton);
//        moveButton2=findViewById(R.id.button2);
        gsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(S1_MainActivity.this, S2_menu.class);
                startActivity(intent);
            }
        });
//
//        moveButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(S1_MainActivity.this, ThirdScreen.class);
//                startActivity(intent);
//            }
//        });
    }
}