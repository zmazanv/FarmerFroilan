package com.zipcodewilmington.froilansfarm.classes;

import java.util.*;

public class Farm {

    private final FarmHouse farmHouse;
    private final Field field;
    private final List<ChickenCoop> chickenCoops = new LinkedList<ChickenCoop>();
    private final List<Stable> stables = new LinkedList<Stable>();
    private final List<Vehicle> vehicles = new LinkedList<Vehicle>();

    public Farm() {
        this.farmHouse = new FarmHouse();
        this.field = new Field();
    }
    public Farm(FarmHouse farmHouse, Field field, ChickenCoop chickenCoop, Stable stable, Vehicle vehicle) {
        this.farmHouse = farmHouse;
        this.field = field;
        this.chickenCoops.add(chickenCoop);
        this.stables.add(stable);
        this.vehicles.add(vehicle);
    }
    public Farm(FarmHouse farmHouse, Field field, ChickenCoop[] chickenCoops, Stable[] stables, Vehicle[] vehicles) {
        this.farmHouse = farmHouse;
        this.field = field;
        this.chickenCoops.addAll(Arrays.asList(chickenCoops));
        this.stables.addAll(Arrays.asList(stables));
        this.vehicles.addAll(Arrays.asList(vehicles));
    }
    public Farm(FarmHouse farmHouse, Field field, Collection<ChickenCoop> chickenCoops, Collection<Stable> stables, Collection<Vehicle> vehicles) {
        this.farmHouse = farmHouse;
        this.field = field;
        this.chickenCoops.addAll(chickenCoops);
        this.stables.addAll(stables);
        this.vehicles.addAll(vehicles);
    }

    public FarmHouse whichFarmHouse() {
        return this.farmHouse;
    }
    public Field whichField() {
        return this.field;
    }
    public List<ChickenCoop> whichChickenCoops() {
        return this.chickenCoops;
    }
    public List<Stable> whichStables() {
        return this.stables;
    }
    public List<Vehicle> whichVehicles() {
        return this.vehicles;
    }

    public void addChickenCoop(ChickenCoop chickenCoop) {
        this.chickenCoops.add(chickenCoop);
    }
    public void addChickenCoop(ChickenCoop[] chickenCoops) {
        this.chickenCoops.addAll(Arrays.asList(chickenCoops));
    }
    public void addChickenCoop(Collection<ChickenCoop> chickenCoops) {
        this.chickenCoops.addAll(chickenCoops);
    }
    public ChickenCoop removeChickenCoop(int chickenCoopIdentificationNumber) {
        return this.chickenCoops.remove(chickenCoopIdentificationNumber - 1);
    }
    public ChickenCoop removeChickenCoop(ChickenCoop chickenCoopToBeRemoved) {
        if (this.chickenCoops.remove(chickenCoopToBeRemoved)) {
            return chickenCoopToBeRemoved;
        } else {
            return null;
        }
    }
    public List<ChickenCoop> removeChickenCoop(int startingChickenCoopIdentificationNumber, int endingChickenCoopIdentificationNumber) {
        List<ChickenCoop> chickenCoopsSubList = this.chickenCoops.subList((startingChickenCoopIdentificationNumber - 1), endingChickenCoopIdentificationNumber);
        List<ChickenCoop> removedChickenCoops = new LinkedList<ChickenCoop>(chickenCoopsSubList);
        this.chickenCoops.removeAll(chickenCoopsSubList);
        return removedChickenCoops;
    }
    public List<ChickenCoop> removeChickenCoop(ChickenCoop[] chickenCoopsToBeRemoved) {
        List<ChickenCoop> removedChickenCoops = new LinkedList<ChickenCoop>(this.chickenCoops);
        List<ChickenCoop> chickenCoopsToBeRemovedAsList = new ArrayList<ChickenCoop>(Arrays.asList(chickenCoopsToBeRemoved));
        removedChickenCoops.retainAll(chickenCoopsToBeRemovedAsList);
        this.chickenCoops.removeAll(chickenCoopsToBeRemovedAsList);
        return removedChickenCoops;
    }
    public List<ChickenCoop> removeChickenCoop(Collection<ChickenCoop> chickenCoopsToBeRemoved) {
        List<ChickenCoop> removedChickenCoops = new LinkedList<ChickenCoop>(this.chickenCoops);
        removedChickenCoops.retainAll(chickenCoopsToBeRemoved);
        this.chickenCoops.removeAll(chickenCoopsToBeRemoved);
        return removedChickenCoops;
    }
    public List<ChickenCoop> clearChickenCoops() {
        List<ChickenCoop> clearedChickenCoops = new LinkedList<ChickenCoop>(this.chickenCoops);
        this.chickenCoops.clear();
        return clearedChickenCoops;
    }

    public void addStable(Stable stable) {
        this.stables.add(stable);
    }
    public void addStable(Stable[] stables) {
        this.stables.addAll(Arrays.asList(stables));
    }
    public void addStable(Collection<Stable> stables) {
        this.stables.addAll(stables);
    }
    public Stable removeStable(int stableIdentificationNumber) {
        return this.stables.remove(stableIdentificationNumber - 1);
    }
    public Stable removeStable(Stable stableToBeRemoved) {
        if (this.stables.remove(stableToBeRemoved)) {
            return stableToBeRemoved;
        } else {
            return null;
        }
    }
    public List<Stable> removeStable(int startingStableIdentificationNumber, int endingStableIdentificationNumber) {
        List<Stable> stablesSubList = this.stables.subList((startingStableIdentificationNumber - 1), endingStableIdentificationNumber);
        List<Stable> removedStables = new LinkedList<Stable>(stablesSubList);
        this.stables.removeAll(stablesSubList);
        return removedStables;
    }
    public List<Stable> removeStable(Stable[] stablesToBeRemoved) {
        List<Stable> removedStables = new LinkedList<Stable>(this.stables);
        List<Stable> stablesToBeRemovedAsList = new ArrayList<Stable>(Arrays.asList(stablesToBeRemoved));
        removedStables.retainAll(stablesToBeRemovedAsList);
        this.stables.removeAll(stablesToBeRemovedAsList);
        return removedStables;
    }
    public List<Stable> removeStable(Collection<Stable> stablesToBeRemoved) {
        List<Stable> removedStables = new LinkedList<Stable>(this.stables);
        removedStables.retainAll(stablesToBeRemoved);
        this.stables.removeAll(stablesToBeRemoved);
        return removedStables;
    }
    public List<Stable> clearStables() {
        List<Stable> clearedStables = new LinkedList<Stable>(this.stables);
        this.stables.clear();
        return clearedStables;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
    public void addVehicle(Vehicle[] vehicles) {
        this.vehicles.addAll(Arrays.asList(vehicles));
    }
    public void addVehicle(Collection<Vehicle> vehicles) {
        this.vehicles.addAll(vehicles);
    }
    public Vehicle removeVehicle(int vehicleIdentificationNumber) {
        return this.vehicles.remove(vehicleIdentificationNumber - 1);
    }
    public Vehicle removeVehicle(Vehicle vehicleToBeRemoved) {
        if (this.vehicles.remove(vehicleToBeRemoved)) {
            return vehicleToBeRemoved;
        } else {
            return null;
        }
    }
    public List<Vehicle> removeVehicle(int startingVehicleIdentificationNumber, int endingVehicleIdentificationNumber) {
        List<Vehicle> vehiclesSubList = this.vehicles.subList((startingVehicleIdentificationNumber - 1), endingVehicleIdentificationNumber);
        List<Vehicle> removedVehicles = new LinkedList<Vehicle>(vehiclesSubList);
        this.vehicles.removeAll(vehiclesSubList);
        return removedVehicles;
    }
    public List<Vehicle> removeVehicle(Vehicle[] vehiclesToBeRemoved) {
        List<Vehicle> removedVehicles = new LinkedList<Vehicle>(this.vehicles);
        List<Vehicle> vehiclesToBeRemovedAsList = new ArrayList<Vehicle>(Arrays.asList(vehiclesToBeRemoved));
        removedVehicles.retainAll(vehiclesToBeRemovedAsList);
        this.vehicles.removeAll(vehiclesToBeRemovedAsList);
        return removedVehicles;
    }
    public List<Vehicle> removeVehicle(Collection<Vehicle> vehiclesToBeRemoved) {
        List<Vehicle> removedVehicles = new LinkedList<Vehicle>(this.vehicles);
        removedVehicles.retainAll(vehiclesToBeRemoved);
        this.vehicles.removeAll(vehiclesToBeRemoved);
        return removedVehicles;
    }
    public List<Vehicle> clearVehicles() {
        List<Vehicle> clearVehicles = new LinkedList<Vehicle>(this.vehicles);
        this.vehicles.clear();
        return clearVehicles;
    }
    public List<Vehicle> replaceVehicles(Vehicle[] replacementVehicles) {
        List<Vehicle> clearVehicles = new LinkedList<Vehicle>(this.vehicles);
        this.vehicles.clear();
        this.vehicles.addAll(Arrays.asList(replacementVehicles));
        return clearVehicles;
    }
    public List<Vehicle> replaceVehicles(Collection<Vehicle> replacementVehicles) {
        List<Vehicle> clearVehicles = new LinkedList<Vehicle>(this.vehicles);
        this.vehicles.clear();
        this.vehicles.addAll(replacementVehicles);
        return clearVehicles;
    }

}
