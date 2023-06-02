package com.yedam.ObjectEx1;

import java.util.Scanner;

public class ObjectEx2BankDoMyself {

	static Bank[] accounts = new Bank[2];
	static Scanner scn = new Scanner(System.in);

	public static void printAry() {
		for (Bank bank : accounts) {
			System.out.println(bank.getAccountNo());
		}
	}

	// 조회하려는 계좌 유무 확인.
	public static boolean checkAccount(String accountNo) {
		boolean isExist = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(accountNo))
				isExist = true;
			break;
		}return isExist;
	}

	// 한계좌 등록기능
	public static void resisterAcoount() {
		System.out.println("등록하실 계좌번호를 입력하세요");
		String accountNo = scn.nextLine();

		System.out.println("예금주 성명을 입력하세요");
		String owner = scn.nextLine();

		System.out.println("입금하실 금액을 입력하세요");
		int balance = Integer.parseInt(scn.nextLine());

		Bank bank = new Bank();
//		bank.accountNo = accountNo;
//		bank.owner = owner;
//		bank.balance = balance;
		bank.setAccountNo(accountNo);
		bank.setOwner(owner);
		bank.setBalance(balance);

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = bank;
				System.out.println("정상적으로 등록되었습니다.");
				break;
			}
		}
	}

	// 계좌정보 조회기능
	public static void searchAcoount() {
		System.out.println("조회할 계좌번호를 입력해주세요.");
		String accountNo = scn.nextLine();
		for (int i = 0; i < accounts.length; i++) {
			// 배열위치의 값이 null이 아닌 경우에만 조건검색
			boolean kick = false;
			if (accounts[i] != null && accounts[i].getAccountNo().equals(accountNo)) {
				System.out.printf("예금주: %s  잔액: %d $, \n", accounts[i].getOwner(), accounts[i].getBalance());
				kick = true;
				break;
			}
			if (!kick) {
				System.out.printf("%s 계좌는 존재하지 않는 계좌입니다. \n", accountNo);
				break;
			}
		}

	}

	// 입금기능
	public static void deposit() {
		System.out.println("입금할 계좌번호를 입력해주세요.");
		String accountNo = scn.nextLine();

		boolean kick = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(accountNo)) {
				kick = true;
				break;
			}
		}
		if (!kick) {
			System.out.printf("%s 계좌는 존재하지 않는 계좌입니다. \n", accountNo);
			return; // continue 는 반복문안에서 되돌아가는기능인데 지금은 반복문이 아니라서 오류남
		}

//		boolean isTrue = checkAccount(account);
//		if(!isTrue) {
//			System.out.println("찾으시는 계좌는 없는 계좌입니다.");
//			return
//		}

		System.out.println("입금하실 금액을 입력해주세요.");
		int balance = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(accountNo)) {
//				accounts[i].balance += balance;
				accounts[i].setBalance(accounts[i].getBalance() + balance);
				System.out.printf("예금주: %s  잔액: %d $, \n", accounts[i].getOwner(), accounts[i].getBalance());
			}
		}

	}

	// 출금기능
	public static void withdraw() {
		System.out.println("출금할 계좌번호를 입력해주세요.");
		String accountNo = scn.nextLine();

		boolean kick = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(accountNo)) {
				kick = true;
				break;
			}
		}
		if (!kick) {
			System.out.printf("%s 계좌는 존재하지 않는 계좌입니다. \n", accountNo);
			return;
		}

		System.out.println("출금하실 금액을 입력해주세요.");
		int balance = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(accountNo)) {
//				accounts[i].balance -= balance;
				accounts[i].setBalance(accounts[i].getBalance() - balance);
				System.out.printf("예금주: %s  잔액: %d $, \n", accounts[i].getOwner(), accounts[i].getBalance());
			}
		}

	}

	// 삭제기능
	public static void removeAccount() {
		System.out.println("삭제할 계좌번호를 입력해주세요.");
		String accountNo = scn.nextLine();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(accountNo))
				;
			accounts[i] = null; // 값을 null로 대체.
			System.out.println("정상적으로 삭제되었습니다.");
			break;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Bank[] accounts = new Bank[2];
		boolean run = true;
		int selectNo = 0;

		while (run) {
			System.out.println("1.등록 2. 조회(계좌번호) 3.입금 4.출금 5.계좌삭제 6.종료");
			System.out.print("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) { // 등록
				resisterAcoount();
			} else if (selectNo == 2) { // 조회(계좌번호)
				searchAcoount();
			} else if (selectNo == 3) {// 입금
				deposit();
			} else if (selectNo == 4) {// 출금
				withdraw();
			} else if (selectNo == 5) {// 삭제
				removeAccount();
			} else if (selectNo == 6) { // 종료
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
		System.out.println("end of prog");
	}
}
