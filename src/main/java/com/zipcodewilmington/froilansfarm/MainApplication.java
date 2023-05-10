package com.zipcodewilmington.froilansfarm;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    public static void main(String[] args) {


        // Create the Chicken objects using a loop
        Chicken[] chickens = new Chicken[15];
        for (int i = 0; i < chickens.length; i++) {
            chickens[i] = new Chicken(2,"2","white");
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
            horses[i] = new Horse(4,"2","black");
        }


        // Create the Stables using the Horse arrays
        Stable[] stables = new Stable[3];
        stables[0] = new Stable(new Horse[] { horses[0], horses[1], horses[2], horses[3] });
        stables[1] = new Stable(new Horse[] { horses[4], horses[5], horses[6], horses[7] });
        stables[2] = new Stable(new Horse[] { horses[8], horses[9] });

        Crop cropOne = new Crop();
        Crop cropTwo = new Crop();
        Crop cropThree = new Crop();
        Crop cropFour = new Crop();

        Crop[] crops = {cropOne,cropTwo};
        Crop[] cropsTwo = {cropThree,cropFour};

        CropRow cropRowOne = new CropRow(crops);
        CropRow cropRowTwo = new CropRow(cropsTwo);
        CropRow[] cropRows = {cropRowOne,cropRowTwo};

        Field froilansField = new Field(cropRows);

        Farmer froilan = new Farmer("Froilan");
        PickupTruck froilansTruck = new PickupTruck("Ford","Cream");
        Tractor froilansTractor = new Tractor();
        CropDuster froilansCropDuster = new CropDuster();
        Vehicle[] froilainsVehicles = {froilansTractor,froilansTruck,froilansCropDuster};
        froilan.setVehicles(froilainsVehicles);


        Pilot froilanda = new Pilot("Froilanda");
        Aircraft cropduster = new CropDuster();
        froilanda.setAircraft(cropduster);


        Person[] people = {froilan,froilanda};

        FarmHouse froilansHouse = new FarmHouse(people);



        Farm froilansFarm = new Farm(field,stables,coops,froilansHouse);


    }


}
