package com.zipcodewilmington.froilansfarm;

import java.util.Arrays;

public class Stable{

    private Horse[] horses;

    public Stable(Horse[] horses){
        this.horses = horses;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Stable{" +
                "horses=" + Arrays.toString(horses) +
                '}';
    }
}
