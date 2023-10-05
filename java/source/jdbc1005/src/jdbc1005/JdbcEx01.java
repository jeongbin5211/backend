package jdbc1005;

import java.sql.*;

// 동작을 별도 클래스에 작업
class DBDao {
	void insertDB1() { // i/o
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/grp";
			String id = "root";
			String psw = "1234";
			
			Connection conn = DriverManager.getConnection(url, id, psw);
			
			String sql = "insert into member values(null, '허정빈', now(), now());";
			
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void insertDB2() throws ClassNotFoundException, SQLException { // i/o
		// 1. 연결 - Connection
		// 2. 쿼리실행 : insert, update, delete, select 동작..
		// 2-1. Statement, PrepareStatement
		// 3. 결과 출력 : ResultSet (생략가능)
		
		Connection conn = null;
		Statement stmt = null; // 연결객체.createStatement();
		ResultSet rs = null;
		
		// Class.forName()
		// 접속 정보
		// 쿼리실행
		// 출력 확인
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 접속 정보
//		String url = "jdbc:mysql://localhost:3306/grp";
		String url = "jdbc:mysql://127.0.0.1:3306/grp";
		String id = "root";
		String pwd = "1234";
		
		conn = DriverManager.getConnection(url, id, pwd);
		System.out.println("연결 확인");
		
		// 쿼리 실행
		
		stmt = conn.createStatement(); // 쿼리를 실행하기 위한 사전 작업
		
		String sql = "insert into member values(null, '김철수', now(), now());";
		
		stmt.execute(sql); // execute : 실행
		System.out.println("Insert Completed...");
		
	}
}


public class JdbcEx01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DBDao dao = new DBDao();
		dao.insertDB2();
	}
	
	

}
