package com.example.demondex;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.demondex.databinding.FragmentNewReviewBinding;

public class NewReviewFragment extends Fragment {
    private FragmentNewReviewBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentNewReviewBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ReviewsViewModel reviewsViewModel = new ViewModelProvider(requireActivity()).get(ReviewsViewModel.class);
        NavController navController = Navigation.findNavController(view);

        binding.create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = binding.name.getText().toString();
                String descripcion = binding.description.getText().toString();

                reviewsViewModel.insertar(new Review(nombre, descripcion));

                navController.popBackStack();
            }
        });
    }
}
