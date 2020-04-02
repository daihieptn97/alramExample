package com.hiep.alarmexample;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

import java.util.Calendar;

import static android.content.Context.ALARM_SERVICE;

public class MyAlarm extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        int a = intent.getIntExtra(Intent.EXTRA_ALARM_COUNT, -1);

        if (a != -1) {
            Log.d("MyAlarmBelal", "Alarm just fired: " + a);
//
//            AlarmManager alarmManager = (AlarmManager) context.getSystemService(ALARM_SERVICE);
//            Calendar calendar = Calendar.getInstance();
//
//            calendar.add(Calendar.MINUTE, 1);
//            Intent i = new Intent("android.action.DISPLAY_NOTIFICATION");
//            i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
//
//            PendingIntent broadcast = PendingIntent.getBroadcast(context, 100, intent, PendingIntent.FLAG_CANCEL_CURRENT);
//            alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), broadcast);
        }


//        MediaPlayer mediaPlayer = MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI);
//        mediaPlayer.start();
    }
}
