package com.codekul.simpleapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by aniruddha on 13/9/16.
 */
public class MyView extends TextView {

    private Paint paint;
    private float cx, cy, radius;

    public MyView(Context context) {
        super(context);
        initPaint();
    }

    public MyView(Context context, AttributeSet set) {
        super(context,set);
        initPaint();
    }

    private void initPaint(){
        paint = new Paint();
        paint.setColor(Color.RED);
    }

    public void changeAttrs(float cx, float cy, float radius){
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(cx,cy,radius,paint);
    }
}
