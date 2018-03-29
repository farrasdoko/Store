package com.gmail.farasabiyyu12.store;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView price2, name2, id2, brand2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        price2 = findViewById(R.id.price2);
        name2 = findViewById(R.id.nama2);
        brand2 = findViewById(R.id.brand2);
        id2 = findViewById(R.id.id2);

        Intent i = getIntent();
        String price = i.getStringExtra("price");
        String name = i.getStringExtra("name");
        String brand = i.getStringExtra("brand");
        String id = i.getStringExtra("id");

        price2.setText("Rp. " + price);
        name2.setText("Nama Barang: " + name);
        brand2.setText("Merek Barang: " + brand);
        id2.setText("ID: " + id);

    }
}
