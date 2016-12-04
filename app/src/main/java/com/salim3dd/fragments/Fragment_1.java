package com.salim3dd.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fragment_1 extends Fragment {


    public Fragment_1() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_1, container, false);
        final TextView textView = (TextView) view.findViewById(R.id.text_F1);
        Button btn_1 = (Button) view.findViewById(R.id.btn_Fragment1);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("مرحبا بكم");
            }
        });


        return view;
    }

}
