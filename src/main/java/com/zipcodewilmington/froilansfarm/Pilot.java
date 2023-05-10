package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Pilot extends Person {
private Aircraft<Vehicle> aircraft;

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

    public void setAircraft(Aircraft<Vehicle> aircraft) {
        this.aircraft = aircraft;
    }
}
