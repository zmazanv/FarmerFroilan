package com.zipcodewilmington.froilansfarm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Field {

    private final List<CropRow> area = new LinkedList<CropRow>();

    public Field() {}
    public Field(CropRow croprow) {
        this.area.add(croprow);
    }
    public Field(CropRow[] cropRows) {
        this.area.addAll(Arrays.asList(cropRows));
    }
    public Field(List<CropRow> cropRows) {
        this.area.addAll(cropRows);
    }

    public void store(CropRow cropRow) {
        this.area.add(cropRow);
    }
    public void store(CropRow[] cropRows) {
        this.area.addAll(Arrays.asList(cropRows));
    }
    public void store(List<CropRow> cropRows) {
        this.area.addAll(cropRows);
    }

    public List<CropRow> getArea() {
        return this.area;
    }

}
