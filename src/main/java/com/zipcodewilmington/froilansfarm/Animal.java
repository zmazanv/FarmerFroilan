package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Animal implements NoiseMaker, Eater {



    private int legs;
    private String eyes;
    private String color;



    public Animal (int legs, String eyes, String color){

        this.legs = legs;
        this.eyes = eyes;
        this.color = color;


    }

    public int getLegs() {

        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getEyes() {

        return eyes;
    }

    public void setEyes(String eyes) {

        this.eyes = eyes;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }


    public abstract void makeNoise();

    public abstract void eat(Edible edible);

}
