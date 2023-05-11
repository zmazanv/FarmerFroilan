package com.zipcodewilmington.froilansfarm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CropRow {

    private final List<Crop> row = new LinkedList<Crop>();
    private boolean fertilized;
    public CropRow() {
        this.fertilized = false;
    }
    public CropRow(Crop crop) {
        this.row.add(crop);
    }
    public CropRow(Crop[] crops) {
        this.row.addAll(Arrays.asList(crops));
    }
    public CropRow(List<Crop> crops) {
        this.row.addAll(crops);
    }

    public void store(Crop crop) {
        this.row.add(crop);
    }
    public void store(Crop[] crops) {
        this.row.addAll(Arrays.asList(crops));
    }
    public void store(List<Crop> crops) {
        this.row.addAll(crops);
    }
    public void fertilized(){
        this.fertilized = true;
    }
    public boolean isFertilized(){
        return this.fertilized;
    }
}