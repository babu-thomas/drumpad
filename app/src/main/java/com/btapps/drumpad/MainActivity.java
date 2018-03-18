package com.btapps.drumpad;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool sp;
    private int sound0;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        sound0 = sp.load(getApplicationContext(), R.raw.sound0, 1);
        sound1 = sp.load(getApplicationContext(), R.raw.sound1, 1);
        sound2 = sp.load(getApplicationContext(), R.raw.sound2, 1);
        sound3 = sp.load(getApplicationContext(), R.raw.sound3, 1);
        sound4 = sp.load(getApplicationContext(), R.raw.sound4, 1);
        sound5 = sp.load(getApplicationContext(), R.raw.sound5, 1);
        sound6 = sp.load(getApplicationContext(), R.raw.sound6, 1);
        sound7 = sp.load(getApplicationContext(), R.raw.sound7, 1);
        sound8 = sp.load(getApplicationContext(), R.raw.sound8, 1);
    }

    public void playSound(View view) {
        switch(view.getId()) {
            case R.id.button0:
                sp.play(sound0, 1.0f, 1.0f, 0,0, 1.0f);
                break;
            case R.id.button1:
                sp.play(sound1, 1.0f, 1.0f, 0,0, 1.0f);
                break;
            case R.id.button2:
                sp.play(sound2, 1.0f, 1.0f, 0,0, 1.0f);
                break;
            case R.id.button3:
                sp.play(sound3, 1.0f, 1.0f, 0,0, 1.0f);
                break;
            case R.id.button4:
                sp.play(sound4, 1.0f, 1.0f, 0,0, 1.0f);
                break;
            case R.id.button5:
                sp.play(sound5, 1.0f, 1.0f, 0,0, 1.0f);
                break;
            case R.id.button6:
                sp.play(sound6, 1.0f, 1.0f, 0,0, 1.0f);
                break;
            case R.id.button7:
                sp.play(sound7, 1.0f, 1.0f, 0,0, 1.0f);
                break;
            case R.id.button8:
                sp.play(sound8, 1.0f, 1.0f, 0,0, 1.0f);
                break;
        }
    }
}
