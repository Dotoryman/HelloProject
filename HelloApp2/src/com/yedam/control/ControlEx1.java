package com.yedam.control;

public class ControlEx1 {
	public static void main(String[] args) {
		//Math.random은 0~1사이의 임의의 수를 생성한다.
		int result = (int) (Math.random() * 10) + 1;
		System.out.println(result);
		if (result%2 ==0) {
			System.out.println("짝수당첨");
		}else {
			System.out.println("홀수당첨");
		}
		//math.random을 활용해서 10~100까지 임의의 수 만들어보기
		// 생성된 값이 100~90 A 출력
		// 80~89 B, 70~79 C, 그외는 D
		// 반복문을 이용한 수식확인
		int result1 = (int) (Math.random()*91) + 10;
		while (true) {
			result1 = (int) (Math.random()*91) + 10;
			System.out.println(result1);
			if(result1 == 100) {
				break;
			}else if(result1 == 10) {
				break;
			}
		}
		
		System.out.println(result1);
		if(result1 >=90) {
			System.out.println("등급은 A 입니다");
		}else if(result1 >=80 ) {
			System.out.println("등급은 B 입니다");
		}else if(result1 >=70 ) {
			System.out.println("등급은 C 입니다");
		}else if(result1 >=60 ) {
			System.out.println("등급은 D 입니다");
		}else {
			System.out.println("등급은 F 입니다");
		}
	}
}
