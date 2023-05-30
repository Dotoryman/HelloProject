package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx1 {
	// 메소드 : 함수인데 객체(object)에 소속되어있는것이 메소드.
	public static void main(String[] args) {
		/*
		 * 사용자의 값을 입력받도록 num1, num2 값을 입력받도록.
		 * num1 ~ num2 사이의 값의 합계를 구하는 프로그램 작성 
		 * 짝수만 계산 합. 3%2 ==> 1
		*/
		/*//1번 주석처리 시작부분
		Scanner scn = new Scanner(System.in);//ctrl+shift+o 눌러서 import 만들어주기
		System.out.println("숫자를 입력하시옹.");
		int result = 0; // 함수가 객체에 수속되어있는것을 메소드.
		String str = "";
		// var, let => int, long
		// for(let i=0; i<3; i++){}
		// for(int i=0; i<3; i++){}
		try {
			str = scn.nextLine();
		}catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
		System.out.println("입력값은 " + str);
		
		scn.close(); */

		System.out.println("num1 에서 num2 값 구하기.");
		int result1 = 0;
		int num1 = 0;
		int num2 = 0;
		Scanner scn1 = new Scanner(System.in);
		System.out.println("1번 숫자를 입력하세요.");
		num1 = scn1.nextInt();
		System.out.println("2번 숫자를 입력하세요.");
		num2 = scn1.nextInt();
		for(int i= num1; i <=num2; i++){
			if( i%2 == 0 ) {
				result1+=i;
				}
		}
		System.out.println(num1 +"부터" + num2 + "까지의 합은" +result1);
		
		scn1.close();
	}
}
