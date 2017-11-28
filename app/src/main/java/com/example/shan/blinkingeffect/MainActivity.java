package com.example.shan.blinkingeffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements Animation.AnimationListener

{

    TextView txtMessage;
    Button btnStart;

    // Animation
    Animation animBlink;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtMessage = (TextView) findViewById(R.id.s1);
        btnStart = (Button) findViewById(R.id.b1);

        // load the animation
        animBlink = AnimationUtils.loadAnimation(this,R.anim.blink);


        // set animation listener
        animBlink.setAnimationListener(this);

        // button click event
        btnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                txtMessage.setVisibility(View.VISIBLE);

                // start the animation
                txtMessage.startAnimation(animBlink);
            }
        });

    }

    @Override
    public void onAnimationEnd(Animation animation) {


    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

}






