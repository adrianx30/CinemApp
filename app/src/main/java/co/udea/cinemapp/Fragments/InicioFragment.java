package co.udea.cinemapp.Fragments;

/**
 * Created by Vlad on 16/11/2015.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import co.udea.cinemapp.MainActivity;
import co.udea.cinemapp.R;

public class InicioFragment extends Fragment {

    MainActivity main;

    public void setMain(MainActivity ma){
        this.main=ma;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_inicio, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Inicio");

        Button buttonTeatro = (Button) view.findViewById(R.id.buttonTeatros);
        Button buttonCartelera = (Button) view.findViewById(R.id.buttonCartelera);
        Button buttonProximosEstrenos = (Button) view.findViewById(R.id.buttonProximosEstrenos);

        buttonTeatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.setFragment(0);
            }
        });

        buttonCartelera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.setFragment(1);
            }
        });

        buttonProximosEstrenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                main.setFragment(2);
            }
        });


        return view;
    }

}

