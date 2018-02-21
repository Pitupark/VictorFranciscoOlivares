package com.example.alumnom.victorfranciscoolivares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvPaisesdelMundo;

    private static final String URL="https://restcountries.eu/rest/v2/all";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvPaisesdelMundo = findViewById(R.id.lvPaisesdelMundo);

        final RequestQueue request = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, URL, null, new Response.Listener<JSONArray>(){
            @Override
            public void onResponse(JSONArray response) {

            try {

            JSONObject jsonObjectPrincipal=new JSONObject(request.toString());

            JSONArray JSONList=jsonObjectPrincipal.getJSONArray("list");


                ArrayList<DatosPaises> listaDatos = new ArrayList<DatosPaises>();
                for(int i = 0; i<JSONList.length(); i++){



                String nombre = JSONList.getJSONObject(i).getJSONArray("list").getJSONObject(0).getString("name");
                String clave = JSONList.getJSONObject(i).getJSONArray("list").getJSONObject(0).getString("topLevelDomain");
                String capital = JSONList.getJSONObject(i).getJSONArray("list").getJSONObject(0).getString("capital");
                String continente = JSONList.getJSONObject(i).getJSONArray("list").getJSONObject(0).getString("region");
                String latitud = JSONList.getJSONObject(i).getJSONArray("list").getJSONObject(0).getString("lat");
                String longitud = JSONList.getJSONObject(i).getJSONArray("list").getJSONObject(0).getString("long");
                String Paisesfron = JSONList.getJSONObject(i).getJSONArray("list").getJSONObject(0).getString("borders");


            }




            Adapter adaptador = new Adapter(getApplicationContext(), listaDatos);
            lvPaisesdelMundo.setAdapter(adaptador);


        } catch (JSONException e) {
            e.printStackTrace();
        }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO Auto-generated method stub

            }

        });
        request.add(jsonArrayRequest);



            }
        }


