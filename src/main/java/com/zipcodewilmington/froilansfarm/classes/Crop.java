package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }
    public Crop(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        this.hasBeenFertilized = hasBeenFertilized;
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public void fertilize() {
        this.hasBeenFertilized = true;
    }
    public void harvest() {
        this.hasBeenHarvested = true;
    }

    protected void restartCycle() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    public boolean isFertilized() {
        return this.hasBeenFertilized;
    }
    public boolean isHarvested() {
        return this.hasBeenHarvested;
    }

}
