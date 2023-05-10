package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.*;

public class Farmer extends Person implements Eater, Rider, Botanist{

    private Horse[] horses;
    private FarmVehicle[] farmVehicles;

    public Farmer(String name) {
        super(name);
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public void mount(Rideable rideable) {}
    public void dismount(Rideable rideable) {}

    public void plant(Crop crop, CropRow cropRow) {}

    public void eat(Edible edible) {}

    public void makeNoise() {
        System.out.println("YEEEHAAAAWWWWW");
    }
}
