package com.yedam.control;

import java.util.Scanner;

public class ControlEx2 {
	public static void main(String[] args) {
		//1~12월까지 n월은 nn일 입니다로 출력해보기
		System.out.println("월의 마지막 날은"+getLastDate(1));
		
	}
	
	public static int getLastDate(int month) {
		System.out.println("원하는 달을 입력하세요.");
		Scanner scn = new Scanner(System.in);
		month = scn.nextInt();
		int result = 30;
		switch (month) {
		case 1,3,5,7,8,10,12:
			result = 31;
			break;
		case 2:
			result = 28;
			break;
		case 4,6,9,11:
			result = 30;
		}
		return result;
	}
	
	public static void method1() {
		// switch case를 이용한 반복문, 각 케이스에서 break 해줘야함 간단한 조건문에서는 if보다 switch가 가독성이 좋다
		// 단점은 switch문은 범위를 지정해줄수가 없다.
		int result = (int) (Math.random() * 3) + 1;
		switch (result) {
		case 1:
			System.out.println("1등 당첨");
			break;
		case 2:
			System.out.println("2등 당첨");
			break;
		case 3:
			System.out.println("3등 당첨");

		}

		int result1 = (int) (Math.random() * 91) + 10;
		switch (result1 / 10) {
		case 10:
			System.out.println("A++");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
		System.out.println("end of prog");
	}
}
