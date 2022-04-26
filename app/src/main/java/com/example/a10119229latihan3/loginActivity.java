package com.example.a10119229latihan3;

//NIM                   : 10119229
//Nama                  : Diaz Maulidzan Nugraha
//Kelas                 : IF6
//Tanggal Pengerjaan    : 21 April 2022


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class loginActivity extends AppCompatActivity {

    private Button masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        masuk=findViewById(R.id.buttonMasuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(loginActivity.this, panggilanActivity.class);
                startActivity(intent);
            }
        });
    }
}