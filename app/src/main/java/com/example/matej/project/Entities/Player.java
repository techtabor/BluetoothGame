package com.example.matej.project.Entities;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import com.example.matej.project.Game;

/**
 * Created by matej on 1/9/2018.
 */

public class Player extends Entities {
    public float newX, newY;
    Paint paint = new Paint();
    public int pont= 0;

    public Player(float x, float y) {
        super(x, y);
        newX = x;
        newY = y;
        r = 90;
        paint.setColor(Color.GREEN);
    }

    @Override
    public void collison(Entities other) {
        if (other instanceof Bullet) {
            other.kill();
            plusz1();
        }
        if (other instanceof Enemy) {
            kill();
            end();
        }
        if(uj = true){
            pont += 1;
        }
    }


    @Override
    public void update() {
        float dx = newX - x;
        float dy = newY - y;

        x += dx / 30;
        y += dy / 30;

    }

    @Override
    public void render(Canvas canvas) {


        Game.playe.draw(canvas, new Rect((int) (x-r), (int)( y-r), (int) (x + r), (int) (y + r)), paint);

        /*if (){
            Game.bee2.draw(canvas, new Rect((int) (x-r), (int)( y-r), (int) (x + r), (int) (y + r)), paint);
        }
        if (settings.hanyasbee==3){
            Game.bee3.draw(canvas, new Rect((int) (x-r), (int)( y-r), (int) (x + r), (int) (y + r)), paint);
        }
        if (settings.hanyasbee==4){
            Game.bee4.draw(canvas, new Rect((int) (x-r), (int)( y-r), (int) (x + r), (int) (y + r)), paint);
        }*/

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

}

