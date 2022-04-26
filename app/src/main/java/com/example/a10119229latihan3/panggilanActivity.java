package com.example.a10119229latihan3;

import androidx.appcompat.app.AppCompatActivity;

//NIM                   : 10119229
//Nama                  : Diaz Maulidzan Nugraha
//Kelas                 : IF6
//Tanggal Pengerjaan    : 21 April 2022

import android.content.Intent;
import android.view.View;
import android.widget.Button;



import android.os.Bundle;
import android.widget.EditText;


public class panggilanActivity extends AppCompatActivity {

    Button button_kirim;
    EditText kirim_nama;

    private Button lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panggilan);
        button_kirim =  (Button)findViewById(R.id.buttonLanjut);
        kirim_nama = (EditText) findViewById(R.id.namaKamuEditText);
        lanjut=findViewById(R.id.buttonLanjut);
        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pindah halaman
                Intent intent=new Intent(panggilanActivity.this, selesaiActivity.class);
                startActivity(intent);

                //isi text
                //ambil value
                String strNama = kirim_nama.getText().toString();

                //intent
                Intent intent1 = new Intent(getApplicationContext(), selesaiActivity.class);

                //receiver value
                intent1.putExtra("message_key", strNama);
                startActivity(intent1);
            }
        });
    }
}