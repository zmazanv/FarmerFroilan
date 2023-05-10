package com.zipcodewilmington.froilansfarm;

public class ChickenCoop {

    private Chicken[] chickens;

    public ChickenCoop(Chicken[] chickens){
        this.chickens = chickens;
    }

    public Chicken[] getChickens() {
        return this.chickens;
    }

    public void setChickens(Chicken[] chickens) {
        this.chickens = chickens;
    }

}
