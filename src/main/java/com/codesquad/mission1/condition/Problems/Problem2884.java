package com.codesquad.mission1.condition.Problems;

import java.util.Scanner;

public class Problem2884 {
    public static void alarmClock(Scanner scan){
        System.out.print("일어날 시간을 입력하세요(띄어쓰기로 시와 분 구분) >>> ");
        String[] inputs = scan.nextLine().trim().split(" ");

        if(inputs.length != 2){
            System.out.println("시와 분을 입력해주세요!(ex: >>> 10 10");
            return;
        }

        int hour, minute;

        try{
            hour = Integer.parseInt(inputs[0]);
            minute = Integer.parseInt(inputs[1]);

            if((hour < 0 || hour > 23) || (minute < 0 || minute > 59)){
                System.out.println("범위에 맞는 값을 입력해주세요.");
                return;
            }
        } catch(NumberFormatException e){
            System.out.println("숫자를 입력하셔야 합니다.");
            return;
        }

        int sum = hour * 60 + minute;
        sum -= 45;

        if(sum < 0)
            sum = 60 * 24 + sum;

        System.out.println(sum / 60 + " " + sum % 60);
    }
}
