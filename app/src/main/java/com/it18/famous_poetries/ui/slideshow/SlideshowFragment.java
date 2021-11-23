package com.it18.famous_poetries.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.it18.famous_poetries.R;
import com.it18.famous_poetries.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
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

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}