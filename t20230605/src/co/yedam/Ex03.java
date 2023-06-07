package co.yedam;

public class Ex03 {
	public static void main(String[] args) {
		int[] ex03 = new int[5];
		for (int i = 0; i < ex03.length; i++) {
			ex03[i] = (int) (Math.random() * 10 + 1);
		}
		int max = 0;
		int min = 10;
		for (int num : ex03) {
			if (max < num) {
				max = num;
			}
			if (min > num) {
				min = num;
			}
		}
		System.out.printf("최고값은 %d", max);
		System.out.printf("최소값은 %d", min);
	}

}