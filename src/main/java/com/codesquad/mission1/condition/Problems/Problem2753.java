package com.codesquad.mission1.condition.Problems;

import java.util.Scanner;

public class Problem2753 {
    public static void leafYear(Scanner scan){
        System.out.print("연도를 입력하세요 >> ");
        int year;

        try {
            year = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력하세요!");
            return;
        }

        if (year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0)))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
