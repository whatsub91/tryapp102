package com.example.sub.mysliding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout page;
    Animation translateLeft;
    Animation translateright;
    Button button;
    boolean isPageOpen=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        page = (LinearLayout) findViewById(R.id.page);

        translateLeft = AnimationUtils.loadAnimation(this,R.anim.translate_left);
        translateright = AnimationUtils.loadAnimation(this,R.anim.translate_right);

        SlidingAnimationListener listener = new SlidingAnimationListener();
        translateLeft.setAnimationListener(listener);
        translateright.setAnimationListener(listener);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPageOpen) {
                    page.startAnimation(translateright);
                } else {
                    page.setVisibility(view.VISIBLE);
                    page.startAnimation(translateLeft);
                }



            }
        });

    }

    class SlidingAnimationListener implements Animation.AnimationListener {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            if(isPageOpen) {
                page.setVisibility(View.INVISIBLE);
                button.setText("open");
                isPageOpen = false;
            } else {
                button.setText("close");
                isPageOpen=true;
            }
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    }
}
