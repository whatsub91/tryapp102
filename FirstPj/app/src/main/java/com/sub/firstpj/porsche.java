package com.sub.firstpj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;



public class porsche extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity
                _porsche);
    }

    /*
    public void visibility(int i) {

        for(int i, i<2,i++) {
                    }
    }
    */

    public void onButton1Clicked(View v) {
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);

        count += 1 ;

        if (count > 1) {
            count = 0;
        }


        if (count == 0) {
            imageView1.setVisibility(imageView1.VISIBLE);
            imageView2.setVisibility(imageView2.INVISIBLE);
        } else {
            imageView1.setVisibility(imageView1.INVISIBLE);
            imageView2.setVisibility(imageView2.VISIBLE);
        }

    }
}