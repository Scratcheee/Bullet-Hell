package com.example.bullethell;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;

public class MainActivity extends AppCompatActivity {

    //An instance of the main class of this project
    private BulletHellGame mBHGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the screen resolution
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point ();
        display.getSize(size);

        // Call the constructor (initialize)
        // the BulletHellGame instance
        mBHGame = new BulletHellGame(this, size.x, size.y);
        setContentView(mBHGame);
    }

    @Override
    // Start the main game thread when the game is launched
    protected void onResume(){
        super.onResume();

        mBHGame.resume();
    }

    @Override
    // Stop the thread when the player quits
    protected void onPause(){
        super.onPause();

        mBHGame.pause();

    }
}
