package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.enums.Day;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Person implements Eater, NoiseMaker {

    private String name;
    private Day day;
    public Person(String name) {
        this.name = name;
    }

    public String whichName() {
        return this.name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void eat(Edible edible) {}

    public void makeNoise() {}

    public void setDay(Day day){this.day = day;}

}
