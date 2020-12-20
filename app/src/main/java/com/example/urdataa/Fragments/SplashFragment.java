package com.example.urdataa.Fragments;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.example.urdataa.R;
import com.example.urdataa.SplashFragmentDirections;
import com.example.urdataa.utils.SharedPreferenceHelper;

public class SplashFragment extends Fragment {

    public SplashFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SharedPreferenceHelper helper = SharedPreferenceHelper.getInstance((requireActivity()));

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            NavDirections action;
            if (helper.getAccessToken().isEmpty()) {
                //request ke api check apakah token masih jalan / tidak (kalau tidak send request lagi pakai refresh token)
                action = SplashFragmentDirections.actionSplashFragmentToLoginFragment();
            }else{
                action = SplashFragmentDirections.actionSplashFragmentToProfileFragment();
            }
            Navigation.findNavController(view).navigate(action);
        }, 2000);
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
    }
}