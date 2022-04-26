package com.example.a10119229latihan3;

//NIM                   : 10119229
//Nama                  : Diaz Maulidzan Nugraha
//Kelas                 : IF6
//Tanggal Pengerjaan    : 21 April 2022

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mulai=findViewById(R.id.buttonMulai);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, loginActivity.class);
                startActivity(intent);
            }
        });
    }


}