package com.yedam.insa;

import java.util.Calendar;

// CalendarEx.java
// CalendarEx.set(int year, int month) => static 메소드
// CalendarEx.cal() => 년, 월 -> 달력 그려주는 메소드 => static 메소드.

public class CalendarExe {
	public static void main(String[] args) {
		
//		Calendar cal = Calendar.getInstance();
//		cal.set(2023, 7, 5);
//		System.out.printf("년도 : %d\n", cal.get(Calendar.YEAR));
//		System.out.printf("월 : %d\n", cal.get(Calendar.MONTH)+1);
//		System.out.printf("날짜 : %d\n", cal.get(Calendar.DATE));
//		System.out.printf("요일 : %d\n", cal.get(Calendar.DAY_OF_WEEK));
//		System.out.printf("말일 : %d", cal.getActualMaximum(Calendar.DATE));
		CalendarEx.set(2024, 2);
		CalendarEx.cal(); // 2023년 5월 달력 출력
	}
}
