package com.example.casa.apprestaurant.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.casa.apprestaurant.R;
import com.example.casa.apprestaurant.dbmodelo.Platos;

import java.util.List;

/**
 * Created by Casa on 22/12/2016.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private List<Platos> listData;
    private Context mainContext;
    private LayoutInflater layoutInflater;

    public Adapter(List<Platos> listData,  Context context) {
        this.mainContext = context;
        this.listData = listData;
    }



    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        public ImageView imagen;
        public TextView nombre;
        public TextView precio;




        public ViewHolder(View v) {
            super(v);
            this.imagen = (ImageView)v.findViewById(R.id.imageView2);
            this.nombre = (TextView) v.findViewById(R.id.descripcion);
            this.precio = (TextView)v.findViewById(R.id.precio);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)


    // Create new views (invoked by the layout manager)
    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                 int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listaplatosfragment, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Platos plato =listData.get(position);
        // holder.itemView.setTag(plato);
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        if ((listData.get(position).getResumen()).equals("hamburguesa")){
            holder.imagen.setImageResource(R.drawable.hamburguesa);
        }else if ((listData.get(position).getResumen()).equals("pollo apanado")){
            holder.imagen.setImageResource(R.drawable.pollo);
        }else if ((listData.get(position).getResumen()).equals("pizza")){
            holder.imagen.setImageResource(R.drawable.pizza);
        }else if ((listData.get(position).getResumen()).equals("cubano")){
            holder.imagen.setImageResource(R.drawable.cubano);
        }

        holder.nombre.setText(listData.get(position).getResumen());

        holder.precio.setText("Precio: "+listData.get(position).getPrecio());


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return listData.size();
    }







}

