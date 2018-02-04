package com.example.spy_support.studikasus1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText menu;
    private EditText jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        menu = (EditText) findViewById(R.id.menuMakanan);
        String menu_makanan = menu.getText().toString();
        jumlah = (EditText) findViewById(R.id.jumlah_porsi);
        String jumlah_porsi = jumlah.getText().toString();
        intent.putExtra("nama_restoran", "Eatbus");
        intent.putExtra("main_menu", menu_makanan);
        intent.putExtra("porsi_makanan", jumlah_porsi);
        intent.putExtra("harga_makanan", "45000");
        startActivity(intent);
    }

    public void abnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        menu = (EditText) findViewById(R.id.menuMakanan);
        String menu_makanan = menu.getText().toString();
        jumlah = (EditText) findViewById(R.id.jumlah_porsi);
        String jumlah_porsi = jumlah.getText().toString();
        intent.putExtra("nama_restoran", "Abnormal");
        intent.putExtra("main_menu", menu_makanan);
        intent.putExtra("porsi_makanan", jumlah_porsi);
        intent.putExtra("harga_makanan", "25000");
        startActivity(intent);
    }
}
