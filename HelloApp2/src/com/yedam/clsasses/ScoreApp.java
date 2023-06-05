package com.yedam.clsasses;
//실행클래스 = main
//라이브러리클래스 = Korscore
public class ScoreApp {
	public static void main(String[] args) {
		
		KorScore score = new KorScore();
		System.out.println(score);
		//메소드 호출
		score.print();
		score.total();
		score.max();
		
		KorScore score1 = new KorScore();
		System.out.println(score1);
		score.kor = new int[] {77, 88, 99};
		//메소드 호출
		score1.print();
		score1.total();
		score1.max();
		
		//정적 메소드 활용
		Calculator cal = new Calculator();
		//인스턴스 메소드 호출
		//cal.sum(score.kor[0], score.kor[1] );
		//static 메소드 호출
		Calculator.sum(score1.kor[0], score1.kor[1] );
		Calculator.getArea(3);
	}
}
