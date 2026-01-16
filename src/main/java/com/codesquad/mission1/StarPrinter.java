package com.codesquad.mission1;

import java.util.Scanner;

public class StarPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        System.out.print("별의 개수를 입력해 주세요 >>> ");
        try {
            num = scan.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요.");
            return;
        }

        if(num < 0 || num > 100){
            System.out.println("1 ~ 100만 입력해주세요!");
            return;
        }

        for(int i = 1; i <= num; i++){
            for(int j = 0; j < i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
