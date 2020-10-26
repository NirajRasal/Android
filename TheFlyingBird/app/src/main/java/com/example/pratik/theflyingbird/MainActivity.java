package com.example.pratik.theflyingbird;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {

    public GameView gameView;
    private Handler handler = new Handler();
    private final static long TIMER_INTERVAL = 30;
    ImageButton stbtn;
    ImageButton ImageButton2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stbtn=(ImageButton)findViewById(R.id.stbtn);
        stbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameView = new GameView(getApplicationContext());
                setContentView(gameView);

                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                gameView.invalidate();
                            }
                        });
                    }
                }, 0, TIMER_INTERVAL);
            }
        });
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            ImageButton2=(ImageButton)findViewById(R.id.imageButton2);
            ImageButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    gameView = new GameView(getApplicationContext());
                    setContentView(gameView);


                }
}