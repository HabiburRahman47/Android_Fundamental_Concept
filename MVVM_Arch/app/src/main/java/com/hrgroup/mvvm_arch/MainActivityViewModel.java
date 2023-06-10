package com.hrgroup.mvvm_arch;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel {
    private String randomNumber;
    private String TAG = this.getClass().getSimpleName();

    public String getRandomNumber(){

        createRandomNumber();
        return randomNumber;
    }
    public void createRandomNumber(){

        Random rand = new Random();
        randomNumber = String.valueOf(rand.nextInt(10-1)+1);
    }

}
