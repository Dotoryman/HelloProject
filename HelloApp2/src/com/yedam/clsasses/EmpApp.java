package com.yedam.clsasses;


// 사원정보를 저장
// 사원클래스(Employee) - 부서클래스(Department)
// 여기는 실행클래스
public class EmpApp {
	public static void main(String[] args) {
		Department dept1 = new Department(10, "인사", 120);
		
		dept1.setDepartmentId(10);
		dept1.setDepartmentName("인사");
		dept1.setManagerId(120);
		
		Department dept2 = new Department(20,"기획");
		dept2.setManagerId(130);
		
		Department dept3 = new Department(30, "영업", 160);
		
		System.out.println(dept1.toString());
		System.out.println(dept2.toString());
		System.out.println(dept3.toString());
		
		
		//사원
		Employee emp1 = new Employee();
		emp1.setEmployeeId(200);
		emp1.setFirstName("길동");
		emp1.setLastName("홍");
		emp1.setDept(dept1);
		
		System.out.println("부서정보 : "+ emp1.getDept().getDepartmentName());
		
		Employee emp2 = new Employee(201, "민수", "김", dept1);
		
		Employee emp3 = new Employee(203, "이수", "이", new Department(30, "개발", 150));
		
		Employee emp4 = new Employee(204, "리차드", "존슨", dept3);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
	}
}
