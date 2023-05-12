package com.zipcodewilmington.froilansfarm.classes;

import java.util.*;

public class ChickenCoop {

    private final List<Chicken> heldChickens = new LinkedList<Chicken>();

    public ChickenCoop() {}
    public ChickenCoop(Chicken chicken) {
        this.heldChickens.add(chicken);
    }
    public ChickenCoop(Chicken[] chickens) {
        this.heldChickens.addAll(Arrays.asList(chickens));
    }
    public ChickenCoop(List<Chicken> chickens) {
        this.heldChickens.addAll(chickens);
    }

    public List<Chicken> whichChickens() {
        return this.heldChickens;
    }

    public void store(Chicken chicken) {
        this.heldChickens.add(chicken);
    }
    public void store(Chicken[] chickens) {
        this.heldChickens.addAll(Arrays.asList(chickens));
    }
    public void store(List<Chicken> chickens) {
        this.heldChickens.addAll(chickens);
    }

    public Chicken moveOut(int chickenIdentificationNumber) {
        return this.heldChickens.remove(chickenIdentificationNumber - 1);
    }
    public Chicken moveOut(Chicken chickenToBeMovedOut) {
        if (this.heldChickens.remove(chickenToBeMovedOut)) {
            return chickenToBeMovedOut;
        } else {
            return null;
        }
    }
    public List<Chicken> moveOut(int startingChickenIdentificationNumber, int endingChickenIdentificationNumber) {
        List<Chicken> heldChickensSubList = this.heldChickens.subList((startingChickenIdentificationNumber - 1), endingChickenIdentificationNumber);
        List<Chicken> movedOutChickens = new LinkedList<Chicken>(heldChickensSubList);
        this.heldChickens.removeAll(heldChickensSubList);
        return movedOutChickens;
    }
    public List<Chicken> moveOut(Chicken[] chickensToBeMovedOut) {
        List<Chicken> movedOutChickens = new LinkedList<Chicken>(this.heldChickens);
        List<Chicken> chickensToBeMovedOutAsList = new ArrayList<Chicken>(Arrays.asList(chickensToBeMovedOut));
        movedOutChickens.retainAll(chickensToBeMovedOutAsList);
        this.heldChickens.removeAll(chickensToBeMovedOutAsList);
        return movedOutChickens;
    }
    public List<Chicken> moveOut(List<Chicken> chickensToBeMovedOut) {
        List<Chicken> movedOutChickens = new LinkedList<Chicken>(this.heldChickens);
        movedOutChickens.retainAll(chickensToBeMovedOut);
        this.heldChickens.removeAll(chickensToBeMovedOut);
        return movedOutChickens;
    }

}
