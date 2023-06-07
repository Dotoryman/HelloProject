package Secondweek.emp;

import java.util.ArrayList;

class Member {
	private String memberId;
	private String memberName;
	private int score;

	Member(String memberId, String memberName, int score) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.score = score;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}

//배열 > 컬렉션.
//추상클래스 : 추상메소드 (추가, 수정, 삭제)
public class ArrayExe {
	public static void main(String[] args) {

		ArrayList members = new ArrayList();
		members.add(new Member("001", "김빡빡", 100));
		members.add(new Member("002", "박빡빡", 200));

		for (int i = 0; i < members.size(); i++) {
			Member member = (Member) members.get(i);
			if (member.getMemberName().equals("김빡빡")) {
//				members.remove(i);
				members.set(i, new Member("010","김민주",150));
			}
		}

		ArrayList arry = new ArrayList();
		arry.add("홍길동");
		arry.add("김길동");
//		arry.add(new Integer(100));
		arry.add("박길동");

		arry.set(0, "니콜슨");

//		arry.remove(1); arry[1] = null;

		for (int i = 0; i < arry.size(); i++) {
			System.out.println(arry.get(i));
		}

//		for (Object name : arry) {
//			System.out.println( (String) name);
//		}
	}
}
