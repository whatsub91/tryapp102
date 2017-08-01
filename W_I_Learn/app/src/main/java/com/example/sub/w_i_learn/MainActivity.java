package com.example.sub.w_i_learn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked1 (View v) {
        Toast.makeText(this, "Calculator button is pressed", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent (this, CalculatorActivity.class);
        startActivity(intent);
    }

    public void onButtonClicked2 (View v) {
        Toast.makeText(this, "List button is pressed", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent (this, ListActivity.class);
        startActivity(intent);
    }

    public void onButtonClicked3 (View v) {
        Toast.makeText(this, "call", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent (this, CallActivity.class);
        startActivity(intent);
    }

    public void onButtonClicked4 (View v) {
        Toast.makeText(this, "Dialog", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent (this, DialogActivity.class);
        startActivity(intent);
    }

    public void onButtonClicked5 (View v) {
        Toast.makeText(this, "First Mini Project", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent (this, FirstPjActivity.class);
        startActivity(intent);
    }
    public void onButtonClicked6 (View v) {
        Toast.makeText(this, "Email / call", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent (this, EmailActivity.class);
        startActivity(intent);
    }
    public void onButtonClicked7 (View v) {
        Toast.makeText(this, "Event", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent (this, EventActivity.class);
        startActivity(intent);
    }
    public void onButtonClicked8 (View v) {
        Toast.makeText(this, "Widget", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent (this, WidgetActivity.class);
        startActivity(intent);
    }
    public void onButtonClicked9 (View v) {
        Toast.makeText(this, "Service", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent (this, ServiceActivity.class);
        startActivity(intent);
    }


}
