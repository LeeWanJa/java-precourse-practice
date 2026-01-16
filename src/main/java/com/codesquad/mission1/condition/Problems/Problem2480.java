package com.codesquad.mission1.condition.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2480 {
    public static void rollTheDice(Scanner scan){
        System.out.print("주사위 세 개의 값을 입력하시오(띄어쓰기로 구분) >>> ");
        String choice = scan.nextLine();
        String[] inputs = choice.split(" ");
        int[] diceValue = new int[3];

        if(inputs.length != 3){
            System.out.println("세 개의 값을 입력해주세요");
            return;
        }

        try{
            diceValue[0] = Integer.parseInt(inputs[0]);
            diceValue[1] = Integer.parseInt(inputs[1]);
            diceValue[2] = Integer.parseInt(inputs[2]);
        } catch(NumberFormatException e){
            System.out.println("숫자를 입력해주세요.");
            return;
        }

        if(!(verifyDiceNum(diceValue[0]) || verifyDiceNum(diceValue[1]) || verifyDiceNum(diceValue[2]))){
            System.out.println("잘못된 범위의 주사위입니다.");
            return;
        }

        Arrays.sort(diceValue);

        if(diceValue[0] == diceValue[2]){
            System.out.println(10000 + diceValue[0] * 1000);
        } else if(diceValue[0] == diceValue[1] || diceValue[1] == diceValue[2]){
            System.out.println(1000 + diceValue[1] * 100);
        } else {
            System.out.println(diceValue[2] * 100);
        }
    }

    private static boolean verifyDiceNum(int diceNum){
        return 1 <= diceNum && diceNum <= 6;
    }
}
