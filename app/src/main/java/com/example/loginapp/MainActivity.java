package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
    EditText editText;
    Button button;
    ImageView imageView;
    TextView country_tx, city_tx, temp_tx, latitude_tx, longitude_tx, sunrise_tx, humidity_tx, sunset_tx, pressure_tx, windSpeed_tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
