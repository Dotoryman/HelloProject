package com.yedam.dev.emp;

public class HelloEx {
	public static void main(String[] args) {
		
		for(String str : args) {
			System.out.println(str);
		}
		
		Hello hello = new Hello();
//		hello.name = "Hong"; // private
		hello.age = 20; // default 동일한 패키지 내에서 접근가능
		hello.height = 199.0;
		
		
		World world = new World();
		
		System.out.println("end of prog");
	}
}
