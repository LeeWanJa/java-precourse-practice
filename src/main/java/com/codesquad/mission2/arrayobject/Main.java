package com.codesquad.mission2.arrayobject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //[1] 문자열 배열
        //문자 배열을 만들어 A-Z 까지 배열에 저장하고 이를 다시 출력하기
        System.out.println("===== 1 =====");
        ArrayList<Character> list = new ArrayList<Character>();
        for(char ch = 'A'; ch <= 'Z'; ch++)
            list.add(ch);

        for(char ch : list)
            System.out.print(ch + " ");


        // [2] 도서관 목록
        String[][] library = new String[2][5];
        
    }
}
