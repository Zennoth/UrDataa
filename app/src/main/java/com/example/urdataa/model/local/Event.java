package com.example.urdataa.model.local;

import com.google.gson.annotations.SerializedName;

public class Event {
    @SerializedName("event_name")
    String eventname;
    @SerializedName("event_date")
    String eventdate;
    @SerializedName("location")
    String location;
    @SerializedName("detail")
    String detail;

    public Event() {
    }

    public Event(String title, String description, String created_by, String status) {
        this.eventname = title;
        this.eventdate = eventdate;
        this.location = created_by;
        this.detail = status;
    }

    public String getEventName() {
        return eventname;
    }

    public void setTitle(String title) {
        this.eventname = title;
    }

    public String getEventdate() {
        return eventdate;
    }

    public void setDescription(String description) {
        this.eventdate = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
