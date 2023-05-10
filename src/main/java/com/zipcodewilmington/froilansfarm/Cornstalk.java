package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Cornstalk extends Crop {

    public Cornstalk() {
        super();
    }
    public Cornstalk(boolean hasBeenHarvested) {
        super(hasBeenHarvested);
    }

    public Edible yield() {
        if (this.isHarvested()) {
            this.restartCycle();
            return new EarCorn();
        } else {
            return null;
        }
    }
}
