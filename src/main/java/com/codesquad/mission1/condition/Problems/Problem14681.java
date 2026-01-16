package com.codesquad.mission1.condition.Problems;

import java.util.Scanner;

public class Problem14681 {
    public static void findQuadrant(Scanner scan){
        System.out.println("좌표를 입력해주세요");
        int x, y;

        try {
            System.out.print("x >>> ");
            x = Integer.parseInt(scan.nextLine());
            System.out.print("y >>> ");
            y = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("잘못된 숫자를 입력했습니다!");
            return;
        }

        int mul = x * y;
        if(x > 0 && y > 0)
            System.out.println(1);
        else if(x > 0 && y < 0)
            System.out.println(4);
        else if(x < 0 && y > 0)
            System.out.println(2);
        else
            System.out.println(3);
    }
}
