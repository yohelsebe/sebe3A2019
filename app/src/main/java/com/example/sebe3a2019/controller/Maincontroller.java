package com.example.sebe3a2019.controller;

import com.example.sebe3a2019.RestApiPeople;
import com.example.sebe3a2019.model.People;
import com.example.sebe3a2019.model.RestPeopleResponse;
import com.example.sebe3a2019.view.MainActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Maincontroller {

    public MainActivity view;
    private RestApiPeople restApipeople;

    public Maincontroller(MainActivity view, RestApiPeople restApipeople) {
        this.view = view;
        this.restApipeople = restApipeople;
    }

    public void onCreate() {
        Call<RestPeopleResponse> call = restApipeople.getpeopleData();
        call.enqueue(new Callback<RestPeopleResponse>() {
            @Override
            public void onResponse(Call<RestPeopleResponse> call, Response<RestPeopleResponse> response) {
                RestPeopleResponse restpeopleResponse = response.body();
                List<People> PeopleList = restpeopleResponse.getResults();
                view.showList(PeopleList);
            }

            @Override
            public void onFailure(Call<RestPeopleResponse> call, Throwable t) {

            }
        });
    }
}