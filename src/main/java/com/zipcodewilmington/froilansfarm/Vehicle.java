package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public abstract class Vehicle<F extends FarmVehicle> implements Rideable, NoiseMaker {

    public Vehicle(){}

}
