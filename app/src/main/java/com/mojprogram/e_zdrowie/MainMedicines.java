package com.mojprogram.e_zdrowie;

import static com.mojprogram.e_zdrowie.MainActivity.DELAY_TIME_FOR_NOTIFICATION_24H;
import static com.mojprogram.e_zdrowie.MainActivity.DELAY_TIME_FOR_NOTIFICATION_8H;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMedicines extends AppCompatActivity {
    private Button buttonMedicinesCheckYes;
    private Button buttonMedicinesCheckNo;
    private MainActivity mainActivity;

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
//                mainActivity.showNotification(DELAY_TIME_FOR_NOTIFICATION_8H);
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(MainMedicines.this, MainMenu.class);
                startActivity(intent);
            }
        });

        buttonMedicinesCheckNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
//                showNotification();
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(MainMedicines.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}