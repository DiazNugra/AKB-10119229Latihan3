package com.example.a10119229latihan3;

//NIM                   : 10119229
//Nama                  : Diaz Maulidzan Nugraha
//Kelas                 : IF6
//Tanggal Pengerjaan    : 21 April 2022

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

import android.view.View;

import android.widget.Button;
import android.widget.TextView;


public class selesaiActivity extends AppCompatActivity {

    TextView receiver_nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selesai);

        receiver_nama = (TextView)findViewById(R.id.cobaReceiveNama);

        //buat intent
        Intent intent = getIntent();

        //terima value
        String strNama = intent.getStringExtra("message_key");

        //tampilkan
        receiver_nama.setText("Beres! Sekarang "+strNama+" udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)");
    }
}