package com.example.pr15;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             @Nullable Bundle savedInstance) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        textView = view.findViewById(R.id.textView);
        registerForContextMenu(textView);

        return view;
    }

    @Override
    public void onCreateContextMenu(@NonNull ContextMenu menu, @NonNull View v, @Nullable ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = requireActivity().getMenuInflater();
        inflater.inflate(R.menu.text_menu, menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.change_text) {
            textView.setText("папагеммагивмаподи");
            Toast.makeText(requireContext(), "Текст изменён", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.reset_text) {
            textView.setText("Нужно меня зажать");
            Toast.makeText(requireContext(), "Текст сброшен", Toast.LENGTH_SHORT).show();
            return true;
        }
//        else if (item.getItemId() == R.id.settings) {
//            Toast.makeText(requireContext(), "Нажато: Настройки", Toast.LENGTH_SHORT).show();
//            return true;
//        }
        else {
            return super.onContextItemSelected(item);
        }
    }
}
