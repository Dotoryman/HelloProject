package Secondweek.com;


// 학교친구 : 이름, 연락처, 학교, 전공
public class UnivFriend extends Friend{
	private String univ;
	private String major;
	
	public UnivFriend() {
		super(); //부모클래스의 생성자를 호출한다
	}
	
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String showInfo() {
		return "이름은 " + getName() + "연락처 " + getPhone() + "학교는 " + univ +"전공은 " + major + "\n";
	}
	
}
