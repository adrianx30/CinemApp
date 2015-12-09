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

import co.udea.cinemapp.MainActivity;
import co.udea.cinemapp.R;

public class TeatrosFragment extends Fragment {

    MainActivity main;

    public void setMain(MainActivity ma){
        this.main=ma;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_teatros, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Teatro");


        return view;
    }





}


