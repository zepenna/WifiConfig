package com.jop.android.wificonfig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button wiFi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wiFi = findViewById(R.id.wiFiButton);

        wiFi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                }
                else{
                    startActivity(new Intent(WifiManager.ACTION_PICK_WIFI_NETWORK));
                }
            }
        });

    }
}
