package com.mojprogram.e_zdrowie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    private Button buttonWeight;
    private Button buttonBloodPreassure;
    private Button buttonFluid;
    private Button buttonMedicine;
    private Button buttonCheckAll;
    private Button buttonSummary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        buttonWeight = (Button) findViewById(R.id.buttonWeight);
        buttonBloodPreassure = (Button) findViewById(R.id.buttonBloodPreassure);
        buttonFluid = (Button) findViewById(R.id.buttonFluid);
        buttonMedicine = (Button) findViewById(R.id.buttonMedicine);
        buttonCheckAll = (Button) findViewById(R.id.buttonCheckAll);
        buttonSummary = (Button) findViewById(R.id.buttonSummary);


        buttonWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
//                showNotification();
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(MainMenu.this, MainWeight.class);
                startActivity(intent);
            }
        });

        buttonBloodPreassure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
//                showNotification();
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(MainMenu.this, MainBloodPressure.class);
                startActivity(intent);
            }
        });
        buttonFluid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
//                showNotification();
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(MainMenu.this, MainFluid.class);
                startActivity(intent);
            }
        });

        buttonMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
//                showNotification();
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(MainMenu.this, MainMedicines.class);
                startActivity(intent);
            }
        });

        buttonCheckAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
//                showNotification();
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(MainMenu.this, MainCheckAll.class);
                startActivity(intent);
            }
        });

        buttonSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
//                showNotification();
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(MainMenu.this, MainSummary.class);
                startActivity(intent);
            }
        });
    }
}