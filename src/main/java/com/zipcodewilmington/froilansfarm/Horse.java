package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    int legs;

    public Horse(int legs){
        this.legs = legs;
    }
}
