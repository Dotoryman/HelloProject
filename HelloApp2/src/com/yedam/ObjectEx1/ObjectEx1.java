package com.yedam.ObjectEx1;

import java.util.Scanner;

public class ObjectEx1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Member[] members = new Member[2];

		// 입력
		for (int i = 0; i < members.length; i++) {
			Member m1 = new Member();
			System.out.print("아이디 입력 : ");
			String id = scn.nextLine();
			// 아이디 중복체크하기
			// i => 0이면 처음등록
			// i != 0 이면 , 5번째 등록한 값이면 1,2,3,4번값과 비교
			if (i != 0) {
				boolean dupId = false; //
				for (int j = 0; j < i; j++) {
					if (members[j].memberId.equals(id)) {
						dupId = true; // 중복된 아이디임을 확인했을 때
						break; // 다음 순번을 볼 필요 없음
					}
				}
				if (dupId) {
					System.out.println("이미 존재하는 아이디입니다.");
					i--;
					continue;
				}
			}

			m1.memberId = id;

			System.out.print("이름 입력 : ");
			m1.memberName = scn.nextLine();
			System.out.print("포인트 입력 : ");
			m1.point = Integer.parseInt(scn.nextLine());

			members[i] = m1;
		}

		// memberId 조회 후 point 변경
		System.out.println("조회할 아이디를 입력하세요.");
		String searchId = scn.nextLine();
		System.out.println("변경할 point를 입력하세요.");
		int newPoint = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < members.length; i++) {
			if (members[i].memberId.equals(searchId)) {
				members[i].point = newPoint;
				System.out.println("변경된 포인트는" + members[i].point);
			}
		}

		// 출력
		for (int i = 0; i < members.length; i++) {
			System.out.printf("아이디 : %s, 이름 : %s, point : %d,", members[i].memberId, members[i].memberName,
					members[i].point);
		}
	}
}
