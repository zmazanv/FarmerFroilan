package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle {


    public Tractor() {

    }

    public void operate(Farm farm) {
        System.out.println(getClass().getSimpleName() + " is operating on" + farm);
    }


    public void makeNoise() {
        System.out.println("VROOM VROOM VROOOM");
    }




}
