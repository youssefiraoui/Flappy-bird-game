package com.iraoui.gameflappybird;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by IRAOUI on 05/11/2018.
 */

public class AppConstants {
    static BitmapBank bitmapBank;
    static GameEngine gameEngine;
    static int SCREEN_WIDTH;
    static int SCREEN_HEIGHT;

    public static void initialization(Context context)
    {
        bitmapBank = new BitmapBank(context.getResources());
        gameEngine = new GameEngine();
        setScreenSize(context);
    }

    public static BitmapBank getBitmapBank() {
        return bitmapBank;
    }

    public static void setBitmapBank(BitmapBank bitmapBank) {
        AppConstants.bitmapBank = bitmapBank;
    }

    public static GameEngine getGameEngine() {
        return gameEngine;
    }

    public static void setGameEngine(GameEngine gameEngine) {
        AppConstants.gameEngine = gameEngine;
    }

    private static void setScreenSize( Context context)
    {
        WindowManager windowManager =  (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        int width = metrics.widthPixels;
        int height = metrics.heightPixels;
        AppConstants.SCREEN_WIDTH = width;
        AppConstants.SCREEN_HEIGHT = height;
    }
}
