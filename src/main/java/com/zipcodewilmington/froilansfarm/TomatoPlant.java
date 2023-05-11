package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class TomatoPlant extends Crop {

    public TomatoPlant() {
        super();
    }

    public TomatoPlant(boolean hasBeenHarvested) {
        super(hasBeenHarvested);
    }

    public Edible yield() {
        if (this.isHarvested()) {
            this.restartCycle();
            return new Tomato();
        } else {
            return null;
        }
    }

}
