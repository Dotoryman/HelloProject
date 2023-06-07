package co.yedam;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("num1 과 num2 크기 비교하기.");
		Scanner scn = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.println("1번 숫자를 입력하세요.");
		num1 = scn.nextInt();
		System.out.println("2번 숫자를 입력하세요.");
		num2 = scn.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + "이(가)" + num2 + "보다 큰 수 입니다.");
		} else if (num1 < num2) {
			System.out.println(num2 + "이(가)" + num1 + "보다 큰 수 입니다.");
		} else {
			System.out.println("두 수의 크기는 같습니다.");
		}

		scn.close();
	}
}
