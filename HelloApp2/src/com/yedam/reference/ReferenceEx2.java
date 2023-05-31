package com.yedam.reference;

public class ReferenceEx2 {
	public static void main(String[] args) {
		// int s1 = 90; int s2 =80; ...int s20 = 90 과 같이 변수가 많은상황
		int[] intAry = { 30, 40, 50 };
		double[]dbAry = { 30.0, 40.0, 50.0 };
		String[]strAry = {"H","E","L","L"};
		int[] intAry2 = new int[3]; // 0,0,0 초기값으로 들어가있다
		
		//배열의 크기는 한번 정해지면 불변. 
		
		System.out.println(intAry[0]);
		intAry[0] = 33;
		System.out.println(intAry[0]);
		
		int sum = intAry[0]+ intAry[1] + intAry[2];
		sum = 0; // 초기값을 지정
		for (int i= 0; i < 3; i++) {
			sum += intAry[i];
		}
		//확장 for.
		for (String str : strAry) {
			System.out.println(str);
		}
		System.out.println(sum);
		double sum1 = dbAry[0]+ dbAry[1] + dbAry[2];
	}
}
