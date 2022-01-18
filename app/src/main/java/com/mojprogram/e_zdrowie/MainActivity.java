package com.mojprogram.e_zdrowie;

import static com.mojprogram.e_zdrowie.R.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String CHANNEL_ID = "E-Health Notification" ;
    public static final long DELAY_TIME_FOR_NOTIFICATION_8H = 2000;//  8 * 60 * 60 *1000; //- 8h, 2  sec for example recoding purpose
    public static final long DELAY_TIME_FOR_NOTIFICATION_24H = 4000; // 24 * 60 * 60 *1000; //- 24h, 4  sec for example recoding purpose

    private Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        okButton = (Button) findViewById(id.okButton);
        startNewActivityWithOkButton();

    }


    private void startNewActivityWithOkButton() {
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//        Przekierowanie na kolejny widok
                Intent intent = new Intent(MainActivity.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }


    public void createNotification(long delayTimeForNotification, String notificationContentText, String channelId, int id, Context context ) {

        createNotificationChannel(channelId, id);
        PendingIntent pendingIntent = createPendingIntentAndIntent(context);
        NotificationCompat.Builder builder = createNotificationBuilder(pendingIntent,notificationContentText,channelId, context);
        NotificationManagerCompat notificationManager= NotificationManagerCompat.from(context);
        delayNotification(delayTimeForNotification, notificationManager, builder, id);

    }

    private PendingIntent createPendingIntentAndIntent(Context context) {
        PendingIntent pendingIntent;
        Intent intent = new Intent(context , MainWeight.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        return pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);

    }

    private NotificationCompat.Builder createNotificationBuilder(PendingIntent pendingIntent, String textContentNotification, String channelId, Context context) {
        NotificationCompat.Builder builder;
        return builder = new NotificationCompat.Builder(context ,channelId)
                .setContentTitle("E-Health is waiting for you")
                .setContentText(textContentNotification)
                .setSmallIcon(R.drawable.ic_notification_icon)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent);
    }

    private void delayNotification(long delayTimeForNotification, NotificationManagerCompat notificationManager, NotificationCompat.Builder builder, int id) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                notificationManager.notify(id,builder.build());
            }
        }, delayTimeForNotification);
    }

    public void createNotificationChannel(String channelId, int id){
        CharSequence name = "Reminder8h"+ id;
        String description = " Reminder 8h here" + id;
        int importance = NotificationManager.IMPORTANCE_DEFAULT;
        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.O){
            NotificationChannel channel= new NotificationChannel(channelId,name,importance);
            channel.setDescription(description);
        }
    }
}