package com.example.urdataa.model.local;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("email")
    String email;

    @SerializedName("role")
    String role;

    @SerializedName("is_admin")
    String admin;

    @SerializedName("lecturer")
    private Lecturer lecturerResults;

    public User(){
    }

    public Lecturer getLecturerResults() {
        return lecturerResults;
    }

    public void setLecturerResults(Lecturer lecturerResults) {
        this.lecturerResults = lecturerResults;
    }

    public User(String email, String role, String admin, Lecturer lecturerResults) {
        this.email = email;
        this.role = role;
        this.admin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
}
