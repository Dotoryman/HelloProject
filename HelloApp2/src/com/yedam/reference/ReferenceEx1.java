package com.yedam.reference;
class Student{
	String name;
	int age;
}
public class ReferenceEx1 {
	public static void main(String[] args) {
		int age = 25;
		double price = 100.5;
		
		int age1 = age;
		age = 30;
		System.out.println("age: " + age + ",age1: " + age1);
		String name = new String("전우치");
		String name1 = new String("김길동");
		name1 = name;
		name = new String("반헬싱");
		System.out.println("name: " + name + ",name1: " + name1);
		String hobby = "서핑";
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
		
		Student s2 = s1;
		s1.name = "박길동";
		s1.age = 22;
		System.out.println(s1.name + ", " + s2.name);
	}
}
