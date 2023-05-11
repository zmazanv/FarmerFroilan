package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
public class Horse extends Animal implements Rideable {

    private boolean ate;
    public Horse(int legs, String eyes, String color) {

        super();
    }
    public Horse(){
        this.ate = false;
    }
    public void makeNoise() {

        System.out.println("heeeeeuhhhhhh");

    }

    public void mount() {

    }

    public void dismount() {

    }

    public void eat(Edible edible) {
        this.ate = true;
    }
    public boolean didItEat(){
        return this.ate;
    }

}