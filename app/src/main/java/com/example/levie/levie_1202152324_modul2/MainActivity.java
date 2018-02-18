package com.example.levie.levie_1202152324_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button a;
    private RadioGroup b;
    private RadioButton c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //melakukan inisiasi sesuai id yang ada pada layout
        a = (Button) findViewById(R.id.pesan_skrg);
        b = (RadioGroup) findViewById(R.id.pilihan_menu);
        c = (RadioButton) findViewById(R.id.dine_in);
        d = (RadioButton) findViewById(R.id.take_away);
    }

    //memasang onClik pada button, sehingga tombol mempunyai aksi
    public void pesan (View view){
        b = (RadioGroup) findViewById(R.id.pilihan_menu);
        c = (RadioButton) findViewById(R.id.dine_in);
        d = (RadioButton) findViewById(R.id.take_away);
    }

    public void pilih (View view){
        //radio button dapat di pilih
        int selecteditem = b.getCheckedRadioButtonId();

        //Toast akan muncul ketika Dine in yang dilih
        if (selecteditem == c.getId()){
            Toast.makeText(this, "Pilihan anda adalah Dine In", Toast.LENGTH_LONG).show();

            //menggunakan intent yang mengarah ke DineIn.clas
            Intent a = new Intent(MainActivity.this, DineIn.class);
            startActivity(a);
        }
        else if (selecteditem == d.getId()){
            Toast.makeText(this, "Pilihan anda adalah Take Away", Toast.LENGTH_LONG).show();

            //menggunakan intent yang mengarah ke TakeAway.class
            Intent a = new Intent(MainActivity.this, TakeAway.class);
            startActivity(a);
        }
    }

    public void pilihpesanan (View view){
        boolean checked = ((RadioButton) view).isChecked();

        //mengecek button apa yang dipilij
        switch (view.getId()){
            case R.id.dine_in:
                if(checked) //method menampilkan pesan dan pindah ke layout dine in
                    dine();
                break;
            case R.id.take_away:
                if (checked) //method menampilkan pesan dan pindah ke layout take away
                    take();
                break;
        }

    }

    private void dine(){
        Toast.makeText(this, "Pilihan anda adalah Dine In", Toast.LENGTH_LONG).show();

        //untuk pindah ke layout Dine In
        Intent a = new Intent(MainActivity.this, DineIn.class);
        startActivity(a);
    }
    private void take(){
        Toast.makeText(this, "pilihan anda adalah Take Away", Toast.LENGTH_LONG).show();

        //untuk pindah ke layout take away
        Intent a = new Intent(MainActivity.this, TakeAway.class);
        startActivity(a);
    }
}

