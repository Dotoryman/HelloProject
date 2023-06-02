package com.yedam.ObjectEx1;



public class ObjectEx3 {
	public static void main(String[] args) {
		Person p1 = new Person("홍빵빵", 20);
		p1.setName ("디아고");
		p1.setAge (20);
		System.out.println(p1.getName()+p1.getAge());
		p1.profile();
		p1.nyprofile(233);
	}
}
