package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView tv = findViewById(R.id.tvCityName);
        Button back = findViewById(R.id.btnBack);

        String city = getIntent().getStringExtra("city");
        if (city != null) tv.setText(city);

        back.setOnClickListener(v -> finish());
    }
}