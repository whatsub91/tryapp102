package com.example.sub.mybutton;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by sub on 17. 8. 3.
 */

public class BitmapButton extends AppCompatButton {
    public BitmapButton(Context context) {
        super(context);

        init(context);
    }

    public BitmapButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {
        setBackgroundResource(R.drawable.image2);

        float textSize = getResources().getDimension(R.dimen.text_size);
        setTextSize(textSize); //res - values - dimens 를 이용해서 사이즈 조절
        setTextColor(Color.WHITE);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        switch(action) {
            case MotionEvent.ACTION_DOWN:
                setBackgroundResource(R.drawable.image1);
                break;
            case MotionEvent.ACTION_UP:
                setBackgroundResource(R.drawable.image3);
                break;
        }
        invalidate();

        return true;
    }
}
