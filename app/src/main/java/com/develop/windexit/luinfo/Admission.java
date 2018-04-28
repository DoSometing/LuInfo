package com.develop.windexit.luinfo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Admission extends Fragment implements View.OnClickListener {

    private CardView b1, b2, b3, b4, b5, b6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.admission, container, false);


        b1 = rootView.findViewById(R.id.card_view_adAndreg);

        b2 = rootView.findViewById(R.id.card_view_apply);
        b3 = rootView.findViewById(R.id.card_view_acpro);

        b4 = rootView.findViewById(R.id.card_view_ap);
        b5 = rootView.findViewById(R.id.card_view_scholarship);
        b6 = rootView.findViewById(R.id.card_view_fee);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);

        return rootView;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.card_view_adAndreg:
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://firebasestorage.googleapis.com/v0/b/firecastapp1.appspot.com/o/LU%20INFO%2FAdmission%20%26%20Registration%20Policies.pdf?alt=media&token=ac2a9bef-bf6c-4139-81f7-c2a9ecfc59bb")));
                break;
            case R.id.card_view_fee:
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://firebasestorage.googleapis.com/v0/b/firecastapp1.appspot.com/o/LU%20INFO%2Fadmission%20Fees.pdf?alt=media&token=9972fbeb-2d04-442b-91f6-3e2575c97090")));
                break;
            case R.id.card_view_acpro:
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://firebasestorage.googleapis.com/v0/b/firecastapp1.appspot.com/o/LU%20INFO%2FAcademic%20Programs.pdf?alt=media&token=0ff7ff33-b69c-4916-9212-ec146b0d1ec0")));
                break;
            case R.id.card_view_ap:
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://firebasestorage.googleapis.com/v0/b/firecastapp1.appspot.com/o/LU%20INFO%2FAcademic%20policy.pdf?alt=media&token=ad3a8a9e-a595-4efe-a11e-92e81c6d9422")));
                break;
            case R.id.card_view_apply:
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://firebasestorage.googleapis.com/v0/b/firecastapp1.appspot.com/o/LU%20INFO%2FHow%20to%20Apply.pdf?alt=media&token=9542de4a-d76e-4a14-a887-eda5f016bf58")));
                break;

            case R.id.card_view_scholarship:
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://firebasestorage.googleapis.com/v0/b/firecastapp1.appspot.com/o/LU%20INFO%2FScholarship%20and%20Aid.pdf?alt=media&token=1c645669-d5fe-41d6-a592-c461d540ba3e")));
                break;
        }
    }

}
