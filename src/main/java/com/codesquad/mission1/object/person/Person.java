package com.codesquad.mission1.object.person;

public class Person {
    private final String name;
    private final int age;
    private final boolean sex;
    private final boolean married;
    private final int childNum;

    public Person() {
        this("이름없음", 0, false, false, 0);
    }

    public Person(String name) {
        this(name, 0, false, false, 0);
    }

    public Person(String name, int age, boolean sex, boolean married, int childNum) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.married = married;
        this.childNum = childNum;
    }

    //이름은 제인이고 나이는 30살 입니다.  성별은 여성이며, 기혼자 입니다. 자녀는 1명이 있습니다.
    public void printInfo(){
        String sex_str = sex ? "남성" : "여성";
        String married_str = married ? "기혼자" : "미혼자";
        System.out.println("이름은 " + name + "이고 나이는 " + age + "살 입니다. 성별은 "
                + sex_str + "이며, " + married_str + " 입니다. 자녀는 " + childNum + "명 있습니다.");
    }
}
