package com.example.levie.levie_1202152324_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {
    private TextView p,q,r;
    private ImageView s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        //inisiasi pada id
        p = (TextView) findViewById(R.id.namamakanan);
        q = (TextView) findViewById(R.id.harga);
        r = (TextView) findViewById(R.id.komposisi);
        s = (ImageView) findViewById(R.id.gambar);

        //melakukan intent dari menu fitur  sebelumnya sudah membawa data yg dikirim
        Intent c = getIntent();

        String menu = c.getStringExtra("Judul");
        String harga1 = c.getStringExtra("Harga");
        String komposisi = c.getStringExtra("komposisi");
        Integer gambar1 = c.getIntExtra("Gambar", 0);

        p.setText(menu);
        q.setText(harga1);
        r.setText(komposisi);
        s.setImageResource(gambar1);


    }
}
