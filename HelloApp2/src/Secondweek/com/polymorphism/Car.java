package Secondweek.com.polymorphism;

public class Car {
	// 필드
	Tire frontLeft = new Tire("앞 왼쪽", 6); // 1
	Tire frontRight = new Tire("앞 우측", 2);// 2
	Tire backLeft = new Tire("뒤 왼쪽", 3);// 3
	Tire backRight = new Tire("뒤 우측", 4);// 4

	// 주행->펑크난 위치
	int run() {
		System.out.println("자동차가 달려갑니다.");
		if (frontLeft.roll() == false) {
			stop();
			return 1;
		}
		if (frontRight.roll() == false) {
			stop();
			return 2;
		}
		if (backLeft.roll() == false) {
			stop();
			return 3;
		}
		if (backRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
