package com.develop.windexit.luinfo;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ms.square.android.expandabletextview.ExpandableTextView;



public class Home extends Fragment implements OnMapReadyCallback {

    private Marker marker;

    private boolean mapReady;

    Button b1, b2;

    private GoogleMap mMap;


    private ExpandableTextView textView;

    private ExpandableTextView textView2;

    private String founder = "Leading University is the first private university in Sylhet. Its a reality of my deepest dream from decades. " +
            "Establishment of Leading University is the greatest work of many other deeds in my life that I could do from the mercy of Allah. " +
            "To deliver the light of modern higher education in every pace of life, I establish the Leading University in 2001 by means of nominal fee structure. " +
            "Today Leading University earned the name and fame not only in Sylhet but also in nationwide with the greatest support and love from the people of the country.\n" +
            "\n" +
            "Leading University is a non-profit educational institution. So far I am concerned all of the institutions including Leading University are doing very well and carry out their academic activities to the highest degree of perfection and with good reputation in Bangladesh. " +
            "By the leniency of Allah I also have dream to establish Science & Technology University, more Medical Colleges as well as some schools and colleges in remote area of the country.\n" +
            "\n" +
            "I hope these institutions would go further to the international level in the days to come.\n";
    private String vc = "The inauguration of Leading University (LU) on the 4th of March 2002 was a landmark in the history of higher education in Bangladesh. Initiation of the higher education operations by Leading University in Sylhet Division opened a new horizon that marked the beginning of quality education in the northeast region of Bangladesh. The university intends to maintain the benchmark of world class education. The university offers eight undergraduate programs and seven graduate programs under four faculties namely Faculty of Business Administration, Faculty of Arts & Modern Language, Faculty of Modern Science and Faculty of Social Science. Eight undergraduate programs are BBA (Hons), BA (Hons) in English, LLB (Hons), BSc (Hons) in Computer Science and Engineering, BSc (Hons) in Electrical & Electronics Engineering, BSc in Civil Engineering, Bachelor of Architecture and BA (Hons) in Islamic Studies. Graduate academic programs include MBA (Regular), MBA (Executive), MA in English (Preli), MA in English (Final), Master in Law (LLM), MA in Islamic Studies and Master in Public Health (MPH). In order to diversify its educational arena further, the university is going to open very soon the disciplines like Information Technology (IT), Tourism and Hospitality Management, Tea Technology, Pharmacy and other innovative disciplines. This will lead to fulfill the   needs of the society as well as to attain the dynamism of new areas of learning.\n" +
            "Leading University has already gained its reputation in the job market with respect its quality of education and performed other vibrant activities that would contribute towards development of different corners of the society. Graduates who passed out from this institution are well placed in various responsible positions in the job market and are made significant contributions for the development of the country.\n" +
            "\n" +
            "May Almighty Allah enable us to develop Leading University further in the days to come to attain a sustainable growth that would be dedicated to the enlightenment of the people of the region.";

    private String num1 = "+8801716871188";
    private String num2 = "01911974991";
    private String num3 = "01712219373";

    TextView callKawser, callsahmim, callsabul;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home, container, false);

       /* circleImageView=(CircleImageView)rootView.findViewById(R.id.imgFounder);
        circleImageView.setImageDrawable(R.drawable.founder);*/

        b1 = (Button) rootView.findViewById(R.id.btnMap);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mapReady)
                    mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            }
        });
        b2 = (Button) rootView.findViewById(R.id.btnSet);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mapReady)
                    mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            }
        });



        SupportMapFragment fm = (SupportMapFragment) this.getChildFragmentManager()
                .findFragmentById(R.id.map);
        fm.getMapAsync(this);

        textView = rootView.findViewById(R.id.founderText);
        textView.setText(founder);

        textView2 = rootView.findViewById(R.id.ViceText);
        textView2.setText(vc);


        callKawser = (TextView) rootView.findViewById(R.id.call_kawser);

        callKawser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + num1));

                if (ActivityCompat.checkSelfPermission(getContext(),
                        Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED) {

                    // Should we show an explanation?
                    if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) getContext(),
                            Manifest.permission.CALL_PHONE)) {

                    } else {

                        ActivityCompat.requestPermissions((Activity) getContext(),
                                new String[]{Manifest.permission.CALL_PHONE},
                                MY_PERMISSIONS_REQUEST_CALL_PHONE);
                    }
                }
                startActivity(intent);
            }
        });

        callsahmim = rootView.findViewById(R.id.call_shamim);
        callsahmim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + num2));
                if (ActivityCompat.checkSelfPermission(getContext(), android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(intent);
            }
        });

        callsabul = rootView.findViewById(R.id.call_sabul);
        callsabul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + num3));
                if (ActivityCompat.checkSelfPermission(getContext(), android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(intent);
            }
        });

        return rootView;
    }


    public static final int MY_PERMISSIONS_REQUEST_CALL_PHONE = 99;

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_CALL_PHONE: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                } else {

                }
                return;
            }

        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mapReady = true;
        if (ActivityCompat.checkSelfPermission(this.getContext(),
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this.getContext(), Manifest.permission.ACCESS_COARSE_LOCATION)
                        != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            return;
        }
        mMap.setMyLocationEnabled(true);

        CameraPosition target = CameraPosition.builder()
                .target(new LatLng(24.8735839,91.7879391))
                .zoom(10)
                .bearing(90)
                .tilt(45)
                .build();
        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(target));
        marker = mMap.addMarker(new MarkerOptions()
                .position(new LatLng(24.8735839,91.7879391))
                .title("Permanent Campus")
                .snippet("Ragib Nagar, South Surma, Sylhet")
                .visible(true)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        marker.showInfoWindow();
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.getUiSettings().setScrollGesturesEnabled(true);
    }


}
