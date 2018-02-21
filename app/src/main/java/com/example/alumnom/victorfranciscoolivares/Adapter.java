package com.example.alumnom.victorfranciscoolivares;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alumnom on 21/02/2018.
 */

public class Adapter extends BaseAdapter {
    Context context;
    ArrayList<DatosPaises> listaDatos;

    public Adapter(Context context, ArrayList<DatosPaises> listaDatos) {
        this.context = context;
        this.listaDatos = listaDatos;
    }

    @Override
    public int getCount() {
        return listaDatos.size();
    }

    @Override
    public Object getItem(int i) {
        return listaDatos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View vista = view;
        LayoutInflater inflate =LayoutInflater.from(context);
        vista = inflate.inflate(R.layout.item_countries, null);

        TextView tvNombreI, tvNombreC, tvClave, tvCapital, tvContinente, tvPoblacion, tvLatitud, tvLongitud, tvPaisesfron;
        tvNombreI = vista.findViewById(R.id.tvNombreI);
        tvNombreC = vista.findViewById(R.id.tvNombreC);
        tvClave = vista.findViewById(R.id.tvClave);
        tvCapital = vista.findViewById(R.id.tvCapital);
        tvContinente = vista.findViewById(R.id.tvContinente);
        tvPoblacion = vista.findViewById(R.id.tvPoblacion);
        tvLatitud = vista.findViewById(R.id.tvLatitud);
        tvLongitud = vista.findViewById(R.id.tvLongitud);
        tvPaisesfron = vista.findViewById(R.id.tvPaisFron);

        // IMPRIMO LOS VALORES DEL ARRAY LIST

        tvNombreI.setText("Nombre " + listaDatos.get(i).getNombreI().toString());
        tvNombreC.setText("Nombre C: " + listaDatos.get(i).getNombreC().toString());
        tvClave.setText("Clave: " + listaDatos.get(i).getClave().toString());
        tvContinente.setText("Continente: " + listaDatos.get(i).getContinente().toString());
        tvPoblacion.setText("Población: " + listaDatos.get(i).getPoblacion().toString());
        tvLatitud.setText("Latitud: " + listaDatos.get(i).getLatitud().toString());
        tvLongitud.setText("Longitud: " + listaDatos.get(i).getLongitud().toString());
        tvPaisesfron.setText("Paises Fronterizos: " + listaDatos.get(i).getPaisesfron().toString());


        return vista;
    }


}
