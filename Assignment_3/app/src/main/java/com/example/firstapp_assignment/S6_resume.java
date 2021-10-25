package com.example.firstapp_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class S6_resume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s6_resume);

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("cv.pdf").load();
    }
}