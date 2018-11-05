package com.iraoui.gameflappybird;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by IRAOUI on 05/11/2018.
 */

public class GameView extends SurfaceView implements SurfaceHolder.Callback {

    GameThread gameThread;
    public GameView(Context context)
    {
        super(context);
        initView();

    }
    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if(!gameThread.isRunning())
        {
            gameThread = new GameThread(surfaceHolder);
            gameThread.start();
        }else
        {
            gameThread.start();
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
if (gameThread.isRunning())
{
    gameThread.setIsRunning(false);
    boolean retry = true;
    while (retry){
        try {
            gameThread.join();
            retry = false;
        }catch (InterruptedException r)
        {

        }
    }
}
    }

    public void initView()
    {
        SurfaceHolder holder = getHolder();
        holder.addCallback(this);
        setFocusable(true);
        gameThread = new GameThread(holder);

    }
}
