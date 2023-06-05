package com.yedam.clsasses;

public class Calculator {
	// 인스턴스마다 동일한 값을 가짐
	static final double PI = 3.14; // final-> 상수선언 상수선언은 대문자로함
	
	// static메소드 (정적 메소드) 연산.
	public static void sum(int num1, int num2) {
		int result = num1 + num2; 
		System.out.printf("더한결과 :", + result);
	}
	public static void minus(int num1, int num2) {
		int result = num1 - num2; 
		System.out.printf("뺀 결과 :", + result);
	}
	
	public static void getArea(int radius) {
		double result = PI * radius * radius;
		System.out.printf("원의 넓이 :" + result);
	}
}
