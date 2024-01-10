package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import servlet07.dto.User;

public class UserDao {
	
	private String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
	private String id = "root";
	private String pwd = "1234";
	
	private String INSERT_SQL = "INSERT INTO DEMO VALUES(NULL, ?, ?, ?)";
	private String SELECT_SQL = "select * from demo order by id desc";
	
	//insert
	public int userInsert(User user) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pwd);
		
		PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL);
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getEmail());
		pstmt.setString(3, user.getPasswd());
		int result = pstmt.executeUpdate();
		
		return result;
	}
	
	public List<User> userList() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pwd);
		
		PreparedStatement pstmt = conn.prepareStatement(SELECT_SQL);
		ResultSet rs = pstmt.executeQuery();
		
		List<User> aList = new ArrayList<User>();
		
		
		if (rs.next()) {
			
			do {
				
				User user = new User();
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPasswd(rs.getString(4));
				aList.add(user);
				
			}while(rs.next());
			
		}
		
		return aList;
	}
	
}
