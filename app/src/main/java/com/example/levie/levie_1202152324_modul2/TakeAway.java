package com.example.levie.levie_1202152324_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {
    private EditText a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        //inisiasi EditText menggunakan id
        a = (EditText) findViewById(R.id.nama);
        b = (EditText) findViewById(R.id.no_hp);
        c = (EditText) findViewById(R.id.alamat);
        d = (EditText) findViewById(R.id.catatan);
    }
    public void pilih_pesanan (View view){
        String nama = a.getText().toString();
        String telefon = b.getText().toString();
        String alamat = c.getText().toString();
        String catatan = d.getText().toString();

        if (nama.isEmpty() || telefon.isEmpty() || alamat.isEmpty() || catatan.isEmpty()){
            Toast.makeText(this, "Data Diisi dengan Lengkap", Toast.LENGTH_LONG).show();
        }
        //mengirim nama dan jumlah ke intent agar dapat muncul pada class selanjutnya
        Intent c = new Intent(TakeAway.this, DaftarPesanan.class);
        startActivity(c);
    }
    public void showDatePicker(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
    }

    public void showTimePicker(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.time_picker));
    }

    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);

        String dateMessage = (month_string + "/" + day_string + "/" + year_string);
        Toast.makeText(this, getString(R.string.date) + dateMessage, Toast.LENGTH_SHORT).show();
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);

        String timeMessage = (hour_string + ":" + minute_string);
        Toast.makeText(this, getString(R.string.time) + timeMessage, Toast.LENGTH_SHORT).show();
    }

}



