package com.zipcodewilmington.froilansfarm;

public class Farm {

    private Stable[] stables;
    private ChickenCoop[] chickenCoops;
    private FarmHouse farmHouse;
    private Field field;

    public Farm(Field field,Stable[] stables, ChickenCoop[] chickenCoops, FarmHouse farmHouse){
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmHouse = farmHouse;
        this.field = field;
    }

    public ChickenCoop[] getChickenCoops() {
        return this.chickenCoops;
    }
    public FarmHouse getFarmHouse() {
        return this.farmHouse;
    }
    public Stable[] getStables() {
        return this.stables;
    }

    public void setChickenCoops(ChickenCoop[] chickenCoops) {
        this.chickenCoops = chickenCoops;
    }
    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }
    public void setStables(Stable[] stables) {
        this.stables = stables;
    }

}
