package com.yedam.clsasses;

// data : int[] : 필드
// 기능 :전체 출력
//		합계
//		최댓값
public class KorScore {
	//인스턴스 필드
	int[] kor = new int[] {100, 80, 70};
	
	//생성자. 없으면 기본생성자 KorScore() {}
//	KorScore(int[] scores){
//		kor = scores;
//	}
	
	//인스턴스 메소드(static없는것들)
	public void print() {
		for (int score : kor) {
			System.out.println(score);
		}
	}

	public void total() {
		int sum = 0;
		for (int score : kor) {
			sum += score;
		}
		System.out.println(sum);
	}

	public void max() {
		int max = 0;
		for (int score : kor) {
			if (max < score) {
				max = score;
			}
		}
		System.out.println(max);

	}
}
