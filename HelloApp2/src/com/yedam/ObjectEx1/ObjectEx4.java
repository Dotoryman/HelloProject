package com.yedam.ObjectEx1;

public class ObjectEx4 {
	public static void main(String[] args) {
		
		Person[] families = {
				new Person("Dad",60),
				new Person("Mom",59),
				new Person("Bro",30)
		};
		
		Member m1 = new Member(); //
		m1.memberId = "user1";
		m1.memberName = "반헬싱";
		m1.point = 1000;
		m1.families = families;
		
		m1.families[0].getName(); //아버지 이름
		m1.families[0].getAge(); //아버지 나이
		
		Member m2 = new Member();
		
		Member[] members = new Member[10];
		members[0] = m1;
		members[1] = m2;
		
		for (int i =0; i < members.length; i++) {
			String name = members[i].families[0].getName();
		}
	}
}
