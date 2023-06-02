package com.yedam.ObjectEx1;

//private과 public


public class Bank {
	private String accountNo; // unique. 11-23-12345
	private String owner; // 예금주. 김빡빡
	private int balance; // 잔고. 101010
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
		
//	
//	void setAccountNo(String acNo) {
//		accountNo = acNo;
//	}
//	String getAccountNo() {
//		return accountNo;
//	}
//	void setOwner(String owner) {
//		this.owner = owner;
//	}
//	String getOwner() {
//		return this.owner;
//	}
//	void setBalance(int balance) {
//		this.balance = balance;
//	}
//	int getBalance() {
//		return balance;
//	}
}
