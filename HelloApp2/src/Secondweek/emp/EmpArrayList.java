package Secondweek.emp;

import java.util.ArrayList;

public class EmpArrayList extends EmpList {

	
	ArrayList employees;
	int empNum;

	@Override
	void init() {
		employees = new ArrayList();
	}

	@Override
	void input() {
		System.out.printf("%d 사번 > " , empNum);
		int no = scn.nextInt();
		System.out.println("이름 > ");
		String name = scn.next();
		System.out.println("급여 > ");
		int salary = scn.nextInt();
		
		employees.add(new Employee(no,name,salary));
	}

	@Override
	String search(int employeeId) {
		for (int i = 0 ; i < employees.size(); i++) {
			Employee emp = (Employee) employees.get(i);
			if(emp.getEmployeeId() == employeeId) {
				return emp.getName();
			}
		}
		return null;
	}

	@Override
	void print() {
		for(int i = 0 ; i < employees.size(); i++) {
				System.out.printf("%5d %10s %7d \n",
						((Employee)employees.get(i)).getEmployeeId(),
						((Employee)employees.get(i)).getName(),
						((Employee)employees.get(i)).getSalary());
		}
	}

}
