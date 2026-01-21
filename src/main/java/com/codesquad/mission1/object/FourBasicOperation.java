package com.codesquad.mission1.object;

public class FourBasicOperation {
    FourBasicOperation(){

    }

    public int plus(Number number) {
        return number.getFirstNum() + number.getSecondNum();
    }

    public int minus(Number number){
        return number.getFirstNum() - number.getSecondNum();
    }

    public int multiply(Number number){
        return number.getFirstNum() * number.getSecondNum();
    }

    public int divide(Number number){
        return number.getFirstNum() / number.getSecondNum();
    }
}
