package Secondweek.com.polymorphism;

public class CarExe {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 0 ;i <= 6; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽에 HankookTire 교체.");
				car.frontLeft = new HankookTire ("앞 왼쪽", 10);
				break;
			case 2:
				System.out.println("앞 우측에 KumhoTire 교체.");
				car.frontRight = new HankookTire ("앞 우측", 11);
				break;
			case 3:
				System.out.println("뒤 왼쪽에 HankookTire 교체.");
				car.backLeft = new HankookTire ("뒤 왼쪽", 12);
				break;
			case 4:
				System.out.println("뒤 우측에 KumhoTire 교체.");
				car.backRight = new HankookTire ("뒤 우측", 13);
				break;
			}
			System.out.println("=======================================");
		}
	}
}
