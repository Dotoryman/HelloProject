package com.yedam.operator;

import java.io.IOException;

public class OperatorEx4 {
	public static void main(String[] args) {
		//기본입력
		//q가 113 =>종료
		//입력값이 대문자, 소문자, 숫자 => 출력
		while (true) {
		System.out.println("값을 입력하세요");
		try {
			int result = System.in.read();
			if (result == 113) {
				System.out.println("q값을 받았기에 종료합니다");
				break;
			}else if(result >= 48 && result <= 57 ) {
				System.out.println("입력값은 숫자입니다");
			}else if(result >= 65 && result <= 90 ) {
				System.out.println("입력값은 알파벳 대문자입니다");
			}else if(result >= 97 && result <= 122 ) {
				System.out.println("입력값은 알파벳 소문자입니다");
			}else {
				System.out.println("입력값은 숫자나 알파벳이 아닙니다.");
			}
			System.in.read();
			System.in.read();
			System.out.println(result);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("끝. ");
	}
	}	
}
