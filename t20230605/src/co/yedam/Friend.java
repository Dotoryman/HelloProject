package co.yedam;

public class Friend {
	private String name;
	private String pnum;
	private String birth;
	private double tall;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public Friend(String name, String pnum, String birth, double tall) {
		super();
		this.name = name;
		this.pnum = pnum;
		this.birth = birth;
		this.tall = tall;
	}

}
