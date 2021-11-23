package com.it18.famous_poetries.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.it18.famous_poetries.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link poet_2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class poet_2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public poet_2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment poet_2.
     */
    // TODO: Rename and change types and number of parameters
    public static poet_2 newInstance(String param1, String param2) {
        poet_2 fragment = new poet_2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_poet_2, container, false);
        //poetry 1
        Button btn1;
        TextView txt1;
        btn1=root.findViewById(R.id.btn1);
        txt1=root.findViewById(R.id.txt1);
        btn1.setOnClickListener(v->{
            String share=txt1.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,share);
            startActivity(action);
        });
        //poetry 2
        Button btn2;
        TextView txt2;
        btn2=root.findViewById(R.id.btn2);
        txt2=root.findViewById(R.id.txt2);
        btn2.setOnClickListener(v->{
            String share=txt2.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,share);
            startActivity(action);
        });
        //poetry 3
        Button btn3;
        TextView txt3;
        btn3=root.findViewById(R.id.btn3);
        txt3=root.findViewById(R.id.txt3);
        btn3.setOnClickListener(v->{
            String share=txt3.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,share);
            startActivity(action);
        });
        //poetry 4
        Button btn4;
        TextView txt4;
        btn4=root.findViewById(R.id.btn4);
        txt4=root.findViewById(R.id.txt4);
        btn4.setOnClickListener(v->{
            String share=txt4.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,share);
            startActivity(action);
        });
        //poetry 5
        Button btn5;
        TextView txt5;
        btn5=root.findViewById(R.id.btn5);
        txt5=root.findViewById(R.id.txt5);
        btn5.setOnClickListener(v->{
            String share=txt5.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,share);
            startActivity(action);
        });
        //poetry 6
        Button btn6;
        TextView txt6;
        btn6=root.findViewById(R.id.btn6);
        txt6=root.findViewById(R.id.txt6);
        btn6.setOnClickListener(v->{
            String share=txt6.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,share);
            startActivity(action);
        });
        //poetry 7
        Button btn7;
        TextView txt7;
        btn7=root.findViewById(R.id.btn7);
        txt7=root.findViewById(R.id.txt7);
        btn7.setOnClickListener(v->{
            String share=txt7.getText().toString();
            Intent action=new Intent();
            action.setAction(Intent.ACTION_SEND);
            action.setType("text/plain");
            action.putExtra(Intent.EXTRA_TEXT,share);
            startActivity(action);
        });
        return root;
    }
}