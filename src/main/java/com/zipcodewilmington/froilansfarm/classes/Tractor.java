package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {

    public Tractor() {}

    public void harvest(Crop crop) {
        crop.harvest();
    }

    public void operate(Farm farm) {}

    public void beMounted() {}
    public void beDismounted() {}

}
