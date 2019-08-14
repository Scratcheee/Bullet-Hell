package com.example.bullethell;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.SoundPool;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

class BulletHellGame extends SurfaceView implements Runnable {

    // Debugging
    boolean mDebugging = true;

    // Objects for the game loop/thread
    private Thread mGameThread = null;
    private volatile boolean mPlaying;
    private boolean mPaused = true;

    // Objects for drawing
    private SurfaceHolder mOurHolder;
    private Canvas mCanvas;
    private Paint mPaint;

    // Keep track of the frame rate
    private long mFPS;
    // The number of milliseconds in a second
    private final int MILLIS_IN_SECOND = 1000;

    // Holds the resolution of the screen
    private int mScreenX;
    private int mScreenY;

    // Text size
    private int mFontSize;
    private int mFontMargin;

    // Sound variables
    private SoundPool mSP;
    private int mBeepID = -1;
    private int mTeleportID = -1;

}
