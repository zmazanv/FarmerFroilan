package com.zipcodewilmington.froilansfarm.classes;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {

    boolean hasBeenFertilized;

    public Chicken() {
        this.hasBeenFertilized = false;
    }
    public Chicken(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public void fertilize() {
        this.hasBeenFertilized = true;
    }

    public boolean isFertilized() {
        return this.hasBeenFertilized;
    }

    public Edible yield() {
        if (this.hasBeenFertilized) {
            this.hasBeenFertilized = false;
            return new EdibleEgg();
        } else {
            return null;
        }
    }

}
