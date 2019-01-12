package com.example.anuj.waste_miners;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ActionBar ab=getSupportActionBar();
        ab.hide();
        Thread my_thread=new Thread()
        {
            public void run()
            {
                try{
                    sleep(2000);
                    Intent i=new Intent(Splash_screen.this,SignUp.class);
                    startActivity(i);
                    finish();
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        my_thread.start();

    }
}
