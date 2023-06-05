package com.yedam.insa;

import java.util.Scanner;

// 사원정보 배열, 등록/조회/출력 정의
public class EmpList {
	//정보저장공간
	
	Employee[] list;
	int empNum;// 사원수
	Scanner scn = new Scanner(System.in);
	
	//생성자 : 
	EmpList(){}
	EmpList(Employee[] list){
		this.list = list;
		this.empNum = list.length;
	}
	
	//초기화
	public void init() {
		System.out.println("사원수 > ");
		int num = scn.nextInt(); //3 입력후 엔터를 치면 입력
		list = new Employee[num];
	}
	
	
	//등록
	public void input() {
		System.out.printf("%d 사번 > ", empNum);
	}
}
