package com.example.firebasemultiplelogins;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MageeMainCarpark extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference refSpace1 = database.getReference("campus/magee/main/spaces/space1");
    DatabaseReference refSpace2 = database.getReference("campus/magee/main/spaces/space2");
    DatabaseReference refSpace3 = database.getReference("campus/magee/main/spaces/space3");
    DatabaseReference refSpace4 = database.getReference("campus/magee/main/spaces/space4");
    DatabaseReference refSpace5 = database.getReference("campus/magee/main/spaces/space5");
    DatabaseReference refSpace6 = database.getReference("campus/magee/main/spaces/space6");
    DatabaseReference refSpace7 = database.getReference("campus/magee/main/spaces/space7");
    DatabaseReference refSpace8 = database.getReference("campus/magee/main/spaces/space8");
    DatabaseReference refSpace9 = database.getReference("campus/magee/main/spaces/space9");
    DatabaseReference refSpace10 = database.getReference("campus/magee/main/spaces/space10");
    DatabaseReference refSpace11 = database.getReference("campus/magee/main/spaces/space11");
    DatabaseReference refSpace12 = database.getReference("campus/magee/main/spaces/space12");
    DatabaseReference refSpace13 = database.getReference("campus/magee/main/spaces/space13");
    DatabaseReference refSpace14 = database.getReference("campus/magee/main/spaces/space14");
    DatabaseReference refSpace15 = database.getReference("campus/magee/main/spaces/space15");
    DatabaseReference refSpace16 = database.getReference("campus/magee/main/spaces/space16");
    DatabaseReference refSpace17 = database.getReference("campus/magee/main/spaces/space17");
    DatabaseReference refSpace18 = database.getReference("campus/magee/main/spaces/space18");
    DatabaseReference refSpace19 = database.getReference("campus/magee/main/spaces/space19");
    DatabaseReference refSpace20 = database.getReference("campus/magee/main/spaces/space20");

    ImageView space1, space2, space3, space4, space5, space6, space7, space8, space9, space10, space11, space12, space13, space14, space15, space16, space17, space18, space19, space20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magee_main_carpark);

        space1 = findViewById(R.id.space1);
        space2 = findViewById(R.id.space2);
        space3 = findViewById(R.id.space3);
        space4 = findViewById(R.id.space4);
        space5 = findViewById(R.id.space5);
        space6 = findViewById(R.id.space6);
        space7 = findViewById(R.id.space7);
        space8 = findViewById(R.id.space8);
        space9 = findViewById(R.id.space9);
        space10 = findViewById(R.id.space10);
        space11 = findViewById(R.id.space11);
        space12 = findViewById(R.id.space12);
        space13 = findViewById(R.id.space13);
        space14 = findViewById(R.id.space14);
        space15 = findViewById(R.id.space15);
        space16 = findViewById(R.id.space16);
        space17 = findViewById(R.id.space17);
        space18 = findViewById(R.id.space18);
        space19 = findViewById(R.id.space19);
        space20 = findViewById(R.id.space20);

        UpdateListeners();
    }

    private void UpdateListeners() {
        refSpace1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space1.setColorFilter(Color.RED);
                } else {
                    space1.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space2.setColorFilter(Color.RED);
                } else {
                    space2.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space3.setColorFilter(Color.RED);
                } else {
                    space3.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space4.setColorFilter(Color.RED);
                } else {
                    space4.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space5.setColorFilter(Color.RED);
                } else {
                    space5.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space6.setColorFilter(Color.RED);
                } else {
                    space6.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space7.setColorFilter(Color.RED);
                } else {
                    space7.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space8.setColorFilter(Color.RED);
                } else {
                    space8.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace9.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space9.setColorFilter(Color.RED);
                } else {
                    space9.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace10.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space10.setColorFilter(Color.RED);
                } else {
                    space10.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace11.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space11.setColorFilter(Color.RED);
                } else {
                    space11.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace12.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space12.setColorFilter(Color.RED);
                } else {
                    space12.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace13.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space13.setColorFilter(Color.RED);
                } else {
                    space13.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace14.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space14.setColorFilter(Color.RED);
                } else {
                    space14.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace15.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space15.setColorFilter(Color.RED);
                } else {
                    space15.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace16.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space16.setColorFilter(Color.RED);
                } else {
                    space16.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace17.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space17.setColorFilter(Color.RED);
                } else {
                    space17.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace18.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space18.setColorFilter(Color.RED);
                } else {
                    space18.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace19.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space19.setColorFilter(Color.RED);
                } else {
                    space19.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        refSpace20.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                boolean occupied = dataSnapshot.getValue(boolean.class);
                if (occupied) {
                    space20.setColorFilter(Color.RED);
                } else {
                    space20.setColorFilter(Color.GREEN);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
