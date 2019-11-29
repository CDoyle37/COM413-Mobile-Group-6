package com.example.firebasemultiplelogins;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class MageeParking extends AppCompatActivity {

    final private int REQUEST_COARSE_ACCESS = 123;

    TextView spacesMain;
    TextView spacesNorthland;
    TextView spacesMS;
    TextView spacesRockrd;
    TextView distanceToMain;
    TextView distanceToNorthland;
    TextView distanceToRockrd;
    TextView distanceToMS;

    boolean permissionGranted = false;
    LocationManager lm;
    LocationListener locationListener;

    Location main = new Location("Main Carpark");
    Location northland = new Location("Northland Road");
    Location rockrd = new Location("Rock Road");
    Location ms = new Location("MS Carpark");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magee_parking);

        // Assign variables to objects in the XML
        spacesMain = findViewById(R.id.availableSpacesMain);
        spacesNorthland = findViewById(R.id.availableSpacesNorthland);
        spacesMS = findViewById(R.id.availableSpacesMS);
        spacesRockrd = findViewById(R.id.availableSpacesRockRoad);
        distanceToMain = findViewById(R.id.distanceTextView1);
        distanceToNorthland = findViewById(R.id.distanceTextView2);
        distanceToRockrd = findViewById(R.id.distanceTextView3);
        distanceToMS = findViewById(R.id.distanceTextView4);


        // Establish database and create the references to each car park
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRefMain = database.getReference("campus/magee/main/Current Spaces");
        DatabaseReference myRefMS = database.getReference("campus/magee/ms/Current Spaces");
        DatabaseReference myRefNorthland = database.getReference("campus/magee/northland/Current Spaces");
        DatabaseReference myRefRockrd = database.getReference("campus/magee/rockrd/Current Spaces");


        // Database listeners for car park live numbers
        myRefMain.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // Method called once with initial value and again whenever data at this location is updated
                String value = dataSnapshot.getValue(String.class);
                if (value.equals("0")) {
                    spacesMain.setText("Full Capacity");
                } else {
                    spacesMain.setText(value + " spaces");
                }
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
                if (value.equals("0")) {
                    spacesMS.setText("Full Capacity");
                } else {
                    spacesMS.setText(value + " spaces");
                }
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
                if (value.equals("0")) {
                    spacesNorthland.setText("Full Capacity");
                } else {
                    spacesNorthland.setText(value + " spaces");
                }
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
                if (value.equals("0")) {
                    spacesRockrd.setText("Full Capacity");
                } else {
                    spacesRockrd.setText(value + " spaces");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                spacesRockrd.setText("ERROR");
            }
        });


        // Handle location
        lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        locationListener = new MyLocationListener();

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.ACCESS_COARSE_LOCATION}, REQUEST_COARSE_ACCESS);
            return;
        } else {
            permissionGranted = true;
        }
        if (permissionGranted) {
            lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);
        }


        // Set Location of various car parks
        main.setLatitude(55.007062);
        main.setLongitude(-7.322016);
        northland.setLatitude(55.005190);
        northland.setLongitude(-7.324783);
        rockrd.setLatitude(55.007921);
        rockrd.setLongitude(-7.322438);
        ms.setLatitude(55.005448);
        ms.setLongitude(-7.322358);
    }

    public void showMageeMainCarparkPage(View view) {
        startActivity(new Intent(MageeParking.this, MageeMainCarpark.class));
    }

    public void showMageeStatistics(View view) {
        startActivity(new Intent(MageeParking.this, MageeStatistics.class));
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case REQUEST_COARSE_ACCESS:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    permissionGranted = true;
                    if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                            != PackageManager.PERMISSION_GRANTED
                            && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                            != PackageManager.PERMISSION_GRANTED) {
                        return;
                    }
                    lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);
                } else {
                    permissionGranted = false;
                }
                break;

            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
                break;
        }
    }

    @Override
    public void onPause() {
        super.onPause();

        // Remove the location listener
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[] {
                    Manifest.permission.ACCESS_COARSE_LOCATION
            }, REQUEST_COARSE_ACCESS);
            return;
        } else {
            permissionGranted = true;
        }
        if (permissionGranted) {
            lm.removeUpdates(locationListener);
        }
    }

    private class MyLocationListener implements LocationListener {
        @Override
        public void onLocationChanged(Location loc) {
            // Update distance labels
            distanceToMain.setText(String.format("%.0f", loc.distanceTo(main)) + "m");
            distanceToNorthland.setText(String.format("%.0f", loc.distanceTo(northland)) + "m");
            distanceToRockrd.setText(String.format("%.0f", loc.distanceTo(rockrd)) + "m");
            distanceToMS.setText(String.format("%.0f", loc.distanceTo(ms)) + "m");
        }

        @Override
        public void onProviderDisabled(String provider) {}

        @Override
        public void onProviderEnabled(String provider) {}

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {}
    }
}
