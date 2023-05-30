package com.yedam.variable;

//클래스명은 대문자로 시작. 걍 그런줄 아셔.
public class VariableEx1 {
	public static void main(String[] args) {//중괄호 안에서는 하나의 변수에 다른 유형의 값을 넣을 수 없다
		//변수 :변하는 값을 저장 컴퓨터의 메모리 저장공간에 값을 저장.
		int num1; //정수는 음의정수, 0 , 양의정수를 담을수 있다
		num1 = 100;
		num1 = -100;
		
		double num2 = -1.2;
		num2 = 12.3;
		num2 = 123; // 정수인 123을 123.0이라는 실수로 내부적으로 형변환
		
		double result = 0;
		result = (double) num1 + num2; // num1은 정수타입, num2는 실수타입이어서 작은범위의 변수의 범위를 더 큰 변수의 범위로 바꿔줌 변수의범위 int < double.
		System.out.println("결과 : " + result); //Sysout 친다음 ctrl+space 누르면 자동만들어짐
		
		// 변수의 종류
		// 정수 : byte (1byte), short(2byte), int(4byte), long(8byte)
		// 실수 : float (4byte), double(8byte)
		// bool : true/false
		// 객체(class) : 문자형(String)
		// 1byte = 8bit -> 2^8 256가지 : -128~127
		System.out.println(Integer.MAX_VALUE); //-2147483648,0,2147483647
		byte b1 = 127;// 127까지 가능
		short s1 = 128;// 각각의 함수마다 담을수있는 값이 차이남
		long l1= 214748364L;//정수의 기준은 int, long형 정수를 표시하기위해서 맨뒤에 L붙이쇼
		// JAVA에서 '정수' 연산을 한다면 기준이 int다.
		long result1 = (long) b1 + (long) s1 + l1; //여기선 result1은 byte타입으로는 구할수 없고 short 위로 가능
		System.out.println("결과 : " + result1);
		b1++; //b1 = b1+ 1;
		System.out.println("b1의 값 : " + b1);//범위를 벗어난 연산을하면 최소값으로 회귀함
	}
}
