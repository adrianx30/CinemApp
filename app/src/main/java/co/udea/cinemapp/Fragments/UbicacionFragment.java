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

public class UbicacionFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_ubicacion, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Ubicacion");

        Button buttonChangeText = (Button) view.findViewById(R.id.buttonFragmentStarred);


        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //textViewInboxFragment.setText("This is the Starred Fragment");
                //textViewInboxFragment.setTextColor(getResources().getColor(R.color.md_yellow_800));


            }
        });

        return view;
    }

}

