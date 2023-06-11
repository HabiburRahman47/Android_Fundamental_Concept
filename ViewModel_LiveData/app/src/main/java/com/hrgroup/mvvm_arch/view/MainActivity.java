package com.hrgroup.mvvm_arch.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.hrgroup.mvvm_arch.viewmodel.MainActivityViewModel;
import com.hrgroup.mvvm_arch.R;

public class MainActivity extends AppCompatActivity {

   MainActivityViewModel mainActivityViewModel;

    private TextView number1TV,number2TV,resultTV;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connect with viewModel
        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        number1TV = findViewById(R.id.number1);
        number2TV = findViewById(R.id.number2);
        resultTV = findViewById(R.id.result);
        button = findViewById(R.id.sumBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(number1TV.getText().toString());
                int number2 = Integer.parseInt(number2TV.getText().toString());
                mainActivityViewModel.add(number1, number2);
            }
        });

        mainActivityViewModel.getSumLiveData().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                resultTV.setText(String.valueOf(integer));
            }
        });
    }
}