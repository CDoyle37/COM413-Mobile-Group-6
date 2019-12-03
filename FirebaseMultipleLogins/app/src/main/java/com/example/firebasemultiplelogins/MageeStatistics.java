package com.example.firebasemultiplelogins;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MageeStatistics extends AppCompatActivity {

    final int[] times = {0,0,0,0,0,0,0,0,0,0,0,0};
    GraphView graph;
    TextView day;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRefMonday = database.getReference("campus/magee/stats/monday");
    DatabaseReference myRefTuesday = database.getReference("campus/magee/stats/tuesday");
    DatabaseReference myRef = myRefMonday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magee_statistics);

        graph = findViewById(R.id.graph);
        day = findViewById(R.id.txtDay);

        UpdateListeners();
    }

    public void DrawGraph() {
        graph.removeAllSeries();
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(8, times[0]),
                new DataPoint(9, times[1]),
                new DataPoint(10, times[2]),
                new DataPoint(11, times[3]),
                new DataPoint(12, times[4]),
                new DataPoint(13, times[5]),
                new DataPoint(14, times[6]),
                new DataPoint(15, times[7]),
                new DataPoint(16, times[8]),
                new DataPoint(17, times[9]),
                new DataPoint(18, times[10]),
                new DataPoint(19, times[11])
        });

        graph.getGridLabelRenderer().setGridColor(Color.rgb(180, 161, 105));
        graph.getGridLabelRenderer().setHorizontalLabelsColor(Color.rgb(180, 161, 105));
        graph.getGridLabelRenderer().setVerticalLabelsColor(Color.rgb(180, 161, 105));
        series.setColor(Color.WHITE);
        series.setThickness(12);

        graph.getGridLabelRenderer().setHorizontalAxisTitle("Time of Day (24H)");
        graph.getGridLabelRenderer().setHorizontalAxisTitleTextSize(36);
        graph.getGridLabelRenderer().setHorizontalAxisTitleColor(Color.rgb(180, 161, 105));
        graph.getGridLabelRenderer().setVerticalAxisTitle("Free Spaces");
        graph.getGridLabelRenderer().setVerticalAxisTitleTextSize(36);
        graph.getGridLabelRenderer().setVerticalAxisTitleColor(Color.rgb(180, 161, 105));

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(8);
        graph.getViewport().setMaxX(12);
        graph.getViewport().setScrollable(true);
        graph.getViewport().setScalable(true);
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(0);
        graph.getViewport().setMaxY(40);
        graph.getViewport().setScrollableY(true);
        graph.getViewport().setScalableY(true);

        graph.addSeries(series);
    }

    private void UpdateListeners() {
        myRef.child("8-9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                times[0] = dataSnapshot.getValue(int.class);
                String temp = Integer.toString(times[0]);
                DrawGraph();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        myRef.child("9-10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                times[1] = dataSnapshot.getValue(int.class);
                String temp = Integer.toString(times[1]);
                DrawGraph();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        myRef.child("10-11").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                times[2] = dataSnapshot.getValue(int.class);
                String temp = Integer.toString(times[2]);
                DrawGraph();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        myRef.child("11-12").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                times[3] = dataSnapshot.getValue(int.class);
                String temp = Integer.toString(times[3]);
                DrawGraph();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        myRef.child("12-1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                times[4] = dataSnapshot.getValue(int.class);
                String temp = Integer.toString(times[4]);
                DrawGraph();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        myRef.child("1-2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                times[5] = dataSnapshot.getValue(int.class);
                String temp = Integer.toString(times[5]);
                DrawGraph();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        myRef.child("2-3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                times[6] = dataSnapshot.getValue(int.class);
                String temp = Integer.toString(times[6]);
                DrawGraph();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        myRef.child("3-4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                times[7] = dataSnapshot.getValue(int.class);
                String temp = Integer.toString(times[7]);
                DrawGraph();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        myRef.child("4-5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                times[8] = dataSnapshot.getValue(int.class);
                String temp = Integer.toString(times[8]);
                DrawGraph();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        myRef.child("5-6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                times[9] = dataSnapshot.getValue(int.class);
                String temp = Integer.toString(times[9]);
                DrawGraph();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        myRef.child("6-7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                times[10] = dataSnapshot.getValue(int.class);
                String temp = Integer.toString(times[10]);
                DrawGraph();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        myRef.child("7-8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                times[11] = dataSnapshot.getValue(int.class);
                String temp = Integer.toString(times[11]);
                DrawGraph();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public void NextDay(View view) {
        if (myRef == myRefMonday) {
            myRef = myRefTuesday;
            day.setText("Tuesday");
        } else {
            day.setText("Monday");
            myRef = myRefMonday;
        }

        UpdateListeners();
    }
}
