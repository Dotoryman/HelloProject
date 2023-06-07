package test1_230605;

import java.util.Scanner;

public class Ex05 {

	static Friend[] fri = new Friend[5];
	static Scanner scn = new Scanner(System.in);

	public static void init() {
		fri[0] = new Friend("스칼렛", "007-00", "990123", 178.32);
	}

	public static void main(String[] args) {

		boolean run = true;
		init();

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.등록 2.목록 3.전화번호 수정 4.삭제 5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				register();
			} else if (selectNo == 2) {
				list();
			} else if (selectNo == 3) {
				modify();
			} else if (selectNo == 4) {
				remove();
			} else if (selectNo == 5) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}
		System.out.println("end of prog.");
	} // end of main().

	public static void register() {
		boolean may = false;
		for (int i = 0; i < fri.length; i++) {
			if (fri[i] == null) {
				may = true;
				break;
			}
		}
		if (!may) {
			System.out.println("등록할 공간이 가득찼습니다.");
			return;
		}

		System.out.print("친구 이름을 입력하세요> ");
		String name = scn.nextLine();
		System.out.print("친구 전화번호를 입력하세요> ");
		String pnum = scn.nextLine();
		System.out.print("친구 생년월일을 입력하세요> ");
		String birth = scn.nextLine();
		System.out.print("친구 키를 입력하세요> ");
		double tall = scn.nextDouble();
		scn.nextLine();
		Friend newth = new Friend(name, pnum, birth, tall);

		for (int i = 0; i < fri.length; i++) {
			if (fri[i] == null) {
				fri[i] = newth;
				System.out.println("등록되었습니다.");
				break;
			}
		}
	}

	public static void list() {
		System.out.println("============보유한 친구정보 목록입니다============.");
		for (int i = 0; i < fri.length; i++) {
			if (fri[i] != null) {
				System.out.printf("친구 이름: %s  친구 전화번호: %s 친구 생년월일: %s 친구 키: %6.2f \n", fri[i].getName(),
						fri[i].getPnum(), fri[i].getBirth(), fri[i].getTall());
			}
		}

	}

	public static void modify() {
		System.out.println("전화번호를 수정할 친구의 이름을 입력해주세요.");
		String name = scn.nextLine();
		for (int i = 0; i < fri.length; i++) {
			if (fri[i] != null && fri[i].getName().equals(name)) {
				System.out.println("수정할 전화번호를 입력해주세요.");
				String pnum = scn.nextLine();
				fri[i].setPnum(pnum);
				System.out.println("정상적으로 수정되었습니다.");
				break;
			}
		}

	}

	public static void remove() {
		System.out.println("삭제할 친구의 이름을 입력해주세요.");
		String name = scn.nextLine();
		for (int i = 0; i < fri.length; i++) {
			if (fri[i] != null && fri[i].getName().equals(name)) {
				fri[i] = null;
				System.out.println("정상적으로 처리되었습니다.");
				break;
			}
		}
	}
}