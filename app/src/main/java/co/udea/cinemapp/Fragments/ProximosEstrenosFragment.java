package co.udea.cinemapp.Fragments;

/**
 * Created by Vlad on 18/11/2015.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import co.udea.cinemapp.MainActivity;
import co.udea.cinemapp.R;
import dao.impl.FuncionDAOImpl;
import dto.Funcion;
import dto.Pelicula;
import dto.Silla;
import dto.Teatro;

public class ProximosEstrenosFragment extends Fragment {

    MainActivity main;

    public void setMain(MainActivity ma){
        this.main=ma;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_proximos_estrenos, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment ProximosEstrenos");

        Button buttonTeatro = (Button) view.findViewById(R.id.buttonprox);

        buttonTeatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //main.setFragmentMenu(0);
                /*Teatro t = new Teatro();
                t.setNombre("cinemark");

                Pelicula p = new Pelicula();
                Funcion f = new Funcion();
                p.setNombre("pelicula prueba");

                f.setFuncionId(1);

                f.setPelicula(p);
                f.setTeatro(t);*/
                //f.setHorario(Date.class.newInstance().getTime());
                /*Silla s2 = new Silla();
                s2.setAsiento(2);
                s2.setEstado("libre");
                s2.setFila(3);
                s2.setFuncion(1);
                Silla s = new Silla();
                s.setAsiento(2);
                s.setEstado("libre");
                s.setFila(3);
                s.setFuncion(1); */
                //List<Silla> sillas = new ArrayList<>();
                //sillas.add(s);
                //sillas.add(s2);
                //f.setSillas(sillas);
                //FuncionDAOImpl creador = new FuncionDAOImpl();
                //creador.crearFuncion(f);
            }
        });

        return view;
    }

}


