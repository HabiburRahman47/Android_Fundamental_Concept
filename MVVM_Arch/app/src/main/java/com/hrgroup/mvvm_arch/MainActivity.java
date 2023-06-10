package com.hrgroup.mvvm_arch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivityViewModel mainActivityViewModel = new MainActivityViewModel();
        String randNumber = mainActivityViewModel.getRandomNumber();
        textView = findViewById(R.id.textTV);
        textView.setText(randNumber);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Activity destroyed");
    }
}