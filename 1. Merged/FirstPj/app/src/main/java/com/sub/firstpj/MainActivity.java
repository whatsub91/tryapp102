package com.sub.firstpj;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButton1Clicked(View v) {
        RadioButton radioButton1 = (RadioButton) findViewById(R.id.radioButton_benz);
        boolean benz = radioButton1.isChecked();
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton_porsche);
        boolean porsche = radioButton2.isChecked();

        EditText userid = (EditText) findViewById(R.id.userid1);
        EditText userpw = (EditText) findViewById(R.id.userpw1);

        if (userid.getText().toString().equals("shs") && userpw.getText().toString().equals("1234") ) {
            if (benz) {
                Toast.makeText(this, "Your Dream Car Is a Benz !", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this, benz.class);
                startActivity(intent1);
            } else if (porsche) {
                Toast.makeText(this, "Your Dream Car Is a Porsche !", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, porsche.class);
                startActivity(intent2);
            }
        } else {
            Toast.makeText(this, "Wrong id or password",Toast.LENGTH_SHORT).show();
        }
    }

    public void onButton2Clicked(View v) {
        Toast.makeText(this, "sorry not available at the moment",Toast.LENGTH_SHORT).show();
    }

    public void onButton3Clicked(View v) {
        Toast.makeText(this, "나한테 할 말 있구나? 힛?", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }

}
