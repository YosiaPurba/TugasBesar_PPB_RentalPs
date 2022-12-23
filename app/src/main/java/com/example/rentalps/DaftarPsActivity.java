package com.example.rentalps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DaftarPsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_ps);
    }

    public void hal_sewa(View view) {
        Intent intent = new Intent(DaftarPsActivity.this, DaftarPsActivity.class);
        startActivity(intent);
    }
}


