package com.iraoui.gameflappybird;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;

/**
 * Created by IRAOUI on 05/11/2018.
 */

public class GameThread extends Thread{
    SurfaceHolder surfaceHolder;
    boolean isRunning;
    long startTime,loopTime;
    long DELAY = 33;
    public GameThread (SurfaceHolder  holder){
        surfaceHolder = holder;
        isRunning = true;
    }
    public void run()
    {
        while (isRunning)
        {
            startTime = SystemClock.uptimeMillis();

            Canvas canvas = surfaceHolder.lockCanvas(null);
            if (canvas != null)
            {
                synchronized (surfaceHolder)
                {
                    AppConstants.getGameEngine().updateAndDrawBackgroundImage(canvas);
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
            loopTime = SystemClock.uptimeMillis() - startTime;
                if (loopTime < DELAY)
                {
                    try {
                        Thread.sleep(DELAY - loopTime);
                    }catch (InterruptedException e)
                    {
                    }
                }
        }
    }

    public boolean isRunning()
    {
        return isRunning;
    }

    //Sets the thread state , false = stopped

    public void setIsRunning(Boolean state)
    {
        isRunning = state;
    }
}
