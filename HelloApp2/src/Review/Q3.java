package Review;

import java.util.Scanner;

public class Q3 {//가위바위보 머신
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위 바위 보 대결");
		System.out.println();
		
		System.out.print("이름을 입력하세요 : ");
		String name = scanner.next();
		
		for(;;) {
			System.out.print("가위 바위 보 입력 : ");
			String user = scanner.next();
			int userResult = 0;
			
			int comResult = (int)(Math.random() * 3) + 1;
			String com ="";
			
			// 컴퓨터 결과 변환 (int > string)
			switch (comResult) {
			case 1:
				com = "가위";
				break;
			case 2:
				com = "바위";
				break;
			case 3:
				com = "보";
				break;
			}
			
			// 사용자 결과 변환 (string > int)
			switch (user) {
			case "가위":
				System.out.println(name + " : " + user + " / 인공지능 : " + com);
				userResult = 1;
				break;
			case "바위":
				System.out.println(name + " : " + user + " / 인공지능 : " + com);
				userResult = 2;
				break;
			case "보":
				System.out.println(name + " : " + user + " / 인공지능 : " + com);
				userResult = 3;
				break;
			case "그만":
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("다시 입력");
			}
			
			// 결과
			switch (userResult - comResult) {
			case 2: case -1:
				System.out.println(name + " 패배");
				System.out.println();
				break;
			case 1: case -2:
				System.out.println(name + " 승리");
				System.out.println();
				break;
			case 0:
				System.out.println("무승부");
				System.out.println();
				break;
			}
		}
	
	}
}
