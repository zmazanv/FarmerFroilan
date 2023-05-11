package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TestTuesday {

    @Test
    public void testTuesday(){
        Farmer farmer = new Farmer("Froilan");
        Tractor tractor = new Tractor();
        Crop corn = new Cornstalk();
        Crop corn1 = new Cornstalk();

        CropRow cropRow = new CropRow(new Crop[] {corn, corn1});

        //Corn is not harvested yet
        Assert.assertFalse(corn.isHarvested());

        //Use tractor to harvest each crop
        farmer.mount(tractor);

        //Test to see if each crop is harvested
    }
}
