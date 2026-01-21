package com.codesquad.mission1.object;

import com.codesquad.mission1.object.fourbasic.PrintFourBasicOperation;
import com.codesquad.mission1.object.person.Person;

public class ObjectMain {
    public static void main(String[] args) {
        // 1번
        System.out.println("===== 1 =====");
        PrintFourBasicOperation printFourBasicOperation = new PrintFourBasicOperation();
        printFourBasicOperation.printAll();
        System.out.println();

        // 2번
        System.out.println("===== 2 =====");
        Person person = new Person("제인", 30, false, true, 1);
        person.printInfo();
        System.out.println();

        // 3번
        System.out.println("===== 3 =====");

    }
}
