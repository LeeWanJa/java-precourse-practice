package com.codesquad.mission1.condition.Problems;

import java.util.Scanner;

public class Problem2525 {
    public static void ovenClock(Scanner scan){
        int hour, min, cookTime;

        try{
            System.out.print("현재 시각을 입력하시오 >>> ");
            String[] inputs = scan.nextLine().trim().split(" ");
            hour = Integer.parseInt(inputs[0]);
            min = Integer.parseInt(inputs[1]);
            System.out.print("요리 시간을 입력하세요 >>> ");
            cookTime = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e){
            System.out.println("정확한 값을 입력하세요.");
            return;
        }

        int minuteSum = min + cookTime;
        hour = (hour + (minuteSum / 60)) % 24;
        min = minuteSum % 60;

        System.out.println(hour + " " + min);
    }
}
