package Review;

public class ClassHomework {
	public static void main(String[] args) {
		//for문 기초
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}System.out.println(sum);
		
		int sam = 0;
		for(int i = 0; i <= 100; i++) {
			if(i%3 == 0) {
				sam += i;
			}
		}System.out.println(sam);
		
		//중첩 for문으로 구구단 만들기
		for (int i = 2; i < 10; i++) {
			System.out.println("==="+ i +"단===");
			for (int j = 1; j < 10 ; j++) {
				System.out.println(i + "X" + j +"="+ (i * j));
			}
		}
	}
}
