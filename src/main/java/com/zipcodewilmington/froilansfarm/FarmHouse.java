package com.zipcodewilmington.froilansfarm;

import java.util.Arrays;

public class FarmHouse {

    private Person[] people;

    public FarmHouse(Person[] people){

        this.people = people;
    }

    public Person[] getPeople() {

        return people;
    }

    public void setPeople(Person[] people) {

        this.people = people;
    }

    @Override
    public String toString() {
        return "FarmHouse{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}