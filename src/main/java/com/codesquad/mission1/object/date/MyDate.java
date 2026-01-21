package com.codesquad.mission1.object.date;

import java.time.DateTimeException;
import java.time.LocalDate;

public class MyDate {
    private final int day;
    private final int month;
    private final int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String isValid(){
        try {
            LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            return year + "년 " + month + "월 " + day + "일은 유효하지 않은 날짜 입니다.";
        }

        return year + "년 " + month + "월 " + day + "일은 유효한 날짜 입니다.";
    }
}
