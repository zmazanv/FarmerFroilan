package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TuesdayTest {

    @Test
    void tuesday() {
        //GIVEN
        Farmer farmer = new Farmer("Froilan");
        Tractor tractor = new Tractor();
        Crop corn1 = new Cornstalk();
        Crop corn2 = new Cornstalk();
        Crop corn3 = new Cornstalk();
        Crop corn4 = new Cornstalk();
        CropRow cropRow1 = new CropRow(Arrays.asList(corn1, corn2));
        CropRow cropRow2 = new CropRow(Arrays.asList(corn3, corn4));
        Field field = new Field(Arrays.asList(cropRow1, cropRow2));
        Farm farm = new Farm(field, null, null, null);

        //WHEN
        Tuesday.tuesday(farmer, tractor, farm);

        //THEN
        assertTrue(corn1.isHarvested());
        assertTrue(corn2.isHarvested());
        assertTrue(corn3.isHarvested());
        assertTrue(corn4.isHarvested());
    }

}
