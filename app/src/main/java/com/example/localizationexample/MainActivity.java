package com.example.localizationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
Button btnMMU,btnMMZ,btnEN;
TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMMU=findViewById(R.id.btnMMU);
        btnEN=findViewById(R.id.btnEN);
        btnMMZ=findViewById(R.id.btnMMZ);
        tvResult=findViewById(R.id.tvResult);



        btnEN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Locale locale = new Locale("en");
                Locale.setDefault(locale);
                // Create a new configuration object
                Configuration config = new Configuration();
                // Set the locale of the new configuration
                config.locale = locale;
                // Update the configuration of the Accplication context
                getResources().updateConfiguration(
                        config,
                        getResources().getDisplayMetrics()
                );
                recreate();
            }
        });

        btnMMZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Locale locale = new Locale("mmz");
                Locale.setDefault(locale);
                // Create a new configuration object
                Configuration config = new Configuration();
                // Set the locale of the new configuration
                config.locale = locale;
                // Update the configuration of the Accplication context
                getResources().updateConfiguration(
                        config,
                        getResources().getDisplayMetrics()
                );
                recreate();
            }
        });

        btnMMU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Locale locale = new Locale("mmu");
                Locale.setDefault(locale);
                // Create a new configuration object
                Configuration config = new Configuration();
                // Set the locale of the new configuration
                config.locale = locale;
                // Update the configuration of the Accplication context
                getResources().updateConfiguration(
                        config,
                        getResources().getDisplayMetrics()
                );
                recreate();
            }
        });



    }
}
