package com.example.levie.levie_1202152324_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {
    private EditText a,b;
    private Spinner c;
    String mSpinnerLabel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        //inisiasi untuk spinner
        c = (Spinner) findViewById(R.id.spinner_nomeja);

        //melakukan pemanggilan array untuk menampung data yang nantinya ada pada spiner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //jika spinner tidak kosong maka akan langsung set isi adpter dengan isi yang ada di string.xml
        if (c != null){
            c.setAdapter(adapter);
        }
    }

    public void pilih_pesanan (View view){

        //inisiasi EditText
        a = (EditText) findViewById(R.id.nama);

        //membuat string agar spinner dapat dipilih
        String test = c.getSelectedItem().toString();

        //jika spinner null
        if (a == null){
            Toast.makeText(this, "Data Diisi dengan Lengkap", Toast.LENGTH_LONG).show();
        }
        //jika memilih meja akan muncul toast memilih meja sesuai yang dipilih
        else if (test.equalsIgnoreCase("Meja 1")){
            String nama = a.getText().toString();
            Toast.makeText(this, "Anda " + nama + "Memilih meja 1", Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Meja 2")) {
            String nama = a.getText().toString();
            Toast.makeText(this, "Anda " + nama + "Memilih meja 2", Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Meja 3")) {
            String nama = a.getText().toString();
            Toast.makeText(this, "Anda " + nama + "Memilih meja 3", Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Meja 4")) {
            String nama = a.getText().toString();
            Toast.makeText(this, "Anda " + nama + "Memilih meja 4", Toast.LENGTH_LONG).show();
        }
        else if (test.equalsIgnoreCase("Meja 5")) {
            String nama = a.getText().toString();
            Toast.makeText(this, "Anda " + nama + "Memilih meja 5", Toast.LENGTH_LONG).show();
        }
        Intent a = new Intent(DineIn.this,DaftarPesanan.class);
        startActivity(a);
    }
}


