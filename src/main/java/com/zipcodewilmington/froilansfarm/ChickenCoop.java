package com.zipcodewilmington.froilansfarm;

import java.util.Arrays;

public class ChickenCoop {

    private Chicken[] chickens;

    public ChickenCoop(Chicken[] chickens){

        this.chickens = chickens;
    }

    public Chicken[] getChickens() {

        return chickens;
    }

    public void setChickens(Chicken[] chickens) {

        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "ChickenCoop{" +
                "chickens=" + Arrays.toString(chickens) +
                '}';
    }
}