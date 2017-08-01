package com.sub.parcelable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent passedIntent = getIntent();
        processIntent(passedIntent);

    }

    private void processIntent(Intent intent) {
        if (intent != null) {
            ArrayList<String> names = (ArrayList<String>) intent.getSerializableExtra("names");
            if (names != null) {
                Toast.makeText(getApplicationContext(), "number of delivered name list : " + names.size(), Toast.LENGTH_LONG).show();
            }

            SimpleData data = (SimpleData) intent.getParcelableExtra("data");
            if (data!=null) {
                Toast.makeText(getApplicationContext(), "number of SimpleData : " + data.message, Toast.LENGTH_LONG).show();
            }
        }
    }
}

