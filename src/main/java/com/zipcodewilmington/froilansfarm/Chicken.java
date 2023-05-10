package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Chicken extends Animal implements Produce {


    public Chicken(int legs, String eyes, String color) {
        super(legs, eyes, color);
    }




    public void makeNoise() {

        System.out.println("cluck cluck cluck");

    }


    public void eat(Edible edible) {

    }
}
