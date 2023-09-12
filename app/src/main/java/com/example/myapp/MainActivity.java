package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import androidx.cardview.widget.CardView;
public class MainActivity extends AppCompatActivity {
;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView1 = findViewById(R.id.card1);
        CardView cardView2 = findViewById(R.id.card2);
        CardView cardView3 = findViewById(R.id.card3);
        CardView cardView4 = findViewById(R.id.card4);
        CardView cardView5 = findViewById(R.id.card5);
        CardView cardView6 = findViewById(R.id.card6);
        CardView cardView7 = findViewById(R.id.card7);
        CardView cardView8 = findViewById(R.id.card8);
        //card 1
        cardView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(intent);
            }
        });
        //card 2
        cardView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(intent);
            }
        });
        //card 3
        cardView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, ConstraintLayout.class);
                startActivity(intent);
            }
        });
        //card 4
        cardView4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, FrameLayout2.class);
                startActivity(intent);
            }
        });
        //card 5
        cardView5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, TableLayout.class);
                startActivity(intent);
            }
        });
        //card 6
        cardView6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, MaterialDesign.class);
                startActivity(intent);
            }
        });
        //card 7
        cardView7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, ScrollView.class);
                startActivity(intent);
            }
        });
        //card 8
        cardView8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, HorizontalScroll.class);
                startActivity(intent);
            }
        });

    }
}