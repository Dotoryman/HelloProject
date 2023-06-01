package com.yedam.reference;

public class ReferenceEx5 {
	public static void main(String[] args) {
		
		int a = (int)(Math.random()*100); //(int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		int c = (int)(Math.random()*100);
		// a>b>c, a>c>b, b>a>c, b>c>a, c>a>b, c>b>a
//		if(a > b) {
//			if(a > c) {
//				intAry[0] = a;
//				if(b > c) {
//					b = 2;
//					c = 3;
//				}else {
//					c = 2;
//					b = 3;
//				}
//					
//			} else {
//				
//			}
//		} else {
//			
//		}
		
		int[]nuAry = { a, b, c };
		for (int i = 0; i < nuAry.length -1; i++) {
			int al = nuAry[i];
			int bl = nuAry[i+1];
			if(al < bl) {
				nuAry[i] = bl;
				nuAry[i + 1] = al;
				i = -1;
			}
		}
		for(int num : nuAry) {
			System.out.println(num);
		}
		// intAry 안에 큰순서로 내림차순 배열
		// intAry[0] = 85, intAry[1] = 34 intAry[2] = 22; 
		
	}
}
