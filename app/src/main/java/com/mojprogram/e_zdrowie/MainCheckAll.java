package com.mojprogram.e_zdrowie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainCheckAll extends AppCompatActivity {
    private Button buttonAllCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fill_all);
        buttonAllCheck = (Button) findViewById(R.id.buttonAllCheck);
        buttonAllCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tworzymy notyfikację
//                showNotification();
                // Przekierowanie na kolejny widok
                Intent intent = new Intent(MainCheckAll.this, MainMenu.class);
                startActivity(intent);
            }
        });
    }
}