package com.zipcodewilmington.froilansfarm;

public class Stable{

    private Horse[] horses;

    public Stable(Horse[] horses){
        this.horses = horses;
    }

    public Horse[] getHorses() {
        return this.horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

}
