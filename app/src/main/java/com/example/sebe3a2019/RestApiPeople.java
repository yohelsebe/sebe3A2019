package com.example.sebe3a2019;

import com.example.sebe3a2019.model.RestPeopleResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApiPeople {

    @GET("api/people")
    Call<RestPeopleResponse> getpeopleData();

}
