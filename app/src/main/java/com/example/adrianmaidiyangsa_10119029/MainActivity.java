package com.example.adrianmaidiyangsa_10119029;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//        Nama      : Adrian Maidiyangsa
//        NIM       : 10119029
//        Kelas     : IF1

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Exit(View view) {
        finish();
        System.exit(0);
    }

    public void Profile(View view) {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}