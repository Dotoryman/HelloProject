package com.yedam.dev;

//import com.yedam.dev.emp.Hello;

public class HelloEx {
	public static void main(String[] args) {
//		Hello hello = new Hello();
//		동일한 패키지 클래스	
		com.yedam.dev.emp.Hello hello1 = new com.yedam.dev.emp.Hello();
//		hello1.name = "Hong"; //동일한 클래스 내에서만 인식가능
//		hello1.age = 20; // 동일한 패키지 내에서 접근
		hello1.height = 199.9; // 접근가능 - public으로 선언해서
	}
}
