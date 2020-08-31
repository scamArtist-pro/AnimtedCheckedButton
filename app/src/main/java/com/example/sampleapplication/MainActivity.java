package com.example.sampleapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageView;
    private AnimatedVectorDrawableCompat avdc;
    private AnimatedVectorDrawable avd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Drawable drawable = imageView.getDrawable();

                if(drawable instanceof AnimatedVectorDrawable){
                    avd = (AnimatedVectorDrawable) drawable;
                    avd.start();
                }
                else if(drawable instanceof AnimatedVectorDrawableCompat) {
                    avdc = (AnimatedVectorDrawableCompat) drawable;
                    avdc.start();
                }
            }
        });
    }
}