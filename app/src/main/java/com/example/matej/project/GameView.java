package com.example.matej.project;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/**
 * Created by matej on 1/9/2018.
 */

public class GameView extends SurfaceView implements SurfaceHolder.Callback, View.OnTouchListener {


    private final SurfaceHolder surfaceHolder;

    Game game;

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);

        surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);

        setFocusable(true);
        setOnTouchListener(this);

        game = new Game(context, surfaceHolder);

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

        game.width = width;
        game.height = height;

        game.start();


    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return game.onTouch(event);

    }
}
