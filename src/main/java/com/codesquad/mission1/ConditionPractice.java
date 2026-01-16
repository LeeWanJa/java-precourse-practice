package com.codesquad.mission1;

public class ConditionPractice {
    public static void main(String[] args) {
        // 1. 백준 1330번: 두 수 비교하기
        System.out.println(compareInt(1, 2));
        System.out.println(compareInt(2, 2));
        System.out.println(compareInt(3, 2));


    }

    // 두 수 비교하는 함수
    private static String compareInt(int first, int second){
        if(first > second)
            return ">";
        else if(first < second)
            return "<";
        else
            return "==";
    }
}
