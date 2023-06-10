package com.hrgroup.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        apiInterface = RetrofitInstance.getRetrofit().create(ApiInterface.class);
        apiInterface.getMovies().enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                if (response.body().size()>0){
                    List<Model> movies = response.body();
                    Adapter adapter = new Adapter(MainActivity.this,movies);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setAdapter(adapter);
                    Toast.makeText(MainActivity.this,"List is no Empty",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"List is Empty",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}