package com.iraoui.gameflappybird;

/**
 * Created by IRAOUI on 05/11/2018.
 */

public class BackgroundImage {
    private int backgroundX, backgroundY, backgroundImageVelocity;

    public BackgroundImage(){
        backgroundX = 0;
        backgroundY = 0;
        backgroundImageVelocity = 3;
    }

    public int getBackgroundX() {
        return backgroundX;
    }

    public int getBackgroundY() {
        return backgroundY;
    }

    public void setBackgroundX(int backgroundX) {
        this.backgroundX = backgroundX;
    }

    public void setBackgroundY(int backgroundY) {
        this.backgroundY = backgroundY;
    }

    public int getBackgroundImageVelocity() {
        return backgroundImageVelocity;
    }

}
