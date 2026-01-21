package com.codesquad.mission1.loop;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        String[] inputs;

        try {
            System.out.print("숫자의 개수를 입력해주세요 >>> ");
            num = Integer.parseInt(scan.nextLine().trim());
            System.out.print("개수만큼 더할 숫자들을 입력해주세요(0 ~ 9) >>> ");
            inputs = scan.nextLine().trim().split("");

            if(num != inputs.length){
                System.out.println("입력하신 개수와 입력된 숫자의 개수가 일치하지 않습니다.");
                return;
            }

            int sum = 0;
            for(String str : inputs)
                sum += Integer.parseInt(str);

            System.out.println("합계 : " + sum);
        } catch (NumberFormatException e) {
            System.out.println("숫자만을 입력해주세요.");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("숫자의 개수가 일치하지 않습니다.");

        }

    }
}
