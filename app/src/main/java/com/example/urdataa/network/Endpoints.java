package com.example.urdataa.network;

import com.example.urdataa.model.response.EventResponse;
import com.example.urdataa.model.response.LecturerResponse;
import com.example.urdataa.model.response.TokenResponse;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Endpoints {

    @POST("api-login")
    @FormUrlEncoded
    Call<TokenResponse> login (@Field("email") String email, @Field("password") String password);

    @GET("events")
    Call<EventResponse> getEvents();

    @GET("Lecturer")
    Call<LecturerResponse> getLecturers();

    @POST("logout")
    Call<JsonObject> logout();
}
