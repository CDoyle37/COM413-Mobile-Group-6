package com.example.firebasemultiplelogins;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MageeParking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magee_parking);
    }

    public void showMageeMainCarparkPage(View view) {
        startActivity(new Intent(MageeParking.this, MageeMainCarPark.class));
    }

    public void showMageeStatistics(View view) {
        startActivity(new Intent(MageeParking.this, MageeStatistics.class));
    }
}
