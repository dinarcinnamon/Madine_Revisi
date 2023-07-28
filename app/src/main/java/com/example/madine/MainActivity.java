package com.example.madine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {
    private Button btnAdmin,btnUser;
    private MaterialTextView aboutButton;
    protected static String noUnit, name, telpNo, plat, email, password,user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAdmin = findViewById(R.id.btn_adminLogin);
        btnUser = findViewById(R.id.btn_userLogin);
        aboutButton = findViewById(R.id.aboutustext);

        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AdminLogin.class);
                startActivity(i);
            }
        });

        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, UserLogin.class);
                startActivity(i);
            }
        });

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengarahkan ke halaman activity_about.xml atau AboutActivity.java
                Intent intent = new Intent(MainActivity.this, AboutusActivity.class);
                startActivity(intent);
            }
        });
    }
}