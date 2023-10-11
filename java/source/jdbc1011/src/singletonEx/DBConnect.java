package singletonEx;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	// singleton : 개발자가 한번만 만들어서 공유(아무나 new를 이용해서 객체 생성하면 안될때)
	
	// 1. 객체 생성 1번만 작성 : private static
	private static DBConnect db = new DBConnect(); 
	
	// 2. 객체 생성(생성자)도 1번만 그리고 아무나 접근x -> private
	private DBConnect() {}
	
	// 1,2 에서 만들어 놓은 객체에 접근하려면 public 이용해서 싱글톤 접근 메소드 작성
	public static DBConnect getInstance() {
		
		return db;
	}
	
	// 4. 사용할 메소드 작업하기 : Connection
	Connection getConnection() {
		
		Connection conn = null;
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			// System.out.println("연결 완료");		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
