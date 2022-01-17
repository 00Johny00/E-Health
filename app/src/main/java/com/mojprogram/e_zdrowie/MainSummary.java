package com.mojprogram.e_zdrowie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainSummary extends AppCompatActivity {
    Button buttonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_summary);
        buttonHome = (Button) findViewById(R.id.buttonHome);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
//                showNotification();
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(MainSummary.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}