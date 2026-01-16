package com.codesquad.mission1.condition.Problems;

import java.util.Scanner;

public class Problem9498 {

    public static void testScore(Scanner scan){
        System.out.print("당신의 시험 점수를 입력하세요 >>> ");
        int score;

        try {
            score = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요!");
            return;
        }

        String grade;

        if(score > 100 || score < 0){
            System.out.println("잘못된 범위의 숫자를 입력했습니다.");
            return;
        } else if(score >= 90)
            grade = "A";
        else if(score >= 80)
            grade = "B";
        else if(score >= 70)
            grade = "C";
        else if(score >= 60)
            grade = "D";
        else
            grade = "F";

        System.out.println("시험 성적 = " + grade);
    }
}
