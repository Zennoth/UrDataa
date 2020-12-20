package com.example.urdataa.model.response;

import com.example.urdataa.model.local.Lecturer;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LecturerResponse {
    @SerializedName("data")
    private List<Lecturer> results;

    public List<Lecturer> getResults() {
        return results;
    }
}
