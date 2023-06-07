package Secondweek.com;

// 친구의 정보를 저장하기위한 app 기본 - 이름/연락처 ==> Friend
// 학교친구 - 이름, 연락처, 학교이름, 전공 == UnivFriend
// 회사친구 - 이름, 연락처, 회사이름, 부서 == ComFriend

public class FriendApp {
	public static void main(String[] args) {
		FriendExe exe = new FriendExe();
		exe.execute(); //실행시작 메소드
	}
	
	public static void method() {
		Friend[] friends = new Friend[10];
//		UnivFriend[] univs = new UnivFriend[10]; //생략가능
		
		friends[0] = new Friend("김박박", "010-1112-2223");
		friends[1] = new UnivFriend("박박박","010-2333-3444","한국대","역사학과");
		friends[2] = new ComFriend("이척척","010-3334-566","일본산업","영업부");
		
		for (Friend friend : friends) {
			if(friend != null) {
				System.out.println(friend.showInfo());
			}
		}
	}
}
