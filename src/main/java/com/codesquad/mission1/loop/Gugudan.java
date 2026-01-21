package com.codesquad.mission1.loop;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 단까지 출력하시겠습니까? >>> ");
        int input = 2;

        try {
            input = Integer.parseInt(scan.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요");
            return;
        }

        if(!(2 <= input && input <= 9)){
            System.out.println("2 ~ 9단만 출력할 수 있습니다.");
            return;
        }

        for(int i = 2; i <= input; i++){
            System.out.println("=====[" + i + "단]=====");
            for(int j = 1; j <= 9; j++)
                System.out.println(i + " * " + j + " = " + (i * j));
            System.out.println();
        }

    }
}
