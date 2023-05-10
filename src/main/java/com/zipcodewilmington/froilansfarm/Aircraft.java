package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public abstract class Aircraft extends Vehicle implements Rideable, NoiseMaker {

    public Aircraft() {

    }

    public abstract void fly();

    public abstract void makeNoise();
}
