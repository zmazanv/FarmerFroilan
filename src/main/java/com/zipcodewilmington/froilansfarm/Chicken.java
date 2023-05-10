package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Chicken extends Animal implements Produce {

    int wings;

    public Chicken(int legs, String eyes, String color, int wings){
        super(legs, eyes, color);
        this.wings = wings;
    }

    public void makeNoise() {
        System.out.println("bok bok bok");
    }

    public void eat(Edible edible) {

    }

    public void yield(Edible edible) {

    }
}
