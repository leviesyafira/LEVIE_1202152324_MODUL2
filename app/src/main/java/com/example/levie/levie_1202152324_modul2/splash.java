package com.example.levie.levie_1202152324_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class splash extends AppCompatActivity {
 //   private static int splashInterval = 5000; //untuk mensetting lamanya splash yang akan muncul

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            Toast.makeText(this, "Levie Syafiraliany_1202152324", Toast.LENGTH_LONG).show();
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                }
            }, 3000L);
        }
    }

        //menampilkan toast pesan Nama_NIM
//        Toast.makeText(splash.this, "Levie Syafiraliany_1202152324", Toast.LENGTH_LONG).show();

        //untuk mengirim atau memproses objek message khususnya setelah toast ditampilkan
  //      new Handler().postDelayed(new Runnable() {
    //                                  @Override
      //                                public void run() {
        //                                  // TOO Auto-generated method sub

                                          //melakukan intent ke layout selanjutnya
//                                          Intent splash = new Intent(splash.this, MainActivity.class);
  //                                        startActivity(splash);

//                                          this.finish();

//                                      }
  //                                    private void finish(){
                                          // TOO Auto-generated method sub
    //                                  }
      //                            },
        //        splashInterval); //menjalankan timer splash yang sudah disetting diatas
   // };
//}

