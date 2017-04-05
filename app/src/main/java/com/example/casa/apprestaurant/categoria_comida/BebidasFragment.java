package com.example.casa.apprestaurant.categoria_comida;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.casa.apprestaurant.R;

/**
 * Created by Casa on 21/12/2016.
 */

public class BebidasFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bedidasfragment,null);
    }
}
