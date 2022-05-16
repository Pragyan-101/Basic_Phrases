package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playPhrase(View view) {
        Button buttonPressed = (Button) view; // this is used to get the particular button which is pressed since all have the same on click function
        MediaPlayer mediaPlayer = MediaPlayer.create(this,getResources().getIdentifier(buttonPressed.getTag().toString(),"raw",getPackageName()));
        //tags of all buttons were set to name so that it could be used directly to call the audio
        //generally MediaPlayer.create takes name of the audio directly for res but since we are using the variable buttonpressed.getTag.tostring, it was called in this way
        //buttonPressed.getTag().toString() will give the tag name in string but since the tag name is same as audio hence it will directly catch the audio with that name from res
        mediaPlayer.start();
    }
}