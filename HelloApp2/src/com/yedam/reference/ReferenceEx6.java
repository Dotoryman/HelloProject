package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx6 {
	public static void main(String[] args) {
		// 학생 3명이 있다. 학생a,b,c 의 영어, 수학점수
		int[][] intary = { new int[] { 80, 90 }, // 학생 a
				new int[] { 85, 95 }, // 학생 b
				new int[] { 90, 98 } // 학생 c
		};

//		intary[0] = new int[] { 22, 23 };
		System.out.printf("학생 a 의 영어점수 %d \n", intary[0][0]);
		int engsum = 0;
		int matsum = 0;
//		engsum = intary[0][0] + intary[1][0] + intary[2][0]; 아래 for문과 같다
		for (int i = 0; i < intary.length; i++) {
			engsum += intary[i][0];
		}
		for (int j = 0; j < intary.length; j++) {
			matsum += intary[j][1];
		}
		System.out.printf("세 학생의 \n영어점수 총합은 %d, \n수학점수 총합은 %d \n", engsum, matsum);
		System.out.printf("세 학생의 두과목 점수 총합은 %d \n", engsum + matsum);

//		총점수 구하기 답안
		int totalsum = 0;
		for (int k = 0; k < intary.length; k++) {
			for (int m = 0; m < intary[k].length; m++) {
				totalsum += intary[k][m];
			}
		}
		System.out.printf("전체점수는 %d \n", totalsum);

		String[] nameary = { "SA", "SB", "SC" };

		Scanner scn = new Scanner(System.in);
		System.out.println("학생이름 : ");
		String searchname = scn.nextLine();

		int buck = 0;
		for (int i = 0; i < nameary.length; i++) {
			if (searchname.equals(nameary[i])) {
				System.out.printf("%s 의 영어점수는 %d, 수학점수는 %d 입니다. \n", nameary[i], intary[i][0], intary[i][1]);
			} else {
				buck += 1;
			}
		}
		if(buck == nameary.length) {
		System.out.println("그런 학생은 없는디옹");
		}
	}

}
