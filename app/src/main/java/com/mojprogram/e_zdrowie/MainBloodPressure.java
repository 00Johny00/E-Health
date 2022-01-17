package com.mojprogram.e_zdrowie;

import static com.mojprogram.e_zdrowie.MainActivity.DELAY_TIME_FOR_NOTIFICATION_24H;
import static com.mojprogram.e_zdrowie.MainActivity.DELAY_TIME_FOR_NOTIFICATION_8H;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;

public class MainBloodPressure extends AppCompatActivity {
    private Button buttonBlookPressureCheck;
    private MainActivity mainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_blood_pressure);
        buttonBlookPressureCheck = (Button) findViewById(R.id.buttonBlookPressureCheck);
        buttonBlookPressureCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
//               showNotification();
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(MainBloodPressure.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}