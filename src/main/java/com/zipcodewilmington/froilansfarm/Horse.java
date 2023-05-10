package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Horse extends Animal implements Rideable{


    public Horse(int legs, String eyes, String color) {

        super(legs, eyes, color);
    }

    public void makeNoise() {

        System.out.println("heeeeeuhhhhhh");

    }

    public void mount() {

    }

    public void dismount() {

    }

    public void eat(Edible edible) {

    }


}
