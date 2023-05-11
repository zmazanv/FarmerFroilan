package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public class PickupTruck extends Vehicle{
    private String brand;
    private String color;

    public PickupTruck(String brand,String color) {

        this.brand = brand;
        this.color = color;

    }

    public void makeNoise() {
        System.out.println("VROOOOOOOOMMMMMM(V8 ENGINE ROARING)");

    }

}