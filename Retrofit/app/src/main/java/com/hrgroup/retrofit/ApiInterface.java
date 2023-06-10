package com.hrgroup.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("movies")
    Call<List<Model>> getMovies();
}
