package com.mojprogram.e_zdrowie;

import static com.mojprogram.e_zdrowie.MainActivity.DELAY_TIME_FOR_NOTIFICATION_24H;
import static com.mojprogram.e_zdrowie.MainActivity.DELAY_TIME_FOR_NOTIFICATION_8H;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainFluid extends AppCompatActivity {
    private MainActivity mainActivity = new MainActivity();
    private Button buttonFluidCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fluid);
        buttonFluidCheck = (Button) findViewById(R.id.buttonFluidCheck);
        buttonFluidCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
                Context context = MainFluid.this;
                mainActivity.createNotification(DELAY_TIME_FOR_NOTIFICATION_24H,"Please check your drink fluid","channelFluid",203,context);

                // Przekierowanie na kolejny widok
                Intent intent = new Intent(context, MainMenu.class);
                startActivity(intent);
            }
        });
    }


}