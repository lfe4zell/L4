package com.example.l4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;


public class Fragment2 extends Fragment {

    private EditText Miles, kmOutput;

    public Fragment2() {
        // Required empty public constructor
    }


    public void onClick(View v) {

        double miles = Double.parseDouble(Miles.getText().toString());
        double Km = miles / 0.62137;
        DecimalFormat dFormat = new DecimalFormat("##.##");

        kmOutput.setText(dFormat.format(Km));


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_2, container, false);

        Miles = (EditText) view.findViewById(R.id.milesInput);
        kmOutput = (EditText) view.findViewById(R.id.kmOutput);


        Button b = (Button) view.findViewById(R.id.convertB);

        return view;

    }
}








