package com.example.sub.w_i_learn;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        editText = (EditText) findViewById(R.id.editText);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String receiver = editText.getText().toString();

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + receiver));
                startActivity(intent);


                //Intent intent2 = new Intent();
                //ComponentName name = new ComponentName("com.sub.myintent", "com.sub.myintent.MenuActivity");
                //intent2.setComponent(name);
                //startActivity(intent2);
            }
        });
    }
}
