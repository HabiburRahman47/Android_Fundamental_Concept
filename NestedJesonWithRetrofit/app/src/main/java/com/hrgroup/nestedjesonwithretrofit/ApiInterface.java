package com.hrgroup.nestedjesonwithretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("products")
    Call<List<Product>> getProducts();
}
