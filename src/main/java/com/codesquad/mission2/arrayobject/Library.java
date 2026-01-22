package com.codesquad.mission2.arrayobject;

public class Library {
    private String[][] library = new String[5][2];

    public Library() {
        defaultBooks();
    }

    private void defaultBooks(){
        library[0][0] = "태백산맥";
        library[0][1] = "조정래";
        library[1][0] = "이기적 유전자";
        library[1][1] = "리처드 도킨즈";
        library[2][0] = "자전거 도둑";
        library[2][1] = "박완서";
        library[3][0] = "토지";
        library[3][1] = "박경리";
        library[4][0] = "대변동";
        library[4][1] = "제러드 다이아몬드";
    }

    public void addBook(String name, String authorName){
        this.library = new String[library.length + 1][2];
        defaultBooks();
        library[library.length-1][0] = name;
        library[library.length-1][1] = authorName;
    }

    public void modifyBook(int row, String name, String authorName){
        try {
            this.library[row-1][0] = name;
            this.library[row-1][1] = authorName;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("유요하지 않은 줄입니다!");
            return;
        }
    }

    public void printBooks(){
        for(int i = 0; i < library.length; i++){
            System.out.println("[제목]" + library[i][0] + " | [저자]" + library[i][1]);
        }
    }
}
