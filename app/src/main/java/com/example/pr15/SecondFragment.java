package com.example.pr15;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SecondFragment extends Fragment {

    private int counter = 0;
    private TextView counterTextView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        Button clickButton = view.findViewById(R.id.popupButton);
        counterTextView = view.findViewById(R.id.counterTextView);

        clickButton.setOnClickListener(v -> {
            counter++;
            counterTextView.setText("Счётчик: " + counter);
        });

        return view;
    }
}
