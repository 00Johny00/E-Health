package com.mojprogram.e_zdrowie;

import static com.mojprogram.e_zdrowie.MainActivity.DELAY_TIME_FOR_NOTIFICATION_24H;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainFluid extends AppCompatActivity {
    private MainActivity mainActivity;
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
//                mainActivity.showNotification(DELAY_TIME_FOR_NOTIFICATION_24H);
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(MainFluid.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }


}