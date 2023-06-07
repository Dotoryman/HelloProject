package Secondweek.empBackup;

public class EmpListApp {
	public static void main(String[] args) {
		EmpList app = new EmpArray();
		app = new EmpArrayList();
		
		app.init();
		
		app.input();
		
		app.print();
	}
}
