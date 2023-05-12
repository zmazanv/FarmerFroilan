package com.zipcodewilmington.froilansfarm.classes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CropRow {

    private final List<Crop> row = new LinkedList<Crop>();

    public CropRow() {}
    public CropRow(Crop crop) {
        this.row.add(crop);
    }
    public CropRow(Crop[] crops) {
        this.row.addAll(Arrays.asList(crops));
    }
    public CropRow(List<Crop> crops) {
        this.row.addAll(crops);
    }

    public List<Crop> whichCrops() {
        return this.row;
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
<<<<<<< Updated upstream:src/main/java/com/zipcodewilmington/froilansfarm/classes/CropRow.java

    public void fertilize() {
        for (Crop crop : this.row) {
            crop.fertilize();
        }
    }

=======
    public List<Crop> getCrops() {
        return row;
    }
>>>>>>> Stashed changes:src/main/java/com/zipcodewilmington/froilansfarm/CropRow.java
}
