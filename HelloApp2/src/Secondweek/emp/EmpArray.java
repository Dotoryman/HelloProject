package Secondweek.emp;

public class EmpArray extends EmpList {
	
	Employee[] employees;
	int empNum;
	
	@Override
	void init() {
		System.out.println("사원수를 입력하세요 > ");
		int num = Integer.parseInt(scn.nextLine()); //"10" -> 10
		employees = new Employee[num];
	}

	@Override
	void input() {
		System.out.printf("%d 사번 > " , empNum);
		int no = scn.nextInt();
		System.out.println("이름 > ");
		String name = scn.next();
		System.out.println("급여 > ");
		int salary = scn.nextInt();
		employees[empNum++] = new Employee(no, name, salary);
	}

	@Override
	String search(int employeeId) {
		for(int i = 0 ; i < employees.length; i++) {
			if(employees[i] != null && employees[i].getEmployeeId() == employeeId) {
				return employees[i].getName();
			}
		}
		return null;
	}

	@Override
	void print() {
		for(int i = 0 ; i < employees.length; i++) {
			if(employees[i] != null) {
				System.out.printf("%5d %10s %7d \n",employees[i].getEmployeeId(),
						employees[i].getName(),
						employees[i].getSalary());
			}
		}
	}

}
