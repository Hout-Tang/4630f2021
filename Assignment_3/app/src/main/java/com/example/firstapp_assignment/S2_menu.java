package com.example.firstapp_assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class S2_menu extends AppCompatActivity implements View.OnClickListener{

    public CardView card1,card2,card3,card4,card5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2_menu);


        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);
        card3 = (CardView) findViewById(R.id.c3);
        card4 = (CardView) findViewById(R.id.c4);
        card5 = (CardView) findViewById(R.id.c5);

        //assign onClicklisterner to carview
        //use Ctr+D to copy the code
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //Intent will use to go from one Activity to another Activity
        Intent i;

        //switch statement to determine which card get click
        switch (view.getId()){
            case R.id.c1:
                i = new Intent(this,S3_weather.class);
                startActivity(i);
                break;
            case R.id.c2:
                i = new Intent(this,S4_Fact.class);
                startActivity(i);
                break;
            case R.id.c3:
                i = new Intent(this,S5_Investment.class);
                startActivity(i);
                break;
            case R.id.c4:
                i = new Intent(this,S6_resume.class);
                startActivity(i);
                break;
            case R.id.c5:
                i = new Intent(this,S7_aboutMe.class);
                startActivity(i);
                break;
        }
    }
}