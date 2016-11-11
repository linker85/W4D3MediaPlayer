package com.example.com.w4d4homeworkmediaplayer;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            mediaPlayer = MediaPlayer.create(this,
                    Uri.parse(Environment.getExternalStorageDirectory().getPath() + "/Music/fan.mp3"));
            mediaPlayer.setLooping(true);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void stop(View view) {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
    }

    public void play(View view) {
        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }
    }
}
