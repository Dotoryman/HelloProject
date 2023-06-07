package Secondweek.com;

public class PhoneApp {
	public static void main(String[] args) {
		CellPhone cell = new CellPhone();
		cell.setModel("Gallexy");
		cell.setColor("whinte");
		cell.powerOn();
		cell.powerOff();
		
		DmbCellPhone dmb = new DmbCellPhone();
		dmb.setModel("Gallexy2");
		dmb.setColor("black");
		dmb.setChannel(100);
		dmb.powerOn();
		dmb.powerOff();
		
		
		// 부모클래스의 변수타입 = 자식클래스의 인스턴스 할당.
		CellPhone cell1 = new DmbCellPhone(); // promotion 자동형변환
		cell1.setModel("Galaxy2");
		cell1.setColor("Yellow");
//		cell1.setChannel(100); 자식클래스는 안된다
		
		if(cell1 instanceof DmbCellPhone) { // cell1의 변수의 유형이 DmbCellPhone 인스턴스인지 확인
		DmbCellPhone dmb1 =  (DmbCellPhone) cell1; // casting 강제형변환
		dmb1.setChannel(100);
		dmb1.powerOn();
		}
		
		if(cell instanceof DmbCellPhone) {
		DmbCellPhone dmb2 =  (DmbCellPhone) cell;
		dmb2.setChannel(200);
		}
		
		//int, double => Integer
		int num = 20;
		num = new Integer(30); // 30이라는 정수의 값을 담고있는 인스턴스 삭선된건 하지말라는말임
		
		
	}
}
