package com.yedam.ObjectEx1;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		
		// int[] {0,0,0} Bank[] {null,null,null}
		Bank[] accounts = new Bank[3];
		
		boolean run = true;
		int selectNo = 0;
		Scanner scn = new Scanner(System.in);

		
		
		while(run) {
			System.out.println("1.계좌 등록하기 2.계좌 조회하기 3.입금하기 4.출금하기 5.종료하기");
			System.out.println("선택 > ");
			selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo == 1) { //등록
				System.out.println("사용하실 계좌번호를 입력하세요");
				Bank b1 = new Bank();
				

			} else if(selectNo == 2){ //계좌조회(예금주, 계좌번호, 잔액)
				
			} else if(selectNo == 3){ //입금
				
			} else if(selectNo == 4){ //출금
				
			} else if(selectNo == 5){ //종료
				
			} else {
				System.out.println("올바른 메뉴번호를 선택해 주세요");
			}
		}
		System.out.println("end of prog");
	}
}
