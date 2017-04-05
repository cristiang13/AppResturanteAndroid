package com.example.casa.apprestaurant.categoria_comida;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.casa.apprestaurant.R;
import com.example.casa.apprestaurant.adapter.Adapter;
import com.example.casa.apprestaurant.dbmodelo.Platos;

import java.util.ArrayList;


/**
 * Created by Casa on 21/12/2016.
 */

public class ListaPlatosFragment extends Fragment {

    Platos plato;
    private RecyclerView recycler;
    // 23/12/206 3:17 cambie Recyclerview por Adapter private Recycler.....
    private Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    ArrayList<Platos> lstPlatos = new ArrayList<Platos>();
    public ListaPlatosFragment(){

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        /*Intent intent = new Intent(getActivity(), Main2Activity.class);
        startActivity(intent);*/
        View x =  inflater.inflate(R.layout.recycler,null);
        plato = new Platos(getContext());
        lstPlatos = plato.getListadoPlatos();
        recycler = (RecyclerView)x.findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        lManager = new LinearLayoutManager(getContext());
        recycler.setLayoutManager(lManager);

        adapter = new Adapter(lstPlatos, getContext());
        recycler.setAdapter(adapter);




    return x;}

}
