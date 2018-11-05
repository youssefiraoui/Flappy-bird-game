package com.iraoui.gameflappybird;

import android.graphics.Canvas;

/**
 * Created by IRAOUI on 05/11/2018.
 */

public class GameEngine {
    BackgroundImage backgroundImage;
    public GameEngine()
    {
        backgroundImage = new BackgroundImage();
    }

    public void updateAndDrawBackgroundImage(Canvas canvas)
    {
        backgroundImage.setBackgroundX(backgroundImage.getBackgroundY() - backgroundImage.getBackgroundImageVelocity());
        if (backgroundImage.getBackgroundX() < -AppConstants.getBitmapBank().getBackgroundWidth())
        {
            backgroundImage.setBackgroundX(0);
        }
        canvas.drawBitmap(AppConstants.getBitmapBank().getBackground(),
                backgroundImage.getBackgroundX(),
                backgroundImage.getBackgroundY(),
                null);
        if (backgroundImage.getBackgroundX() < -AppConstants.getBitmapBank().getBackgroundWidth() - AppConstants.SCREEN_WIDTH)
        {
            canvas.drawBitmap(AppConstants.getBitmapBank().getBackground(),
                    backgroundImage.getBackgroundX() + AppConstants.getBitmapBank().getBackgroundWidth(),
                    backgroundImage.getBackgroundY(), null);
        }
    }
}

