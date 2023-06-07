package test1_230605;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("num1 과 num2 사이의 2의배수의 합과 3의배수의 합 구하기.");
		int num1 = 0;
		int num2 = 0;
		int sum2 = 0;
		int sum3 = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("1번 숫자를 입력하세요.");
		num1 = scn.nextInt();
		System.out.println("2번 숫자를 입력하세요.");
		num2 = scn.nextInt();
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 0) {
					sum2 += i;
				}
			}
			for (int i = num1; i <= num2; i++) {
				if (i % 3 == 0) {
					sum3 += i;
				}
			}
		} else if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				if (i % 2 == 0) {
					sum2 += i;
				}
			}
			for (int i = num2; i <= num1; i++) {
				if (i % 3 == 0) {
					sum3 += i;
				}
			}
		}
		System.out.println(num1 + "부터" + num2 + "사이의 2의배수의 합은" + sum2);
		System.out.println(num1 + "부터" + num2 + "사이의 3의배수의 합은" + sum3);
	}
}
