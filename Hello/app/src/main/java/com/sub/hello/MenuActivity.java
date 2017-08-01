package com.sub.hello;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onBackButtonClicked(View v) {
        Toast.makeText(this, "return button is clicked.", Toast.LENGTH_SHORT).show();

        finish();

    }


    public void onGetinButtonClicked(View v) {
        Toast.makeText(this, "Getting in hell yeah!.", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent (this, Menu2Activity.class);
        startActivity(intent);

    }
}
