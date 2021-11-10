package com.example.news_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NewsDetailActivity extends AppCompatActivity {

    //Step14: getting data inside NewsDetailActivity
    //Step15: create variable
    String title,desc,content,imageURL,url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        //Step16: getting Data into the NewsDetailActivity by getStringExtra and fill in their names
        //                                      key is from NewsRVAdapter class, which we put putExtra
        title = getIntent().getStringExtra("title");
        desc  = getIntent().getStringExtra("desc");
        content = getIntent().getStringExtra("content");
        imageURL = getIntent().getStringExtra("image");
        url = getIntent().getStringExtra("url");

        //step17: work on the categoryRVAdapter
    }
}