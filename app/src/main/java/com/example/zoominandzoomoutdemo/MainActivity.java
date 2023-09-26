package com.example.zoominandzoomoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startzoomin(View view) {

        ImageView img1=findViewById(R.id.img1);
        Animation animation=AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        img1.startAnimation(animation);


    }

    public void startzoomout(View view) {
        ImageView img1=findViewById(R.id.img1);
        Animation animation=AnimationUtils.loadAnimation(this,R.anim.zoom_out);
        img1.startAnimation(animation);
    }

    public void ScaleOut(View view) {
        ImageView img1=findViewById(R.id.img1);
        Animation animation=AnimationUtils.loadAnimation(this,R.anim.scaleout);
        img1.startAnimation(animation);

    }

    public void ScaleIN(View view) {
        ImageView img1=findViewById(R.id.img1);
        Animation animation=AnimationUtils.loadAnimation(this,R.anim.scalein);
        img1.startAnimation(animation);

    }
}