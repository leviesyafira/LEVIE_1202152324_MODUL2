package com.example.levie.levie_1202152324_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class DaftarPesanan extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;
    private TextView a,b;

    //daftar menu makanan
    private String[] Title = {"Red Velvet Cake", "Choco Malt", "Strawberry Cheese Cake", "Blueberry Cake", "Galaxy Cake",
            "Cup Cake Banana Choco", "Cup Cake Oreo", "Cup Cake Choco Strawberry", "Cup Cake fruity", "Cup Cake Greentea"};

    //daftar harga makanan
    private String[] Test = {"Rp. 150.000", "Rp. 120.000", "Rp. 130.000", "Rp. 120.000", "Rp. 160.000",
            "Rp. 20.000", "Rp. 20.000", "Rp. 25.000", "Rp. 25.000", "Rp. 25.000"};

    //daftar gambar
    private int[] Gambar = {R.drawable.redvelvet, R.drawable.chocomalt, R.drawable.straw, R.drawable.blueberry, R.drawable.galaxy,
            R.drawable.bananaco, R.drawable.oreo, R.drawable.strawcok, R.drawable.fruity, R.drawable.green};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_pesanan);

        //mendeklarasikan array list untuk menu daftar harga dan gambar
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        ListItem();

        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter(dataMenu,dataHarga,gambar);
        rvView.setAdapter(adapter);


    }
    private void ListItem(){
        for (int x=0; x<Title.length; x++){
            dataMenu.add(Title[x]);
            dataHarga.add(Test[x]);
            gambar.add(Gambar[x]);
        }
    }
}

