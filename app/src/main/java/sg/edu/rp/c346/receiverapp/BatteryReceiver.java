package sg.edu.rp.c346.receiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.widget.Toast;

public class BatteryReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast my_toast = Toast.makeText(context, "Low Battery", Toast.LENGTH_LONG);
        my_toast.show();

        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("5554", null, "Hello World", null, null);
    }
}
