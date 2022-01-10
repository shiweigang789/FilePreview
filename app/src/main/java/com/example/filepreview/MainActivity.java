package com.example.filepreview;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btnDisplay;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] list = new String[1];
        list[0] = "android.permission.WRITE_EXTERNAL_STORAGE";
//        QbSdk.initX5Environment(this, new QbSdk.PreInitCallback() {
//            @Override
//            public void onCoreInitFinished() {
//                Log.d("QbSdk", "onCoreInitFinished");
//            }
//
//            @Override
//            public void onViewInitFinished(boolean b) {
//                Log.d("QbSdk", "onCoreInitFinished = " + b);
//            }
//        });
        btnDisplay = findViewById(R.id.btn_display);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DisplayActivity.class));
            }
        });
    }
}