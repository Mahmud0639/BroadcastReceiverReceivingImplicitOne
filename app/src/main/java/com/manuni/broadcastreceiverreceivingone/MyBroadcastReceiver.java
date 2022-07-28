package com.manuni.broadcastreceiverreceivingone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("com.manuni.ACTION_SEND".equals(intent.getAction())){
           String messageBroadcast = intent.getStringExtra("com.manuni.EXTRA_BROADCAST_MESSAGE");
            Toast.makeText(context, "BroadCast is : "+messageBroadcast, Toast.LENGTH_SHORT).show();
        }
    }
}
