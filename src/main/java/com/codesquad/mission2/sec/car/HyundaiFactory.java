package com.codesquad.mission2.sec.car;

public class HyundaiFactory {
    private static int carNum;

    private HyundaiFactory() {
        carNum = 1000;
    }

    public static HyundaiFactory getFactory() {
        return new HyundaiFactory();
    }

    public Car createCar(){
        return new Car(carNum++);
    }
}
