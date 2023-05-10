package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {

    private boolean hasBeenHarvested;

    public Crop() {this.hasBeenHarvested = false;
    }
    public Crop(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public void harvest() {
        this.hasBeenHarvested = true;
    }

    protected void restartCycle() {
        this.hasBeenHarvested = false;
    }

    public boolean isHarvested() {
        return this.hasBeenHarvested;
    }


}
