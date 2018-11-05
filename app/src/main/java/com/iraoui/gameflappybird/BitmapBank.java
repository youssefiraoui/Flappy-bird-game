package com.iraoui.gameflappybird;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by IRAOUI on 05/11/2018.
 */

public class BitmapBank {

    private Bitmap background;

    public BitmapBank(Resources res)
    {
        background = BitmapFactory.decodeResource(res, R.drawable.backg);
//        background = scaleImage(background);
    }

    public Bitmap getBackground()
    {
        return background;
    }

    public int getBackgroundWidth()
    {
        return background.getWidth();
    }

    public int getBackgroundHeight()
    {
        return background.getHeight();
    }
   /* public Bitmap scaleImage(Bitmap bitmap)
    {
        float widthHeightRatio = getBackgroundWidth() / getBackgroundHeight();
        /*
        We'll multiply widthHeightRatio wwith scrrenHeight to get scaled width of the bitmap.
        then we'll call getScaledBitmap() to create a new bitmap , scaled from an existing bitmap
         */
        /*int backgroundScaledWidth = (int) widthHeightRatio * AppConstants.SCREEN_WIDTH ;
        return Bitmap.createScaledBitmap(bitmap, backgroundScaledWidth, AppConstants.SCREEN_HEIGHT, false);
    }*/
}
