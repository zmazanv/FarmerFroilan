package com.zipcodewilmington.froilansfarm;

public class Tuesday {
    public static void tuesday(Farmer farmer, Tractor tractor, Farm farm) {
        //everyMorning(){}
        farmer.mount(tractor);
        tractor.operate(farm);
        for(CropRow row : farm.getField().getArea()) {
            for(Crop crop : row.getRow()) {
                tractor.makeNoise();
                crop.harvest();
            }
        }
    }
}
