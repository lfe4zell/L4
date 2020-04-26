package com.example.l4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;


public class Fragment3 extends Fragment {

    private EditText bill, numPeople, percentage, finalBill;

    public Fragment3() {
        // Required empty public constructor
    }


    public void onClick(View v) {

        double ogbill = Double.parseDouble(bill.getText().toString());
        double perc = Double.parseDouble(percentage.getText().toString());
        double people = Double.parseDouble(numPeople.getText().toString());

        DecimalFormat dFormat = new DecimalFormat("##.##");
        String decimal = dFormat.format(perc);
        double decimalNew = Double.parseDouble(decimal);


        double billwithTip = ogbill * decimalNew;
        double finalb = (billwithTip / people);

        finalBill.setText(String.valueOf(finalb));


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_3, container, false);

        bill = (EditText)view.findViewById(R.id.bill);
        numPeople = (EditText)view.findViewById(R.id.numPeople);
        percentage = (EditText)view.findViewById(R.id.percentage);
        finalBill = (EditText)view.findViewById(R.id.finalBill);


        Button b = (Button)view.findViewById(R.id.convertB);

        return view;

    }



}