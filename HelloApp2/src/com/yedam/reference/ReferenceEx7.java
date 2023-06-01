package com.yedam.reference;

public class ReferenceEx7 {
	public static void main(String[] args) {
		//학교의 키, a반 2명 b반 4명 c반 3명
		double [][] hiary = {
				{ 180.6 , 181.6 },
				{ 202.8, 154.6, 166.7, 173.2},
				{ 178.5, 176.4, 180.1}
		};
		System.out.println(hiary[1].length);
		
		for (int j = 0; j < hiary.length; j++) {
			double sum = 0;
			for (int i = 0; i < hiary[j].length; i++) {
				sum += hiary[j][i];
			}
			String fmt = "%d 반의 평균키 : %.1f \n";
			System.out.printf(fmt, (j + 1 ), (sum / hiary[j].length));
		}
		
		//각 반별로 키의 평균 > a반의 평균키 : 
		//각 반별로 키의 평균 > b반의 평균키 : 
		//각 반별로 키의 평균 > c반의 평균키 : 
	}
}
