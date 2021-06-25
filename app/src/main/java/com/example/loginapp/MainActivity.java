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
        
        imageView = findViewById(R.id.imageView);
        editText = findViewById(R.id.EditText);
        button = findViewById(R.id.button);
        country_tx = findViewById(R.id.country);
        city_tx = findViewById(R.id.city);
        temp_tx = findViewById(R.id.temperature);
        latitude_tx = findViewById(R.id.latitude);
        longitude_tx = findViewById(R.id.longitude);
        sunrise_tx = findViewById(R.id.sunrise);
        sunset_tx = findViewById(R.id.sunset);
        humidity_tx = findViewById(R.id.humidity);
        pressure_tx = findViewById(R.id.pressure);
        windSpeed_tx = findViewById(R.id.windSpeed);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findWeather();
            }
        });
    }
}
