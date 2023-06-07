package Secondweek.abstracts;

//mysql : dbms 기능구현 추가 : add()
//oracle : dbms 기능구현 추가 : plus() 

public class JdbcExe {
	public static void main(String[] args) {
		Dao dao = new MysqlDao(); // new MysqlDao();
//		OracleDao odao = new OracleDao();  상속의 관계가 아닐경우
		
		dao.start(); // odao.begin(); 새로 정의하고 기존코드 변경
		dao.add(); // odao.register();
		dao.modify(); // odao.modify();
		dao.remove(); // odao.delete();
		dao.stop(); // odao.end();
		
	}
}
