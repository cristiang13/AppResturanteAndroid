package com.example.casa.apprestaurant.categoria_comida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.example.casa.apprestaurant.R;
import com.example.casa.apprestaurant.adapter.Adapter;
import com.example.casa.apprestaurant.dbmodelo.Platos;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    Platos plato;
    private RecyclerView recycler;
    // 23/12/206 3:17 cambie Recyclerview por Adapter private Recycler.....
    private Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    ListView lv1 = null;
    ArrayList<Platos> lstPlatos = new ArrayList<Platos>();


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // 23/12/206 3:17 lo comente  setContentView(R.layout.recycler);

        plato = new Platos(this);

        lstPlatos = plato.getListadoPlatos();

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);


        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        adapter = new Adapter(lstPlatos, this);
        recycler.setAdapter(adapter);


   }
}
