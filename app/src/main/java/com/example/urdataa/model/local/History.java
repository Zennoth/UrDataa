package com.example.urdataa.model.local;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class History implements Parcelable {
    @SerializedName("event_id")
    String event_id;
    @SerializedName("event")
    String name;
    @SerializedName("event_date")
    String date;
    @SerializedName("location")
    String location;
    @SerializedName("detail")
    String detail;
    private Pivot pivot;

    public History() {
    }

    public History(String event_id, String name, String date, Pivot pivot) {
        this.event_id = event_id;
        this.name = name;
        this.date = date;
        this.location = location;
        this.detail = detail;
        this.pivot = pivot;
    }

    protected History(Parcel in) {
        event_id = in.readString();
        name = in.readString();
        date = in.readString();
        location = in.readString();
        detail = in.readString();
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(event_id);
        dest.writeString(name);
        dest.writeString(date);
        dest.writeString(location);
        dest.writeString(detail);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<History> CREATOR = new Creator<History>() {
        @Override
        public com.example.urdataa.model.local.History createFromParcel(Parcel in) {
            return new com.example.urdataa.model.local.History(in);
        }

        @Override
        public com.example.urdataa.model.local.History[] newArray(int size) {
            return new com.example.urdataa.model.local.History[size];
        }
    };

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pivot getPivot() {
        return pivot;
    }

    public void setPivot(Pivot pivot) {
        this.pivot = pivot;
    }


}
