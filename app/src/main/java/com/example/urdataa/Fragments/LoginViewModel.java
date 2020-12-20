package com.example.urdataa.Fragments;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.urdataa.model.response.TokenResponse;
import com.example.urdataa.repository.AuthRepository;

public class LoginViewModel extends ViewModel {

    private AuthRepository repository;

    public LoginViewModel() {
        repository = AuthRepository.getInstance();
    }

    public MutableLiveData<TokenResponse> login(String email, String password) {
        return repository.login(email, password);
    }
}
