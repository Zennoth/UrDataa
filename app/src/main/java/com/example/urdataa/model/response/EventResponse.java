package com.example.urdataa.model.response;

import com.example.urdataa.model.local.Event;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EventResponse {
    @SerializedName("data")
    private List<Event> results;

    public List<Event> getResults() {
        return results;
    }
}
