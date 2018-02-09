package com.example.matej.project.Entities;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import com.example.matej.project.Game;

/**
 * Created by matej on 1/9/2018.
 */

public class Bullet extends Entities {
    Paint paint = new Paint();



    public Bullet(float x, float y) {
        super(x, y);
        paint.setColor(Color.RED);
        r = 130;

    }

    public void collison(Entities other) {



    }


    @Override
    public void update() {



    }

    @Override
    public void render(Canvas canvas) {
        //Game.flower.draw(canvas, new Rect((int) (x-r), (int)( y-r), (int) (x + r), (int) (y + r)), paint);

    }
}
