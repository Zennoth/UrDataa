package com.example.urdataa.model.local;

import com.google.gson.annotations.SerializedName;

public class Event {
    @SerializedName("event_title")
    String title;
    @SerializedName("event_description")
    String description;
    @SerializedName("created_by")
    String created_by;
    @SerializedName("status")
    String status;

    public Event() {
    }

    public Event(String title, String description, String created_by, String status) {
        this.title = title;
        this.description = description;
        this.created_by = created_by;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
