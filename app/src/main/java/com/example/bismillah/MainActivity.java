package com.example.bismillah; // Ganti dengan nama paket aplikasi Anda

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        // Delay 2 detik sebelum masuk ke MainActivity
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, homeactivity.class);
            startActivity(intent);
            finish(); // Mengakhiri SplashActivity agar tidak bisa kembali ke layar splash
        }, 2000); // 2000ms = 2 detik
    }
}