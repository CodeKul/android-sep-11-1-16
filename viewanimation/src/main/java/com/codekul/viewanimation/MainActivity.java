package com.codekul.viewanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(R.id.btnMixed).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateHulk(R.anim.mixed);
            }
        });

        findViewById(R.id.btnRotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateHulk(R.anim.rotate);
            }
        });
    }

    private void animateHulk(int animation){
        findViewById(R.id.imageView)
                .startAnimation(AnimationUtils
                        .loadAnimation(this,animation));
    }
}
