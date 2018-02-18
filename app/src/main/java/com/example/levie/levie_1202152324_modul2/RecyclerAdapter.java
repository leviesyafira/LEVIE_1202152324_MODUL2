package com.example.levie.levie_1202152324_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private ArrayList<String> rvData, rvHarga;
    private ArrayList<Integer> gambar;

    public RecyclerAdapter (ArrayList<String> masukandata, ArrayList<String> dataHarga, ArrayList<Integer> gambar1){
        rvData = masukandata;
        rvHarga = dataHarga;
        gambar = gambar1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        //id tutorial ini hanya menggunakan data string dan integer untuk tiap item
        public TextView tvTitle;
        public TextView tvSubtitle;
        public ImageView a;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View v){
            super(v);

            //untuk menghubungkan dan mendaptkan context dari mainactivity
            context = itemView.getContext();

            //inisiasi textview, ImageView, dan LinearLayout
            tvTitle = (TextView) v.findViewById(R.id.tv_title);
            tvSubtitle = (TextView) v.findViewById(R.id.tv_subtitle);
            a = (ImageView) v.findViewById(R.id.icon);
            ItemList = v.findViewById(R.id.list);

            //method agar isi array dapat pindah dan membawa data sesuai
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailMakanan.class);
                    String Ingredients = "";

                    switch (getAdapterPosition()){
                        case 0:
                            intent.putExtra("Judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("Gambar", gambar.get(getAdapterPosition()));
                            Ingredients = "Spons cake with velvet crumble and cream cheese";
                            intent.putExtra("komposisi", Ingredients);
                            context.startActivity(intent);
                            break;

                        case 1:
                            intent.putExtra("Judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("Gambar", gambar.get(getAdapterPosition()));
                            Ingredients = "Chocolate spons cake with choco ball and cream chocolate";
                            intent.putExtra("komposisi", Ingredients);
                            context.startActivity(intent);
                            break;

                        case 2:
                            intent.putExtra("Judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("Gambar", gambar.get(getAdapterPosition()));
                            Ingredients = "Vanilla spons cake with strawberry and cream cheese";
                            intent.putExtra("komposisi", Ingredients);
                            context.startActivity(intent);
                            break;

                        case 3:
                            intent.putExtra("Judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("Gambar", gambar.get(getAdapterPosition()));
                            Ingredients = "Vanilla spons cake with blueberry and vanilla cream";
                            intent.putExtra("komposisi", Ingredients);
                            context.startActivity(intent);
                            break;

                        case 4:
                            intent.putExtra("Judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("Gambar", gambar.get(getAdapterPosition()));
                            Ingredients = "Vanilla/Chocolate spons cake with jelly galaxy";
                            intent.putExtra("komposisi", Ingredients);
                            context.startActivity(intent);
                            break;

                        case 5:
                            intent.putExtra("Judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("Gambar", gambar.get(getAdapterPosition()));
                            Ingredients = "Banana spons cake with chocolate cream";
                            intent.putExtra("komposisi ", Ingredients);
                            context.startActivity(intent);
                            break;

                        case 6:
                            intent.putExtra("Judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("Gambar", gambar.get(getAdapterPosition()));
                            Ingredients = "Vanilla cake with oreo and vanilla cream";
                            intent.putExtra("komposisi", Ingredients);
                            context.startActivity(intent);
                            break;

                        case 7:
                            intent.putExtra("Judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("Gambar", gambar.get(getAdapterPosition()));
                            Ingredients = "Chocolate cake with strawberry and chocolate cream";
                            intent.putExtra("komposisi", Ingredients);
                            context.startActivity(intent);
                            break;

                        case 8:
                            intent.putExtra("Judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("Gambar", gambar.get(getAdapterPosition()));
                            Ingredients = "Vanilla cake with many fruit and vanilla cream";
                            intent.putExtra("komposisi", Ingredients);
                            context.startActivity(intent);
                            break;

                        case 9:
                            intent.putExtra("Judul", rvData.get(getAdapterPosition()));
                            intent.putExtra("Harga", rvHarga.get(getAdapterPosition()));
                            intent.putExtra("Gambar", gambar.get(getAdapterPosition()));
                            Ingredients = "Vaniila cake with greentea cream";
                            intent.putExtra("komposisi", Ingredients);
                            context.startActivity(intent);
                            break;
                    }
                }
            });
        }
    }
    @Override
    public ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        //buat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recycler_adapter, parent, false);

        //set ukuran view, margin,padding, dan parameter layout
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder (ViewHolder holder, int position){
        //mengambil elemen dari dataset array list pada posisi tertentu
        //melakukan set isi view dengan elemen dari dataset tertentu
        final String name = rvData.get(position);
        final String harga = rvHarga.get(position);
        final Integer test = gambar.get(position);

        holder.tvTitle.setText(name);
        holder.tvSubtitle.setText(harga);
        holder.a.setImageResource(test);
    }
    @Override
    public int getItemCount(){
        //hitung ukuran data/jumlah data yang ditampilan di recyclerview
        return rvData.size();
    }

}
