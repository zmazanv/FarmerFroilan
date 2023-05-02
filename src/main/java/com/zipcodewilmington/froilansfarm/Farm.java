package com.zipcodewilmington.froilansfarm;

import java.util.Arrays;

public class Farm {

    private Stable[] stables;
    private ChickenCoop[] chickenCoops;
    private FarmHouse farmHouse;

    public Farm(Stable[] stables, ChickenCoop[] chickenCoops, FarmHouse farmHouse){
        this.stables = stables;
        this.chickenCoops = chickenCoops;
        this.farmHouse = farmHouse;
    }

    public Stable[] getStables() {
        return stables;
    }

    public void setStables(Stable[] stables) {
        this.stables = stables;
    }

    public ChickenCoop[] getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ChickenCoop[] chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "stables=" + Arrays.toString(stables) +
                ", chickenCoops=" + Arrays.toString(chickenCoops) +
                ", farmHouse=" + farmHouse +
                '}';
    }
}
