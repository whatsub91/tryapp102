package com.example.sub.w_i_learn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;

public class WidgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);


        RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton0);
        boolean checked = radioButton.isChecked();


    }
}
