package com.codesquad.mission2.sec.car;

public class Car {
    private int number;

    public Car(){
        number = -1;
    }

    public Car(int carNum){
        this.number = carNum;
    }

    public int showCarNumber(){
        return number;
    }
}
