package com.yedam.insa;

import java.util.Calendar;

//set(), cal() 두개 있어야함
public class CalendarEx {
	static int year;
	static int month;
	
	static void set(int year, int month) {
		CalendarEx.year = year;
		CalendarEx.month = month - 1;
	}
	
	static void cal() {
		// 년도, 월 : 정해짐
		// 말일, 첫날의 위치.
		// 월별로 필요한정보 : 1)월 2)1일의 시작위치 3) 마지막날
		Calendar cal = Calendar.getInstance();
		cal.set(CalendarEx.year, CalendarEx.month, 1);
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.printf("==========%d년 %d월=========\n", year, mon+1);
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");
		for (int i = 1; i < day; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%3d ", i);
			if((day + i)%7 == 1) {
				System.out.println();
			}
		}
	}
}
