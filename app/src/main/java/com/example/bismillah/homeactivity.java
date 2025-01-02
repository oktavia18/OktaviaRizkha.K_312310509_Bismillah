package com.example.bismillah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class homeactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home); // Pastikan layout XML Anda bernama home.xml

        // Menghubungkan CardView dengan ID dari layout XML
        CardView cardSekolah = findViewById(R.id.card1);
        CardView cardRumah = findViewById(R.id.card2);
        CardView cardPerpustakaan = findViewById(R.id.card3);
        CardView cardProfesi = findViewById(R.id.card4);

        // Menambahkan Click Listener pada setiap CardView
        cardSekolah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pindah ke activity Sekolah
                Intent intent = new Intent(homeactivity.this, sekolahactivity.class);
                startActivity(intent);
            }
        });

        cardRumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pindah ke activity Rumah
                Intent intent = new Intent(homeactivity.this, rumahactivity.class);
                startActivity(intent);
            }
        });

        cardPerpustakaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pindah ke activity Perpustakaan
                Intent intent = new Intent(homeactivity.this, perpustakaanactivity.class);
                startActivity(intent);
            }
        });

        cardProfesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pindah ke activity Profesi
                Intent intent = new Intent(homeactivity.this, profesiactivity.class);
                startActivity(intent);
            }
        });
    }
}
