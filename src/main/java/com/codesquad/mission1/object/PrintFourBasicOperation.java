package com.codesquad.mission1.object;

public class PrintFourBasicOperation {
    private final Number number;
    private final FourBasicOperation fourBasicOperation;

    public PrintFourBasicOperation() {
        number = new Number();
        fourBasicOperation = new FourBasicOperation();
    }

    public void printPlus(){
        System.out.println(fourBasicOperation.plus(number));
    }

    public void printMinus(){
        System.out.println(fourBasicOperation.minus(number));
    }

    public void printMultiply(){
        System.out.println(fourBasicOperation.multiply(number));
    }

    public void printDivide(){
        System.out.println(fourBasicOperation.divide(number));
    }

    public void printAll(){
        printPlus();
        printMinus();
        printMultiply();
        printDivide();
    }
}
