package com.zipcodewilmington.froilansfarm;

public  class Animal {
    private int legs;
    private String eyes;
    private String color;



    public Animal (int legs, String eyes, String color){

        this.legs = legs;
        this.eyes = eyes;
        this.color = color;


    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
