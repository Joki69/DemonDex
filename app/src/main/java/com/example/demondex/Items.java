package com.example.demondex;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demondex.databinding.FragmentStatsBinding;

public class Items  extends Fragment {
    private @NonNull FragmentStatsBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return  (binding = FragmentStatsBinding.inflate(inflater,container,false)).getRoot();
    }



}
