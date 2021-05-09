package com.androidlover.drawablesthemesandstyles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ImageButton(View view) {
        Toast.makeText(MainActivity.this,"ImageButton",Toast.LENGTH_SHORT).show();
    }

    public void TextView(View view) {
        Toast.makeText(MainActivity.this,"TextView",Toast.LENGTH_SHORT).show();

    }
}