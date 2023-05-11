package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestEveryMorning {

    @Test
    public void testEveryMorning(){

        Farmer farmer = new Farmer("Froilan");
        Pilot pilot = new Pilot("Froilanda");

        Horse[] horses = new Horse[10];
        for(int x = 0; x < horses.length; x++){
            horses[x] = new Horse(4, "2", "black");
        }

        Stable[] stables = new Stable[3];
        stables[0] = new Stable(new Horse[] {horses[0], horses[1], horses[2], horses[3]});
        stables[1] = new Stable(new Horse[] {horses[4], horses[5], horses[6], horses[7]});
        stables[2] = new Stable(new Horse[] {horses[8], horses[9]});

        //farmer and pilot rides each horse in each stable
        //Test to see if each horse is riden
        for(int x = 0; x < stables.length; x++){
            for(int y = 0; y < horses.length; y++){
                farmer.mount(horses[x]);
                pilot.mount(horses[x]);
            }
        }


        //Each horse gets 3 pieces of Ear corn
        EarCorn corn = new EarCorn();
        //Test to see if each horse is fed
        Assert.assertFalse(horses[0].didItEat());
        for(int x = 0; x < horses.length; x++){
            for(int z = 0; z < 3; z++){
                horses[x].eat(corn);
            }
        }
        Assert.assertTrue(horses[0].didItEat());


        //what Froilan and Froilanda had for breakfast


        //Test to see if Froilan and Froilanda ate
    }
}
