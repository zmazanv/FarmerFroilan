package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestMonday {

    @Test
    public void testMonday(){
        Pilot pilot = new Pilot("Froilanda");
        CropDuster cropDuster = new CropDuster();

        CropRow rowOne = new CropRow(new Crop[] {});
        CropRow rowTwo = new CropRow(new Crop[] {});


        pilot.setAircraft(cropDuster);
        pilot.mount(cropDuster);

        cropDuster.fly();

        //Test to see if each row is fertilized
        Assert.assertFalse(rowOne.isFertilized());
        Assert.assertFalse(rowTwo.isFertilized());

        cropDuster.fertalize(rowOne);
        cropDuster.fertalize(rowTwo);

        Assert.assertTrue(rowOne.isFertilized());
        Assert.assertTrue(rowTwo.isFertilized());

    }
}
