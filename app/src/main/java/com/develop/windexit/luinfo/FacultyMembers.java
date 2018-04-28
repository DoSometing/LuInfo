package com.develop.windexit.luinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by WINDEX IT on 04-Aug-17.
 */

public class FacultyMembers extends Fragment implements View.OnClickListener {
    CardView cse, eee, civil, law, english, architecture, buisness, publicstudies, hospitality, islamic;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.faculty_members, container, false);

        islamic = (CardView) rootView.findViewById(R.id.card_view_islamicstudies);

        islamic.setOnClickListener(this);


        eee = rootView.findViewById(R.id.card_view_eee);
        eee.setOnClickListener(this);

        english = rootView.findViewById(R.id.card_view_english);
        english.setOnClickListener(this);

        law = rootView.findViewById(R.id.card_view_law);
        law.setOnClickListener(this);

        architecture = rootView.findViewById(R.id.card_view_architecture);
        architecture.setOnClickListener(this);

        buisness = rootView.findViewById(R.id.card_view_buisness);
        buisness.setOnClickListener(this);

        hospitality = rootView.findViewById(R.id.card_view_hospitality);
        hospitality.setOnClickListener(this);

        civil = rootView.findViewById(R.id.card_view_civil);
        civil.setOnClickListener(this);

        publicstudies = rootView.findViewById(R.id.card_view_publichealth);
        publicstudies.setOnClickListener(this);

        cse = rootView.findViewById(R.id.card_view_cse);
        cse.setOnClickListener(this);


        return rootView;
    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.card_view_islamicstudies:
                startActivity(new Intent(getActivity(), islamic.class));
                break;

            case R.id.card_view_eee:
                startActivity(new Intent(getActivity(), eee.class));
                break;

            case R.id.card_view_law:
                startActivity(new Intent(getActivity(), law.class));
                break;


            case R.id.card_view_english:
                startActivity(new Intent(getActivity(), eng.class));
                break;

            case R.id.card_view_buisness:
                startActivity(new Intent(getActivity(), bba.class));
                break;

            case R.id.card_view_hospitality:
                startActivity(new Intent(getActivity(), tourism.class));
                break;

            case R.id.card_view_architecture:
                startActivity(new Intent(getActivity(), archi.class));
                break;

            case R.id.card_view_cse:
                startActivity(new Intent(getActivity(), Custom.class));
                break;

            case R.id.card_view_publichealth:
                startActivity(new Intent(getActivity(), pHealth.class));
                break;

            case R.id.card_view_civil:
                startActivity(new Intent(getActivity(), cvil.class));
                break;

        }
    }

}