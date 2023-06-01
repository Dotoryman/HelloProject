package com.yedam.reference;

public class ReferenceEx3 {
	public static void main(String[] args) {
		// 학생점수 : 89.5, 78.9, 90.4 값을 저장. sum, avg 구함
		double[] scAry = { 89.5, 78.9, 90.4 };
		double sum = scAry[0] + scAry[1] + scAry[2];
		scAry = new double[] { 55.5, 66.6, 77.7, 88.8 };
		double maxVal = 100;
		double minVal = 0;
		sum = 0;
		int cnt = 0;
//		for (double j = 0; j <4; j ++) {// 다시해보기
//			if (maxVal < scAry[j]) {
//				maxVal = scAry[j];
//			}
//			if (minVal > scAry[j]) {
//				minVal = scAry[j];
//			}
//		} sum += scAry[i];
		for (int i = 0; i < 3; i++) {
			sum += scAry[i];
			cnt++;
		}
		double avg = sum / cnt;
		System.out.println("총점은  " + sum + "점입니다.");
		System.out.println("평균은 " + (sum / cnt) + "점입니다.");
		String fmt = "합계점수는 %.2f, 평균은 %.2f, 최고점수는 %.2f ";
		System.out.printf(fmt, sum, avg, maxVal);
	}
}
