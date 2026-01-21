package com.codesquad.mission1.object;

import com.codesquad.mission1.object.cafe.Cafe;
import com.codesquad.mission1.object.cafe.Customer;
import com.codesquad.mission1.object.date.MyDate;
import com.codesquad.mission1.object.fourbasic.PrintFourBasicOperation;
import com.codesquad.mission1.object.person.Person;

import java.util.HashMap;

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
        Cafe starCafe = new Cafe("별다방");
        starCafe.putMenu("아메리카노", 4000);
        Cafe congCafe = new Cafe("콩다방");
        congCafe.putMenu("라떼", 5000);

        Customer james = new Customer("James", 5000);
        Customer tomas = new Customer("Tomas", 10000);
        
        james.buyCoffee(starCafe, "아메리카노");
        tomas.buyCoffee(congCafe, "라떼");
        System.out.println();

        // 4번
        System.out.println("===== 4 =====");
        MyDate date1 = new MyDate(30, 2, 2000);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(2, 10, 2006);
        System.out.println(date2.isValid());
    }
}
