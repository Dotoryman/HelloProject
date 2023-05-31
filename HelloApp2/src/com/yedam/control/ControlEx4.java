package com.yedam.control;

public class ControlEx4 {
	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}
	
	
	public static void method1() {
		//1부터 100까지의 수 중에서 3의 배수의 합계
		int sum = 0;
		for(int i=0; i<=100; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		System.out.println("1에서 100까지의 3의배수의 합 : " + sum);
	}
	
	
	public static void method2() {
		//Math.random() 두번실행 => 두 수의 합이 5가되는 경우 (1,4 / 2,3 / 3,2 / 4,1)
		//합이 5가 나왔을때 중지되도록

		while (true) {
			int sam = (int) (Math.random() * 5) + 1;
			int som = (int) (Math.random() * 5) + 1;
			System.out.println("첫번째 주사위는" + som);
			System.out.println("두번째 주사위는" + sam);
			if(som+sam == 5) {
				System.out.println("두 주사위의 합은 5 당첨" );
				break;
			}else {
				System.out.println("두 주사위의 합이 5가 아닙니다, 탈락");
			}
		}
	}
	
	
	public static void method3() {
		//*
		//**
		//***
		//****
		//for문 안에 for문 method3()
		String star = "";
		for(int i=1; i<=10; i++) {
		for(int j=1; j <= i+1; j++) {
			star += "*";
		}
		star += "\n";
		}
		System.out.println(star);
		
		String stark = "";
		for(int i=1; i<=10; i++) {
		for(int j=1; j <= i+1; j++) {
			stark += "*";
		}
		stark += "\n";
		}
		System.out.println(stark);
	}
}
