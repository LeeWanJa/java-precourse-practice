package com.codesquad.mission1.condition;

import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
        String input;
        Scanner userInput = new Scanner(System.in);

        ConditionPrint.printMain();
        while(!(input = userInput.nextLine()).equals("exit")){
            // 띄어쓰기 제어
            input = input.trim();

            switch(input){
                case "1" -> System.out.println("1");
                case "2" -> System.out.println("2");
                case "3" -> System.out.println("3");
                case "4" -> System.out.println("4");
                case "5" -> System.out.println("5");
                case "6" -> System.out.println("6");
                case "7" -> System.out.println("7");
                default -> System.out.println("잘못된 숫자를 입력했습니다. 1 ~ 7 혹은 exit를 입력해주세요!");
            };

            System.out.println("----------------------------");

            ConditionPrint.printMain();
        }
    }
}
