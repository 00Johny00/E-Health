package com.mojprogram.e_zdrowie;

import static com.mojprogram.e_zdrowie.MainActivity.DELAY_TIME_FOR_NOTIFICATION_24H;
import static com.mojprogram.e_zdrowie.MainActivity.DELAY_TIME_FOR_NOTIFICATION_8H;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMedicines extends AppCompatActivity {
    private Button buttonMedicinesCheckYes;
    private Button buttonMedicinesCheckNo;
    private MainActivity mainActivity = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_medicines);
        buttonMedicinesCheckYes = (Button) findViewById(R.id.buttonMedicinesCheckYes);
        buttonMedicinesCheckNo = (Button) findViewById(R.id.buttonMedicinesCheckNo);

        buttonMedicinesCheckYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
                Context context = MainMedicines.this;
                mainActivity.createNotification(DELAY_TIME_FOR_NOTIFICATION_8H,"Please check your medicine","channelMedicine",204,context);
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(context, MainMenu.class);
                startActivity(intent);
            }
        });

        buttonMedicinesCheckNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
                Context context = MainMedicines.this;
                mainActivity.createNotification(DELAY_TIME_FOR_NOTIFICATION_8H,"Please check your medicine","channelMedicine",204,context);

                // Przekierowanie na kolejny widok
                Intent intent = new Intent(context, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}