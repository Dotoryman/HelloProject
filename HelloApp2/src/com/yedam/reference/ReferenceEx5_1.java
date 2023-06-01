package com.yedam.reference;

public class ReferenceEx5_1 {
	public static void main(String[] args) {
		int[] intary = new int[5];
		intary[0] = (int) (Math.random() * 100);
		intary[1] = (int) (Math.random() * 100);
		intary[2] = (int) (Math.random() * 100);
		intary[3] = (int) (Math.random() * 100);
		intary[4] = (int) (Math.random() * 100);

		for (int j = 0; j < intary.length - 1; j++) {
			for (int i = 0; i < intary.length - 1; i++) {
				int temp = 0;
				if (intary[i] < intary[i + 1]) {
					temp = intary[i];
					intary[i] = intary[i + 1];
					intary[i + 1] = temp;
				}
			}
		}
		for (int num : intary) {
			System.out.println(num);
		}
	}
}