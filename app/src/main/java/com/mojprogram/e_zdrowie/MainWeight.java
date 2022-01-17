package com.mojprogram.e_zdrowie;

import static com.mojprogram.e_zdrowie.MainActivity.DELAY_TIME_FOR_NOTIFICATION_24H;
import static com.mojprogram.e_zdrowie.MainActivity.DELAY_TIME_FOR_NOTIFICATION_8H;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;

public class MainWeight extends AppCompatActivity {
    private Button buttonWeightCheckOK;
    private MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_weight);
        buttonWeightCheckOK = (Button) findViewById(R.id.buttonWeightCheckOK);
        buttonWeightCheckOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
                Context context = MainWeight.this;
                mainActivity.createNotification(DELAY_TIME_FOR_NOTIFICATION_8H,"NotificationMainWeight","channelWeight",201,context);
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(MainWeight.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }


}