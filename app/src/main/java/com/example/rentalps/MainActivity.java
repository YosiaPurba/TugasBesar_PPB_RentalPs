package com.example.rentalps;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends Activity {
    Button info_ps, info_contact;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info_ps = (Button) findViewById(R.id.info_ps);
        info_contact = (Button) findViewById(R.id.info_contact);


        info_ps.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DaftarPsActivity.class);
                startActivity(intent);
            }
        });

        info_contact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ContactActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}
