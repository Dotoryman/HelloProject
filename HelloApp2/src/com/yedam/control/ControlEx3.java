package com.yedam.control;

public class ControlEx3 {
	public static void main(String[] args) {
		//달력만들기
		System.out.println(" ==== 2023 June Calendar ====");
		String days = "  Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("==============================");
		int month = 6;
		for (int i = 0 ; i < getFirstDate(month); i++) {
			System.out.printf("%4s", " ");
		}
		
		for (int day = 1; day <= getLastDate(month); day++) {
			System.out.printf("%4s", day);
			if ((getFirstDate(month)+day) % 7 == 0) {
				System.out.println();
			}
		}
	}
	
	public static int getFirstDate(int month) {
		//4,5,6월달 달력 만들기 - 몇칸 밀어줄지
		//switch~case 구문 사용
		int result = 0;
		switch(month) {
		case 4: 
			result = 6; break;
		case 5:
			result = 1; break;
		case 6:
			result = 4; break;
		default :
			result = 0;
		}
		return result;
	}
	
	public static int getLastDate(int month) {
		//4,5,6월달 달력 만들기 - 몇칸 밀어줄지
		//switch~case 구문 사용
		int result = 0;
		switch(month) {
		case 4: 
			result = 30; break;
		case 5:
			result = 31; break;
		case 6:
			result = 30; break;
		default :
			result = 0;
		}
		return result;
	}
	
	public static void method1() {
		// 반복문 : for , while , do ~ while
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0)
				System.out.printf("i의 값은 %d, 짝수입니다 \n", i);
			else if (i == 0)
				System.out.printf("i의 값은 0, 0입니다 \n", i);
			else
				System.out.printf("i의 값은 %d, 홀수입니다 \n", i);
		}
	}
	public static void method2() {
		//구구단 만들기- 세로출력
		/*
		 * for (int num2 = 2; num2 <=9; num2++) {
			int num1 = num2;
			System.out.println("구구단" + num1 + "단 입니다.");
			for (int num = 1; num <=9; num++) {
				System.out.printf("%d * %d = %d \n", num1, num, num*num1);
			}
	    }
	    */
		//구구단 만들기= 가로출력
		for (int num2 = 1; num2 <=9; num2++) {
			int num1 = num2;
			for (int num = 2; num <=9; num++) {
				System.out.printf("%d * %d = %d \t", num, num1, num*num1);
			}
			System.out.printf("\n");
	    }
		
	}
}
