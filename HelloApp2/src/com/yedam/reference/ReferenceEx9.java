package com.yedam.reference;

import java.util.Scanner;

class Student1{
	String name;// 속성들
	int engscore;
	int mathscore;
}

public class ReferenceEx9 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.name = "링컨";
		s1.engscore = 90;
		s1.mathscore = 90;
		
		Student1 s2 = new Student1();
		s2.name = "워싱턴";
		s2.engscore = 85;
		s2.mathscore = 98;
		
		Student1 s3 = new Student1();
		s3.name = "루즈벨트";
		s3.engscore = 95;
		s3.mathscore = 92;
		
		Student1[] students = { s1, s2, s3 };
		System.out.println("이름을 입력하세요.");
		Scanner scn = new Scanner(System.in);
		String sname = scn.nextLine();
		
		for(int i = 0; i < students.length; i++) {
			if(students[i].name.equals(sname)) {
				System.out.println(students[i].name);
				System.out.println(students[i].engscore);
				System.out.println(students[i].mathscore);
				System.out.println("--------------------");
			}
		}
	}
}
