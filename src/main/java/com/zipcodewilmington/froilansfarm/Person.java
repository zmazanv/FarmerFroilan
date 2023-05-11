package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public abstract class Person implements NoiseMaker, Eater, Rider {

    private String name;
    private Vehicle vehicle;
    private Vehicle[] vehicles;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Vehicle getVehicle() {
        return this.vehicle;
    }
    public Vehicle[] getVehicles() {
        return this.vehicles;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

}
