package com.codesquad.mission1.condition;

public class ConditionPrint {
    
    // Main 에서 문제 안내문 출력
    public static void printMain(){
        System.out.println("[문제 번호를 입력하세요 (종료: exit)]");
        System.out.println("1. 두 수 비교하기");
        System.out.println("2. 시험 성적");
        System.out.println("3. 윤년");
        System.out.println("4. 사분면 고르기");
        System.out.println("5. 알람 시계");
        System.out.println("6. 오븐 시계");
        System.out.println("7. 주사위 세개");
        System.out.print(">>> ");
    }
}
