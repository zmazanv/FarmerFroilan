package com.zipcodewilmington.froilansfarm.classes;

import java.util.*;

public class FarmHouse {

    private final List<Person> residents = new LinkedList<>();

    public FarmHouse() {}
    public FarmHouse(Person person) {
        this.residents.add(person);
    }
    public FarmHouse(Person[] persons) {
        this.residents.addAll(Arrays.asList(persons));
    }
    public FarmHouse(List<Person> persons) {
        this.residents.addAll(persons);
    }

    public List<Person> whichResidents() {
        return this.residents;
    }

    public void moveIn(Person person) {
        this.residents.add(person);
    }
    public void moveIn(Person[] persons) {
        this.residents.addAll(Arrays.asList(persons));
    }
    public void moveIn(Collection<Person> persons) {
        this.residents.addAll(persons);
    }

    public Person moveOut(Person personToBeMovedOut) {
        if (this.residents.remove(personToBeMovedOut)) {
            return personToBeMovedOut;
        } else {
            return null;
        }
    }
    public Set<Person> moveOut(Person[] personsToBeMovedOut) {
        Set<Person> movedOutPersons = new TreeSet<Person>(this.residents);
        Set<Person> personsToBeMovedOutAsList = new HashSet<Person>(Arrays.asList(personsToBeMovedOut));
        movedOutPersons.retainAll(personsToBeMovedOutAsList);
        this.residents.removeAll(personsToBeMovedOutAsList);
        return movedOutPersons;
    }
    public Set<Person> moveOut(Collection<Person> personsToBeMovedOut) {
        Set<Person> movedOutPersons = new TreeSet<Person>(this.residents);
        movedOutPersons.retainAll(personsToBeMovedOut);
        this.residents.removeAll(personsToBeMovedOut);
        return movedOutPersons;
    }

}
