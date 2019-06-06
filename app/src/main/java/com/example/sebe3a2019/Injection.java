package com.example.sebe3a2019;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Injection {
    private static RestApiPeople restApipeople;

    //Singleton
    public static RestApiPeople getRestApi(){
        if(restApipeople == null){
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://swapi.co/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            restApipeople = retrofit.create(RestApiPeople.class);
        }
        return restApipeople;
    }
}
