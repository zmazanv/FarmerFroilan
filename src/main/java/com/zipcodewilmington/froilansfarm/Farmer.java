package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Farmer extends Person implements Eater, Rider, Botanist{


    private Horse[] horses;

    private FarmVehicle[] farmVehicles;


    public Farmer(String name) {
        super(name);
    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    public void eat(Edible edible) {

    }

    public void plant(Crop crop, CropRow cropRow) {

    }


    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }


    public void makeNoise() {
        System.out.println("YEEEHAAAAWWWWW");
    }
}
