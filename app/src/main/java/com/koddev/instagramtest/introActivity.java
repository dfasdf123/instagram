package com.koddev.instagramtest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.FirebaseAppCheck;
import com.google.firebase.appcheck.debug.DebugAppCheckProviderFactory;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class introActivity extends AppCompatActivity {

    Animation ani;

    ImageView intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        intro = (ImageView) findViewById(R.id.intro);
        ani = AnimationUtils.loadAnimation(this,R.anim.alpha);




        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run()
            {
                Intent intent = new Intent(introActivity.this,StartActivity.class);
                startActivity(intent);
            }
        },2000);
    }
}
