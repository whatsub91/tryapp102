package com.example.sub.w_i_learn;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = "MyService";

    public MyService() {
    }


    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "onCreate() called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand() called");

        if (intent == null) {
            return Service.START_STICKY;
        } else {
            processCommand(intent);
        }

        return super.onStartCommand(intent, flags, startId);

    }

    private void processCommand(Intent intent) {
        String command = intent.getStringExtra("command");
        String name = intent.getStringExtra("name");

        Log.d(TAG, "received data : " + command + ", " + name);
        try {
            Thread.sleep(500);
        } catch (Exception e) {}

        Intent showIntent = new Intent(getApplicationContext(), ServiceActivity.class);
        showIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|
                Intent.FLAG_ACTIVITY_SINGLE_TOP|
                Intent.FLAG_ACTIVITY_CLEAR_TOP);
        //화면이 존재하지 않을때 띄을 수 있게 flag 를 이렇게 설정해줌

        showIntent.putExtra("command", "show");
        showIntent.putExtra("name", name + "from service.");
        startActivity(showIntent);
    }



    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
