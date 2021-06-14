package com.example.audio_play;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnstart,btnplay,btnstop;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstart=findViewById(R.id.startcall);
        btnplay=findViewById(R.id.play);
        btnstop=findViewById(R.id.stopcll);

        mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.ram);

        btnstart.setOnClickListener(this);
        btnplay.setOnClickListener(this);
        btnstop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.startcall:
                mediaPlayer.start();
                break;

            case R.id.play:
                mediaPlayer.pause();
                break;

            case R.id.stopcll:
                mediaPlayer.stop();
                break;
        }

    }
}