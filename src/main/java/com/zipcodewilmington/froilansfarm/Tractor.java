package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {

    public Tractor() {}

    public void operate(Farm farm) {
        System.out.println(getClass().getSimpleName() + " is operating on" + farm);
    }

    public void makeNoise() {
        System.out.println("VROOM VROOM VROOOM");
    }

}
