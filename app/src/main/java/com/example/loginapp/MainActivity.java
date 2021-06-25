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
    
     public void findWeather() {
        String city = editText.getText().toString();
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=f30e42aed61593e2c954e35d72cf9e77&units=metric";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //Thirja e API
                try {

                    JSONObject jsonObject = new JSONObject(response);

                    //Find the State
                    JSONObject object1 = jsonObject.getJSONObject("sys");
                    String country_find = object1.getString("country");
                    country_tx.setText(country_find);

                    //Find the city
                    String city_find = jsonObject.getString("name");
                    city_tx.setText(city_find);

                    //Find the temperature
                    JSONObject object2 = jsonObject.getJSONObject("main");
                    String temp_find = object2.getString("temp");
                    temp_tx.setText(temp_find + "°C");

                    //Finding the icon

                    JSONArray jsonArray = jsonObject.getJSONArray("weather");
                    JSONObject obj = jsonArray.getJSONObject(0);
                    String icon = obj.getString("icon");
                    String url = "https://openweathermap.org/img/wn/"+icon+"@2x.png";
                    Picasso.get().load(url).into(imageView);


                    // Finding the latitude
                    JSONObject object3 = jsonObject.getJSONObject("coord");
                    double lat_find = object3.getDouble("lat");
                    latitude_tx.setText(lat_find + "°  N");

                    //Finding the longitude
                    JSONObject object4 = jsonObject.getJSONObject("coord");
                    double lon_find = object4.getDouble("lon");
                    longitude_tx.setText(lon_find + "°  E");

                    //finding the sunrise
                    JSONObject object5 = jsonObject.getJSONObject("sys");
                    long sunrise_find = Long.parseLong(object5.getString("sunrise"));
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                    String date = sdf.format(new java.util.Date (sunrise_find*1000));
                    sunrise_tx.setText(date);

                    //Finding the sunset
                    JSONObject object6 = jsonObject.getJSONObject("sys");
                    long sunset_find = Long.parseLong(object6.getString("sunset"));
                    SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
                    String date2 = sdf2.format(new java.util.Date (sunset_find*1000));
                    sunset_tx.setText(date2);

                    //Finding the humidity
                    JSONObject object7 = jsonObject.getJSONObject("main");
                    int humidity_find = object7.getInt("humidity");
                    humidity_tx.setText(humidity_find + " %");

                    //Finding the pressure
                    JSONObject object8 = jsonObject.getJSONObject("main");
                    String pressure_find = object8.getString("pressure");
                    pressure_tx.setText(pressure_find + " hPa");

                    //Finding the wind speed
                    JSONObject object9 = jsonObject.getJSONObject("wind");
                    String windSpeed_find = object9.getString("speed");
                    windSpeed_tx.setText(windSpeed_find + " km/h");



                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "The city you entered doesn't exist, please try again", Toast.LENGTH_SHORT).show();

            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
        requestQueue.add(stringRequest);

    }
    // Converts to celcius
    private float convertFahrenheitToCelcius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    // Converts to fahrenheit
    private float convertCelciusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:


        }
        return super.onOptionsItemSelected(item);
    }
}
