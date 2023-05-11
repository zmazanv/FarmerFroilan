package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

public class TestSunday {

    @Test
    public void testSunday(){

        Farmer farmer = new Farmer("Froilan");
        Crop corn = new Cornstalk();
        Crop tomato = new TomatoPlant();

        CropRow rowOne = new CropRow(new Crop[] {});
        CropRow rowTwo = new CropRow(new Crop[] {});
        CropRow rowThree = new CropRow(new Crop[] {});
        CropRow rowFour = new CropRow(new Crop[] {});
        CropRow rowFive = new CropRow(new Crop[] {});

        //Plant crops on 3 different rows
        //Test to see if each crop is planted
        farmer.plant(corn, rowOne);
        farmer.plant(tomato, rowTwo);
        farmer.plant(corn, rowThree);
    }
}
