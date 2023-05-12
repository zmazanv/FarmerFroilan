package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Cornstalk extends Crop {

    public Cornstalk() {
        super();
    }
    public Cornstalk(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super(hasBeenFertilized, hasBeenHarvested);
    }

    public Edible yield() {
        if (this.isFertilized() && this.isHarvested()) {
            this.restartCycle();
            return new EarCorn();
        } else {
            return null;
        }
    }

}
