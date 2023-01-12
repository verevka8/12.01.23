package com.example.myapplication;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        Log.d("qqqqq", Integer.toString(getHeight()));
        Rect rect = new Rect(0, getHeight() - getHeight() / 4, getWidth(), getHeight());
        canvas.drawRect(rect, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(getWidth() / 24, getHeight() / 27, 100, paint);
        paint.setStrokeWidth(3);
        for (int x = getWidth() / 24; x < getWidth()/3;x+=100){
            for (int y = getHeight()/6; y > getHeight()/ 27; y-=100) {
                canvas.drawLine(getWidth() / 18, getHeight() / 27, getWidth() / 18 + x, getHeight() / 27 + y, paint);
            }
        }
        paint.setColor(Color.rgb(128,64,48));
        Rect rect1 = new Rect(getWidth()/14, getHeight() - getHeight() / 2 + getHeight()/10, getWidth()/2, getHeight() - getHeight()/8);
        canvas.drawRect(rect1, paint);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        Path p = new Path();
        p.moveTo(getWidth()/14,getHeight() - getHeight() / 2 + getHeight()/10);
        p.lineTo((getWidth()/14 + getWidth()/2)/2,getHeight()/2 - getHeight()/15);
        p.lineTo(getWidth()/2,getHeight() - getHeight() / 2 + getHeight()/10);
        p.lineTo(getWidth()/2,getHeight() - getHeight() / 2 + getHeight()/10);
        canvas.drawPath(p,paint);
        paint.setColor(Color.BLACK);
        canvas.drawLine(getWidth()/14,getHeight() - getHeight() / 2 + getHeight()/10,getWidth()/2,getHeight() - getHeight() / 2 + getHeight()/10,paint);
        RectF r = new RectF(getWidth()/2 + getWidth()/10,getHeight() - getHeight() / 2 + getHeight()/10);



    }
}