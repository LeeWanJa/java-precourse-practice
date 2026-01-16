package com.codesquad.mission1.condition.Problems;

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

        // 모두 같다면 3, 두 개만 같다면 1, 세 개 다 다르다면 0
        int diceCase = 3;
        int max = -1;
        int sameValue = -1;

        for(int i = 0; i < diceValue.length; i++) {
            int compare = diceValue[(i + 1) % 3];

            if (diceValue[i] == compare){
                sameValue = compare;
                continue;
            }

            diceCase--;
            max = Math.max(diceValue[i], compare);
        }

        switch(diceCase){
            case 3 -> System.out.println(10000 + (sameValue * 1000));
            case 1 -> System.out.println(1000 + (sameValue * 100));
            case 0 -> System.out.println(max * 100);
            default -> System.out.println("오류 발생");
        }
    }

    private static boolean verifyDiceNum(int diceNum){
        return 1 <= diceNum && diceNum <= 6;
    }
}
