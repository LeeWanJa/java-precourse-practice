package com.codesquad.mission1.condition.Problems;

import java.util.Scanner;

public class Problem1330 {
    public static void compareInt(Scanner scan){
        System.out.println("비교할 두 정수를 입력해주세요(띄어쓰기로 구분).");
        System.out.print(">>> ");
        String input = scan.nextLine().trim();
        String[] inputs = input.split(" ");
        int first, second;

        try{
            first = Integer.parseInt(inputs[0]);
            second = Integer.parseInt(inputs[1]);
        } catch (NumberFormatException e){
            System.out.println("숫자를 입력해주세요!");
            return;
        } catch (Exception e) {
            System.out.println("잘못된 입력");
            return;
        }

        if(first > second) System.out.println(">");
        else if(first < second) System.out.println("<");
        else System.out.println("==");
    }
}
