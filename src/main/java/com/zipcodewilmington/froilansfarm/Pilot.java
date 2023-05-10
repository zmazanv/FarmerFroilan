package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
public class Pilot extends Person {

private Aircraft aircraft;

    public Pilot(String name) {
        super(name);
    }

    public void mount(Rideable rideable) {
        System.out.println("Mounting " + aircraft.toString());
    }

    public void dismount(Rideable rideable) {
        System.out.println("Dismounting " + aircraft.toString());
    }

    public void eat(Edible edible) {
        System.out.println(getName() + "is eating an" + edible );
    }

    public void makeNoise() {
        System.out.println("YEEEEEHAAWWWWWW");
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }
}
