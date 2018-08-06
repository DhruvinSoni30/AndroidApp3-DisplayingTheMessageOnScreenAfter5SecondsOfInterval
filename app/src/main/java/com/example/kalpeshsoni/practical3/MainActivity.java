package com.example.kalpeshsoni.practical3;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Chronometer t;
    int i = 0;
    int duration = 5;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = findViewById(R.id.chronometer);
        t1 = findViewById(R.id.textView2);
        t.start();
        t.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {

                t1.setText("Message will display after short period of time:");
                i++;

                if(i>=duration)
                {
                    Toast.makeText(getApplicationContext(),"This is Dhruvin Soni",Toast.LENGTH_SHORT).show();
                    duration = duration + 5;
                }
            }
        });
    }
}
