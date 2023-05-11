package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Pilot extends Person implements Rider {

private Aircraft personalAircraft;

    public Pilot(String name) {
        super(name);
    }
    public Pilot(String name, Aircraft aircraft) {
        super(name);
        this.personalAircraft = aircraft;
    }

    public Aircraft whichPersonalAircraft() {
        return this.personalAircraft;
    }
    public void changePersonalAircraft(Aircraft aircraft) {
        this.personalAircraft = aircraft;
    }

    public void mount(Rideable rideable) {}
    public void dismount(Rideable rideable) {}

}
