#new changes made by Pinal Shah

package com.example.first;
import android.app.Activity;
#some new changes I am amking

import android.graphics.drawable.AnimationDrawable;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable androidAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView androidImage = findViewById(R.id.android);
        androidImage.setBackgroundResource(R.drawable.android_animate);
        androidAnimation = (AnimationDrawable) androidImage.getBackground();
        final Button btnAnimate = (Button) findViewById(R.id.animate);
        View.OnClickListener ocl;
        ocl = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                androidAnimation.stop();
                androidAnimation.start();
            }
        };
        btnAnimate.setOnClickListener(ocl);
    }

}
