package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {

    int legs;
    int wings;

    public Chicken(int legs, int wings){
        this.legs = legs;
        this.wings = wings;
    }
}
