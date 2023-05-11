package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle {

    public void operate(Farm farm) {}

    public void fertilize(CropRow cropRow) {
        cropRow.fertilize();
    }

    public void beMounted() {}
    public void beDismounted() {}

}
