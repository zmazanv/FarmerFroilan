package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class TomatoPlant extends Crop {

    public TomatoPlant() {
        super();
    }

    public TomatoPlant(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super(hasBeenFertilized, hasBeenHarvested);
    }

    public Edible yield() {
        if (this.isFertilized() && this.isHarvested()) {
            this.restartCycle();
            return new Tomato();
        } else {
            return null;
        }
    }

}
