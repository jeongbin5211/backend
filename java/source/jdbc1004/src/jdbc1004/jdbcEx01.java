package jdbc1004;

import java.sql.*;

public class jdbcEx01 {

	public static void main(String[] args) {
		// 데이터입출력 : try ~ catch() 또는 메소드 이름 옆에 throws
		
		jdbcEx01 jdbc = new jdbcEx01();
		jdbc.mysqlConnect();

	}

	void mysqlConnect() { // mysql 접속 동작
		try {
			
			// 1. jdbc 연결 : Class.forName();
			// ver 5 : Class.forName("com.mysql.jdbc.Driver");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 연결정보 : Connection
			String url = "jdbc:mysql://localhost:3306/shop";
			String id = "root";
			String pwd = "1234";
			
			
			// DriverManager.getConnection(주소, 아이디, 비밀번호);
			DriverManager.getConnection(url, id, pwd);
			
			// 3. 확인
			System.out.println("데이터베이스 연결 완료");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
