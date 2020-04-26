package com.example.l4;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment implements OnClickListener {

    private EditText fInput, cOutput;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public void onClick(View v) {

        double fNumber = Double.parseDouble(fInput.getText().toString());
        double cNumber = (((fNumber - 32)*5)/9);

        cOutput.setText(String.valueOf(cNumber));


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_1, container, false);

        fInput = (EditText)view.findViewById(R.id.fInput);
        cOutput = (EditText)view.findViewById(R.id.cOutput);


        Button b = (Button)view.findViewById(R.id.convertB);
        b.setOnClickListener( this );

        return view;

    }



}
