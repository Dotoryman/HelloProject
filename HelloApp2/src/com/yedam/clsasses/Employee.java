package com.yedam.clsasses;

public class Employee {
	//필드 선언
	private int employeeId;
	private String firstName;
	private String lastName;
	private Department dept;
	
	//생성자
	Employee(){
		
	} //기본생성자
	
	Employee(int employeeId, String firstName){
		this.employeeId = employeeId;
		this.firstName = firstName;
	}
	
	Employee(int employeeId, String firstName, String lastName, Department dept){
		this(employeeId, firstName); //정수, 문자열 생성자 호출
		this.lastName = lastName;
		this.dept = dept;
	}
	// setter , getter

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", dept="
				+ dept + "]";
	}
	
}
