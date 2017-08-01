package com.sub.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Menu2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
    }


    public void onReturnButtonClicked(View v) {
        Toast.makeText(this, "돌아가자 버튼이 눌렸다!!!!", Toast.LENGTH_SHORT).show();
        finish();
    }
}
