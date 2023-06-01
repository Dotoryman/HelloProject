package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx8 {
	public static void main(String[] args) {
		// 학생수 => 점수 입력. 점수 출력, 최고점수, 평균점수.
		Scanner scn = new Scanner(System.in);
		int stnum = 0;
		int[] scores = null;
		boolean run = true;

		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석(최고점, 평균) 5.종료");
			System.out.println("-------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				System.out.println("학생수를 입력하세요.");
				stnum = Integer.parseInt(scn.nextLine());
				scores = new int[stnum];
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번 학생의 점수를 입력하세요.");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
			} else if (selectNo == 3) { // 배열의 점수
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]> %d \n", i, scores[i]);
				}
			} else if (selectNo == 4) { // 최고점, 평균점
				double sum = 0;
				double avg = 0;
				int maxnum = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (maxnum < scores[i]) {
						maxnum = scores[i];
					}
				}
				avg = sum / (scores.length);
				System.out.printf("최고점수는 %d 점입니다. \n", maxnum);
				System.out.printf("평균점수는 %.2f 점입니다. \n ", avg);
			} else if (selectNo == 5) { // 종료 -false
				run = false;
			} else {
				System.out.println("올바른 메뉴번호를 선택하세요");
			}
		}
		System.out.println("종료합니다");
	}// end of main()
}
