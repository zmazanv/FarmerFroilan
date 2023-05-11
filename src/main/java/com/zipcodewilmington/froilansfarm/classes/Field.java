package com.zipcodewilmington.froilansfarm.classes;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Field {

    private final List<CropRow> cropRows = new LinkedList<CropRow>();

    public Field() {}
    public Field(CropRow croprow) {
        this.cropRows.add(croprow);
    }
    public Field(CropRow[] cropRows) {
        this.cropRows.addAll(Arrays.asList(cropRows));
    }
    public Field(List<CropRow> cropRows) {
        this.cropRows.addAll(cropRows);
    }

    public List<CropRow> whichCropRows() {
        return this.cropRows;
    }

    public void store(CropRow cropRow) {
        this.cropRows.add(cropRow);
    }
    public void store(CropRow[] cropRows) {
        this.cropRows.addAll(Arrays.asList(cropRows));
    }
    public void store(List<CropRow> cropRows) {
        this.cropRows.addAll(cropRows);
    }

}
