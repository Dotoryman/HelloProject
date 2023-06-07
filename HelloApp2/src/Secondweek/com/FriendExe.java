package Secondweek.com;

import java.util.Scanner;

//추가, 수정, 삭제, 목록
//추가 : 학교친구 (이름, 연락처, 학교, 전공) , 회사친구 (이름, 연락처, 회사, 부서) , 친구 (이름, 연락처)
//수정 : 이름조회 => 학교친구 : 학교,전공 수정 , 회사친구 : 회사,부서 수정 , 친구 : 연락처 수정
//삭제 : 이름조회 =>삭제
//목록 : 
public class FriendExe {
	Scanner scn = new Scanner(System.in);
	Friend[] fs = new Friend[10];
	int friendNo = 0;

	public void execute() {
		boolean run = true;
		int selectNo = 0;
		while (run) {
			System.out.println("1. 친구추가 2. 친구정보 수정 3. 친구삭제 4. 친구목록보기 5. 종료");
			System.out.print("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {
				plus();
			} else if (selectNo == 2) {
				modify();
			} else if (selectNo == 3) {
				minus();
			} else if (selectNo == 4) {
				list();
			} else if (selectNo == 5) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
		System.out.println("end of prog");
	}

	public void plus() {

		System.out.println("1. 학교친구 2. 회사친구 3. 그냥친구");
		System.out.print("선택> ");
		int menu = Integer.parseInt(scn.nextLine());

		System.out.println("추가할 친구 이름을 입력하세요");
		String name = scn.nextLine();
		System.out.println("추가할 친구 연락처를 입력하세요");
		String phone = scn.nextLine();
		
		if (menu == 1) {
			System.out.println("추가할 친구 학교를 입력하세요");
			String univ = scn.nextLine();
			System.out.println("추가할 친구 전공을 입력하세요");
			String major = scn.nextLine();
			fs[friendNo++] = new UnivFriend(name, phone, univ, major);
		} else if (menu == 2) {
			System.out.println("추가할 친구 회사를 입력하세요");
			String company = scn.nextLine();
			System.out.println("추가할 친구 회사부서를 입력하세요");
			String department = scn.nextLine();
			fs[friendNo++] = new ComFriend(name, phone, company, department);
		} else if (menu == 3) {
			fs[friendNo++] = new Friend(name, phone);
		}

		System.out.println("정상적으로 등록되었습니다.");

	}

	public void modify() {
		String info1, info2;
		System.out.println("정보를 수정할 친구의 이름을 입력해주세요.");
		String name = scn.nextLine();
		for (int i = 0; i < fs.length; i++) {
			if (fs[i] != null && fs[i].getName().equals(name)) {
				if (fs[i] instanceof UnivFriend) {
					System.out.println("수정할 친구 학교를 입력해주세요.");
					info1 = scn.nextLine();
					System.out.println("수정할 친구 전공을 입력해주세요.");
					info2 = scn.nextLine();
					UnivFriend univ = (UnivFriend) fs[i];
					univ.setUniv(info1);
					univ.setMajor(info2);
					System.out.println("정상적으로 수정되었습니다.");
					break;
				} else if(fs[i] instanceof ComFriend){
					System.out.println("수정할 친구 회사를 입력해주세요.");
					info1 = scn.nextLine();
					System.out.println("수정할 친구 부서를 입력해주세요.");
					info2 = scn.nextLine();
					ComFriend com = (ComFriend) fs[i];
					com.setCompany(info1);
					com.setDepartment(info2);
					System.out.println("정상적으로 수정되었습니다.");
					break;
				} else {
					System.out.println("수정할 전화번호를 입력해주세요.");
					info1 = scn.nextLine();
					Friend pnum = (Friend) fs[i];
					pnum.setPhone(info1);
					System.out.println("정상적으로 수정되었습니다.");
					break;
				}
			}
		}

	}

	public void minus() {
		System.out.println("삭제할 친구의 이름을 입력해주세요.");
		String name = scn.nextLine();
		for (int i = 0; i < fs.length; i++) {
			if (fs[i] != null && fs[i].getName().equals(name)) {
				fs[i] = null;
				System.out.println("정상적으로 처리되었습니다.");
				break;
			}
		}
	}

	public void list() {
		System.out.println("============보유한 친구정보 목록입니다============.");
		for (int i = 0; i < fs.length; i++) {
			if (fs[i] != null) {
				System.out.printf(fs[i].showInfo());
			}
		}
	}

}
