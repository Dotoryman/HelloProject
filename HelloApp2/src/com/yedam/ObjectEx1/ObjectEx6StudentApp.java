package com.yedam.ObjectEx1;

import java.util.Scanner;

public class ObjectEx6StudentApp {
	static SACL[] stu = new SACL[20];
	static Scanner scn = new Scanner(System.in);
	// 학생정보관리 App
	// 1.등록 2.목록 3.조회(이름)(조회할 학생이름을 입력하세요) 4.수정(점수) 5.삭제 6.종료
	// 학생정보 = 학생번호(23-001) 이름 성별(남,여) 점수

	// 1.등록
	public static void resister() {
		System.out.println("등록할 학생의 학생번호를 입력하세요");
		String stuNo = scn.nextLine();

		System.out.println("학생 이름을 입력하세요");
		String stuName = scn.nextLine();

		System.out.println("학생의 성별(남,여)을 입력하세요");
		String stuGen = scn.nextLine();

		System.out.println("학생의 점수를 입력하세요");
		int stuScore = Integer.parseInt(scn.nextLine());

		SACL sacl = new SACL();
		sacl.setStuNo(stuNo);
		sacl.setStuName(stuName);
		sacl.setStuGen(stuGen);
		sacl.setStuScore(stuScore);

		for (int i = 0; i < stu.length; i++) {
			if (stu[i] == null) {
				stu[i] = sacl;
				System.out.println("정상적으로 등록되었습니다.");
				break;
			}
		}
	}

	// 2.목록
	public static void list() {
		for (int i = 0; i < stu.length; i++) {
			if(stu[i] != null ) {
			System.out.printf("학생 번호: %s  학생 이름: %s 성별: %s 점수: %d \n", stu[i].getStuNo(), stu[i].getStuName(),
					stu[i].getStuGen(), stu[i].getStuScore());
			}
			int maxnum = 0;
			for (int j = 0; j < stu.length; j++) {
				if (maxnum < stu[j].getStuScore() && stu[j] != null) {
					maxnum = stu[j].getStuScore();
				}
			}		
			System.out.printf("최고점수는 %d 점입니다. \n", maxnum);
		}
	}

	// 3.조회
	public static void search() {
		System.out.println("조회할 학생의 학생번호를 입력해주세요.");
		String stuNo = scn.nextLine();
		boolean kick = false;
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null && stu[i].getStuNo().equals(stuNo)) {
				System.out.printf("학생 번호: %s  학생 이름: %s 성별: %s 점수: %d \n", stu[i].getStuNo(), stu[i].getStuName(),
						stu[i].getStuGen(), stu[i].getStuScore());
				kick = true;
				break;
			}
		}
		if (!kick) {
			System.out.printf("%s 는 존재하지 않는 학생번호입니다. \n", stuNo);
			return;
		}
	}

	// 4.수정
	public static void modify() {
		System.out.println("점수를 수정할 학생의 학생번호를 입력해주세요.");
		String stuNo = scn.nextLine();
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null && stu[i].getStuNo().equals(stuNo)) {
				System.out.println("수정할 점수를 입력해주세요.");
				int stuScore = Integer.parseInt(scn.nextLine());
				stu[i].setStuScore(stuScore);
				System.out.println("정상적으로 삭제되었습니다.");
				break;
			}
		}

	}

	// 5.삭제
	public static void remove() {
		System.out.println("삭제할 학생의 학생번호를 입력해주세요.");
		String stuNo = scn.nextLine();
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null && stu[i].getStuNo().equals(stuNo))
				;
			stu[i] = null; // 값을 null로 대체.
			System.out.println("정상적으로 삭제되었습니다.");
			break;
		}

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int selectNo = 0;

		while (run) {
			System.out.println("1.학생 등록 2.학생 목록 3.학생 조회 4.학생정보 수정 5.학생정보 삭제 6.종료");
			System.out.print("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) { // 등록
				resister();
			} else if (selectNo == 2) { // 학생목록
				list();
			} else if (selectNo == 3) {// 학생조회
				search();
			} else if (selectNo == 4) {// 등록정보 수정
				modify();
			} else if (selectNo == 5) {// 삭제
				remove();
			} else if (selectNo == 6) { // 종료
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
		System.out.println("end of prog");
	}

	// 1.register() 2.list() 3.search() 4.modify() 5.remove()
	// 2. 목록에서 (남 -2명, 여 -3명) 성별에 따른 인원수 출력,( 최고점수 : 이름 - 100점) 최고점수와 이름 출력
	// 이름 잘못적으면 '없는 학생인디옹; 출력할수있게.
}
