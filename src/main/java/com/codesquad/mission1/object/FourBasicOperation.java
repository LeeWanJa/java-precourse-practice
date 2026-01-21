package com.codesquad.mission1.object;

public class FourBasicOperation {
    private final int firstNum;
    private final int secondNum;

    public FourBasicOperation() {
        firstNum = 10;
        secondNum = 2;
    }

    public int plus(){
        return firstNum + secondNum;
    }

    public int minus(){
        return firstNum - secondNum;
    }

    public int multiply(){
        return firstNum * secondNum;
    }

    public int divide(){
        return firstNum / secondNum;
    }
}

