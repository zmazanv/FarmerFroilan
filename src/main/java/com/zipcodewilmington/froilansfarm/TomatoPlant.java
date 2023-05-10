package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop{

    private Tomato tomato;

    public TomatoPlant(Tomato tomato) {

        this.tomato = tomato;
    }

    public Tomato getTomato() {

        return tomato;
    }

    public void setTomato(Tomato tomato) {

        this.tomato = tomato;
    }
}
