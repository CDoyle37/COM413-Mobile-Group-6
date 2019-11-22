package com.example.firebasemultiplelogins;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class MageeParking extends AppCompatActivity {

    TextView spacesMain;
    TextView spacesNorthland;
    TextView spacesMS;
    TextView spacesRockrd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magee_parking);

        spacesMain = findViewById(R.id.availableSpacesMain);
        spacesNorthland = findViewById(R.id.availableSpacesNorthland);
        spacesMS = findViewById(R.id.availableSpacesMS);
        spacesRockrd = findViewById(R.id.availableSpacesRockRoad);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRefMain = database.getReference("campus/magee/main/Current Spaces");
        DatabaseReference myRefMS = database.getReference("campus/magee/ms/Current Spaces");
        DatabaseReference myRefNorthland = database.getReference("campus/magee/northland/Current Spaces");
        DatabaseReference myRefRockrd = database.getReference("campus/magee/rockrd/Current Spaces");

        myRefMain.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // Method called once with initial value and again whenever data at this location is updated
                String value = dataSnapshot.getValue(String.class);
                spacesMain.setText(value + " spaces");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                spacesMain.setText("ERROR");
            }
        });

        myRefMS.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // Method called once with initial value and again whenever data at this location is updated
                String value = dataSnapshot.getValue(String.class);
                spacesMS.setText(value + " spaces");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                spacesMS.setText("ERROR");
            }
        });

        myRefNorthland.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // Method called once with initial value and again whenever data at this location is updated
                String value = dataSnapshot.getValue(String.class);
                spacesNorthland.setText(value + " spaces");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                spacesNorthland.setText("ERROR");
            }
        });

        myRefRockrd.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // Method called once with initial value and again whenever data at this location is updated
                String value = dataSnapshot.getValue(String.class);
                spacesRockrd.setText(value + " spaces");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                spacesRockrd.setText("ERROR");
            }
        });
    }

    public void showMageeMainCarparkPage(View view) {
        startActivity(new Intent(MageeParking.this, MageeMainCarpark.class));
    }

    public void showMageeStatistics(View view) {
        startActivity(new Intent(MageeParking.this, MageeStatistics.class));
    }

}
