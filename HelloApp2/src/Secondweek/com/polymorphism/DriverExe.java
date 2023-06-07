package Secondweek.com.polymorphism;

public class DriverExe {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		Driver driver = new Driver();
		//부모 변수유형 = 자식 인스턴스
		driver.drive(vehicle);
		driver.drive(bus);
		driver.drive(taxi);
	}
}
