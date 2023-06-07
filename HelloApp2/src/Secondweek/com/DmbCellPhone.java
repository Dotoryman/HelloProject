package Secondweek.com;
//CellPhone + 영상시청
public class DmbCellPhone extends CellPhone {
	private int channel;
	
	public DmbCellPhone() {
		super(); // 부모클래스의 생성자
	}
	public DmbCellPhone(String model, String color) {
		super(model, color);
	}
	public DmbCellPhone(String model, String color,int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getChannel() {
		return this.channel;
	}
	
	//재정의
	@Override // 부모 클래스의 메소드를 재정의한다는 뜻
	public void powerOn() {
		System.out.println("Dmb 전원을 켭니다");
	}
	@Override
	public void powerOff() {
		System.out.println("Dmb 전원을 끕니다");
	}
	@Override
	public String toString() { //클래스는 Object 클래스 상속.
		return "모델은 " + this.getModel() + ", 컬러는 " + this.getColor();
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
