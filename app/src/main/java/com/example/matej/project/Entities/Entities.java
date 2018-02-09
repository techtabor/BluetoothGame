package com.example.matej.project.Entities;

import android.graphics.Canvas;

/**
 * Created by matej on 1/9/2018.
 */

public abstract class Entities  {
    float x, y, r;
    private boolean dead = false;
    private boolean vege = false;
    public boolean uj = false;
    public boolean asd = false;

    public Entities(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public boolean isDead() {
        return dead;

    }

    public void kill() {
        dead = true;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public boolean endgame(){
        return vege;
    }
    public void end(){
        vege = true;
    }
    public boolean ujvirag(){
        return uj;
    }
    public void plusz1(){
        uj = true;
    }

    public abstract void collison(Entities other);

    public abstract void update();

    public abstract void render(Canvas canvas);

    public float getDistanceSquare(Entities other) {
        float dx = other.x - x;
        float dy = other.y - y;
        return dx * dx + dy * dy;
    }
    public boolean isColliding(Entities other) {
        return getDistanceSquare(other) <= (other.r + this.r) * (other.r + this.r);
    }
    public float getR() {
        return r;
    }
}
