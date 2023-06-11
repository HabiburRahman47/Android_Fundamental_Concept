package com.hrgroup.mvvm_arch.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<Integer> sumLiveData = new MutableLiveData<>();


    public void add(int num1, int num2){
        sumLiveData.setValue(num1+num2);
    }
    public MutableLiveData<Integer> getSumLiveData(){
        return sumLiveData;
    }


}
