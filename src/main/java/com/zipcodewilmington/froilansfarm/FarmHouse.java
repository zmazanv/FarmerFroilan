package com.zipcodewilmington.froilansfarm;

public class FarmHouse {

    private Person[] people;

    public FarmHouse(Person[] people){
        this.people = people;
    }

    public Person[] getPeople() {
        return this.people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

}
