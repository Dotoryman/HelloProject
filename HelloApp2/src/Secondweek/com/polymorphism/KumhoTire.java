package Secondweek.com.polymorphism;

public class KumhoTire extends Tire {

//	HankookTire(){
//		super();
//	}

	KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	@Override
	public boolean roll() {
		setAccumulatedRotation(getAccumulatedRotation() + 1);
		if(getAccumulatedRotation()<getMaxRotation()) {
			System.out.println("금호타이어" + (getMaxRotation()-getAccumulatedRotation()) + "회 남았습니다." + " 위치" + getLocation());
			return true;
		} else {
			System.out.println("금호타이어 펑크" + " 위치" + getLocation());
			return false;
		}
	}
}