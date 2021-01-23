package com.example.urdataa.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Event implements Parcelable {

    @SerializedName("event_id")
    String eventname;
    @SerializedName("lecturer_id")
    String lecturer;
    @SerializedName("lecturernip")
    String nip;
    @SerializedName("event_tanggal")
    String date;
    @SerializedName("event_lokasi")
    String location;
    @SerializedName("event_deskripsi")
    String desc;

    @SerializedName("tanggal_input")
    String tanggal;
    @SerializedName("pesan")
    String pesan;
    @SerializedName("is_approved")
    String approved;


    protected Event(Parcel in) {
        eventname = in.readString();
        lecturer = in.readString();
        nip = in.readString();
        date = in.readString();
        location = in.readString();
        desc = in.readString();

        tanggal = in.readString();
        pesan = in.readString();
        approved = in.readString();
    }

    public static final Creator<Event> CREATOR = new Creator<Event>() {
        @Override
        public Event createFromParcel(Parcel in) {
            return new Event(in);
        }

        @Override
        public Event[] newArray(int size) {
            return new Event[size];
        }
    };

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String event) {
        this.eventname = event;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String user) {
        this.lecturer = user;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String prestasi) {
        this.nip = prestasi;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String bukti) {
        this.date = bukti;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String dosen) {
        this.location = dosen;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String point) {
        this.desc = point;
    }



    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(eventname);
        parcel.writeString(lecturer);
        parcel.writeString(lecturer);
        parcel.writeString(date);
        parcel.writeString(location);
        parcel.writeString(desc);
        parcel.writeString(tanggal);
        parcel.writeString(pesan);
        parcel.writeString(approved);
    }
}
