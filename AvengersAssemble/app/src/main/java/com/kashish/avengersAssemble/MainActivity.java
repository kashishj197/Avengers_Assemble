package com.kashish.avengersAssemble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void avengersAssemble(View view) {
        ImageView image = (ImageView) findViewById(R.id.avengerImageView);
        image.setImageResource(R.drawable.avengers_2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}