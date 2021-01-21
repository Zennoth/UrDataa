package com.example.urdataa.ui.user;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.urdataa.model.Event;
import com.example.urdataa.model.response.LogoutResponse;
import com.example.urdataa.repository.AuthRepository;
import com.example.urdataa.repository.EventRepository;
import com.example.urdataa.repository.EventURepository;

import java.util.List;

public class UserViewModel extends ViewModel {

    private AuthRepository repository;

    private EventURepository eventURepository;

    public UserViewModel() {
        repository = AuthRepository.getInstance();
        eventURepository = EventURepository.getInstance();
    }

    public LiveData<List<Event>> getEvents(){
        return eventURepository.getEvents();
    }

    public MutableLiveData<LogoutResponse> logout(){
        return repository.logout();
    }
}
