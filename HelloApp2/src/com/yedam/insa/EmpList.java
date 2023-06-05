package com.yedam.insa;

import java.util.Scanner;

// 사원정보 배열, 등록/조회/출력 정의
public class EmpList {
	
	
	//싱글턴
	private static EmpList instance = new EmpList();
	
	public static EmpList getInstance() {
		return instance;
	}
	
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
		if (empNum >= list.length) {
			System.out.println("입력이 초과되었습니다.");
			return;
		}
		System.out.printf("%d 사번 > ", empNum);
		int no = scn.nextInt();
		System.out.printf("이름 > ");
		String name = scn.next(); // 엔터까지 처리된다
		System.out.printf("급여 > ");
		int sal = scn.nextInt();
		list[empNum++] = new Employee(no, name, sal);
	}
	
	//조회
	public String search(int employeeId) {
		for( int i = 0 ; i < list.length; i++) {
			if(list[i] != null && list[i].getEmployeeId() == employeeId) {
				return list[i].getName();
			}
		}
		return "";
	}
	
	//전체출력
	public void print() {
		System.out.println("==사원번호======성명=====급여=====");
		for(int i = 0 ; i < list.length; i++) {
			System.out.printf("%5d %10s %7d \n", list[i].getEmployeeId(), list[i].getName(), list[i].getSalary());
			
		}
	}
	
	//급여 합계
	public int sum() {
		int sum = 0;
		for(int i = 0 ; i < list.length; i++) {
			sum += list[i].getSalary();
		}
		return sum;
	}
}
