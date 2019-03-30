package com.example.boradcastreceiver02;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "recieved in MyBroadcastTeceiver", Toast.LENGTH_LONG).show();
        System.out.println("recieved in MyBroadcastTeceiver");
    }
}
