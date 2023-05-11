package com.zipcodewilmington.froilansfarm.classes;

import java.util.*;

public class Stable {

    private final List<Horse> heldHorses = new LinkedList<Horse>();

    public Stable() {}
    public Stable(Horse horse) {
        this.heldHorses.add(horse);
    }
    public Stable(Horse[] horses) {
        this.heldHorses.addAll(Arrays.asList(horses));
    }
    public Stable(List<Horse> horses) {
        this.heldHorses.addAll(horses);
    }

    public List<Horse> whichHorses() {
        return this.heldHorses;
    }

    public void store(Horse horse) {
        this.heldHorses.add(horse);
    }
    public void store(Horse[] horses) {
        this.heldHorses.addAll(Arrays.asList(horses));
    }
    public void store(List<Horse> horses) {
        this.heldHorses.addAll(horses);
    }

    public Horse moveOut(int horseIdentificationNumber) {
        return this.heldHorses.remove(horseIdentificationNumber - 1);
    }
    public Horse moveOut(Horse horseToBeMovedOut) {
        if (this.heldHorses.remove(horseToBeMovedOut)) {
            return horseToBeMovedOut;
        } else {
            return null;
        }
    }
    public List<Horse> moveOut(int startingHorseIdentificationNumber, int endingHorseIdentificationNumber) {
        List<Horse> heldHorsesSubList = this.heldHorses.subList((startingHorseIdentificationNumber - 1), endingHorseIdentificationNumber);
        List<Horse> movedOutHorses = new LinkedList<Horse>(heldHorsesSubList);
        this.heldHorses.removeAll(heldHorsesSubList);
        return movedOutHorses;
    }
    public List<Horse> moveOut(Horse[] horsesToBeMovedOut) {
        List<Horse> movedOutHorses = new LinkedList<Horse>(this.heldHorses);
        List<Horse> horsesToBeMovedOutAsList = new ArrayList<Horse>(Arrays.asList(horsesToBeMovedOut));
        movedOutHorses.retainAll(horsesToBeMovedOutAsList);
        this.heldHorses.removeAll(horsesToBeMovedOutAsList);
        return movedOutHorses;
    }
    public List<Horse> moveOut(List<Horse> horsesToBeMovedOut) {
        List<Horse> movedOutHorses = new LinkedList<Horse>(this.heldHorses);
        movedOutHorses.retainAll(horsesToBeMovedOut);
        this.heldHorses.removeAll(horsesToBeMovedOut);
        return movedOutHorses;
    }

}
