package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx2 {
		public static void main(String[] args) {
			//FirstMethod();
			//SecondMethod();
			Scanner scn = new Scanner(System.in);
			System.out.println("첫번째 숫자를 입력하세요.");
			int num1 = scn.nextInt();
			System.out.println("두번째 숫자를 입력하세요.");
			int num2 = scn.nextInt();
			ThirdMethod(num1, num2);
			scn.close();
		}
		public static void ThirdMethod(int a, int b) {
			//첫번째 수에 두번째 수를 더하기
			//매개로 받은 2개의 수를 더하고 결과를 출력
			int result = a + b;
			System.out.println("결과값은 " + result +"입니다.");

		}
		public static void SecondMethod() {
			//Scanner 활용
			// "I am a boy", 6 =>문장을 입력받은 숫자의 횟수만큼 반복출력.
			Scanner scn1 = new Scanner(System.in);
			System.out.println("출력할 문장을 입력하세요.");
			String str1 = scn1.nextLine();
			System.out.println("반복할 횟수를 입력하세요.");
			int num2 = scn1.nextInt();
			
			for (int i= 1; i <=num2; i++) {
				System.out.println(str1);
			}
			scn1.close();
		} //end of secondmetod
	
	//Scanner 를 사용해서 입력값을 2개.
		//2,3 => 2의 3제곱인 값을 출력
		public static void FirstMethod() {
		System.out.println("num1 의 num2 제곱 값 구하기.");
		int result = 1;
		int num1 = 0;
		int num2 = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("제곱할 숫자를 입력하세요.");
		num1 = scn.nextInt();
		System.out.println("몇번 곱할지 입력하세요.");
		num2 = scn.nextInt();
		for(int i = 1; i<=num2; i++) {
			result*= num1;
		}
		System.out.println(num1 +" 의 " + num2 + " 제곱은 " +result + " 입니다.");
		scn.close();
		}
	}


	

