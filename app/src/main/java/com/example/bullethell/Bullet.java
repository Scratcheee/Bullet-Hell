package com.example.bullethell;

import android.graphics.Rect;
import android.graphics.RectF;

class Bullet {

    // A RectF to represent the size and location of the bullet
    private RectF mRect;

    // The speed of the bullet
    private float mXVelocity;
    private float mYVelocity;

    // the size of the bullet
    private float mWidth;
    private float mHeight;


    // The constructor
    Bullet (int screenX){

        // Configure the bullet based on the screen width in pixels
        mWidth = screenX / 100;
        mHeight = screenX / 100;
        mRect = new RectF();
        mYVelocity = (screenX / 5);
        mXVelocity = (screenX / 5);
    }

    // Return a reference to the RectF
    RectF getRect(){
        return mRect;
    }

    // Move the bullet based on the speed and the frame rate
    void update(long fps) {
        // Update the left and top coordinates based on the velocity and current frame rate
        mRect.left = mRect.left + (mXVelocity / fps);
        mRect.top = mRect.top + (mYVelocity / fps);
        mRect.right = mRect.left + mWidth;
        mRect.bottom = mRect.top - mHeight;
    }

    // Reverse the bullets vertical direction
    void reverseYVelocity(){
        mYVelocity = -mYVelocity;
    }

    // Reverse the bullets horizontal direction
    void reverseXVelocity(){
        mXVelocity = -mXVelocity;
    }

    // Spawn a new bullet
    void spawn(int pX, int pY, int vX, int vY){
        // Spawn the bullet at the location passed in as parameters
        mRect.left = pX;
        mRect.top = pY;
        mRect.right = pX + mWidth;
        mRect.bottom = pY + mHeight;

        // Head away from the player
        mXVelocity = mXVelocity * vX;
        mYVelocity = mYVelocity * vY;
    }
}
