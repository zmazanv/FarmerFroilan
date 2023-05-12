package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.*;

public class Farmer extends Person implements Botanist, Rider {

    private Farm farm;

    public Farmer(String name) {
        super(name);
    }

    public Farm whichFarm() {
        return this.farm;
    }

    public void mount(Rideable rideable) {}
    public void dismount(Rideable rideable) {}
    public void plant(Crop crop, CropRow cropRow) {}
    public void harvest(FarmVehicle fm,Farm farm,CropRow cr){
        fm.operate(farm);

        for (Crop crop : cr.getCrops()) {
            // Perform the harvest action for each crop
            crop.harvest();
            System.out.println("farmer has received" + crop.toString());
        }
    }

}
