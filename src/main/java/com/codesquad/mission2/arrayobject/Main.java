package com.codesquad.mission2.arrayobject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //[1] 문자열 배열
        //문자 배열을 만들어 A-Z 까지 배열에 저장하고 이를 다시 출력하기
        System.out.println("===== 1 =====");
        ArrayList<Character> list = new ArrayList<Character>();
        for(char ch = 'A'; ch <= 'Z'; ch++)
            list.add(ch);

        for(char ch : list)
            System.out.print(ch + " ");
        System.out.println("\n");

        // [2] 도서관 목록
        System.out.println("===== 2 =====");
        Library A = new Library();
        Library A_1 = A;
        Library B = new Library();

        System.out.println("도서관 A의 책 목록");
        A.printBooks();
        System.out.println();
        System.out.println("도서관 A의 3번째 줄 수정");
        A.modifyBook(3, "그 많던 싱아는 누가 다 먹었을까", "박완서");
        A.printBooks();
        System.out.println();

        System.out.println("도서관 A_1의 책 목록");
        A_1.printBooks();
        System.out.println();

        System.out.println("도서관 B의 책 목록");
        B.printBooks();
        System.out.println("책 추가");
        B.addBook("사피엔스", "유발 하라리");
        B.printBooks();



    }
}
