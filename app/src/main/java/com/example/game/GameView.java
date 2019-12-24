package com.example.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.Objects;


public class GameView extends View {


    private Bitmap bitmap;

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    private float posX=400, posY = 400;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("Game", "onDraw:" + getHeight() + "," + getWidth());

        Paint paint = new Paint();
        canvas.drawLine(100, 0, 100, 1500, paint);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cat);
        canvas.drawBitmap(bitmap,posX,posY,paint);
    }
    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        if(posX>0 &&posX<getWidth()-bitmap.getWidth()){
            this.posX = posX;
        }

    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        if(posY>0 && posY<getHeight()-bitmap.getHeight()){
            this.posY = posY;
        }

    }
}

