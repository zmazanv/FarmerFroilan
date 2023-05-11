package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle {

    public CropDuster() {}

    public void operate(Farm farm) {
        System.out.println("Operating on " + farm);
    }

    public void fly() {
        System.out.println("VROOOOMM 'FLYING'  ");
    }

    public void makeNoise() {
        System.out.println(" 'FLYING NOISE' ");
    }
    public void fertalize(CropRow cropRow) {
        System.out.println("Fertalizing " + cropRow);
    }

}
