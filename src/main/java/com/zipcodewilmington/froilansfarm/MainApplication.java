package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.classes.*;
import com.zipcodewilmington.froilansfarm.enums.DayOfTheWeek;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        // Create the Chicken objects using a loop
        Chicken[] chickens = new Chicken[15];
        for (int i = 0; i < chickens.length; i++) {
            chickens[i] = new Chicken();
        }

        // Create the ChickenCoops using the Chicken arrays
        ChickenCoop[] coops = new ChickenCoop[4];
        coops[0] = new ChickenCoop(new Chicken[] { chickens[0], chickens[1], chickens[2], chickens[3], chickens[4] });
        coops[1] = new ChickenCoop(new Chicken[] { chickens[5], chickens[6], chickens[7], chickens[8] });
        coops[2] = new ChickenCoop(new Chicken[] { chickens[9], chickens[10], chickens[11] });
        coops[3] = new ChickenCoop(new Chicken[] { chickens[12], chickens[13], chickens[14] });

        // Created the horses objects using a loop
        Horse[] horses = new Horse[10];
        for (int i = 0; i < horses.length; i++) {
            horses[i] = new Horse();
        }

        // Create the Stables using the Horse arrays
        Stable[] stables = new Stable[3];
        stables[0] = new Stable(new Horse[] { horses[0], horses[1], horses[2], horses[3] });
        stables[1] = new Stable(new Horse[] { horses[4], horses[5], horses[6], horses[7] });
        stables[2] = new Stable(new Horse[] { horses[8], horses[9] });

        Crop corn = new Cornstalk();
        Crop tomato = new TomatoPlant();

        // Create the crop rows
        CropRow rowOne = new CropRow(new Crop[] {corn});
        CropRow rowTwo = new CropRow(new Crop[] {tomato});
        CropRow rowThree = new CropRow(new Crop[] {});
        CropRow rowFour = new CropRow(new Crop[] {});
        CropRow rowFive = new CropRow(new Crop[] {});

        // Add the crop rows to the field
        Field field = new Field(new CropRow[] {rowOne, rowTwo, rowThree, rowFour, rowFive});

        Farmer froilan = new Farmer("Froilan");
        Tractor froilansTractor = new Tractor();
        CropDuster froilansCropDuster = new CropDuster();
        Vehicle[] froilainsVehicles = { froilansTractor, froilansCropDuster };
        Pilot froilanda = new Pilot("Froilanda");
        Person[] people = {froilan,froilanda};
        Aircraft cropduster = new CropDuster();
        froilanda.changePersonalAircraft(cropduster);
        FarmHouse froilansHouse = new FarmHouse(people);
        Farm froilansFarm = new Farm(froilansHouse, field, coops, stables, froilainsVehicles);
        Farm hello = new Farm();

        froilan.makeNoise();
        froilanda.mount(cropduster);
        froilansTractor.operate(froilansFarm);

        froilanda.setDay(DayOfTheWeek.Tues);
        froilan.harvest(froilansTractor,froilansFarm,rowOne);






    }

}
