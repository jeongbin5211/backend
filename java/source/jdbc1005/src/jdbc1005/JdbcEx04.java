package jdbc1005;

import java.sql.*;

class insertDao {
	
	void selectDB() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			
			String sql = "select * from items order by item_id desc;";
			
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery(); // executeQuery : 변화하는것 없이 그냥 가져오는 역할
			
			while(rs.next()) {
				System.out.print("상품번호 : " + rs.getInt(1) + " ");
				System.out.print("상품명 : " + rs.getString(2) + " ");
				System.out.print("상품재고 : " + rs.getInt(3) + " \n");
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void insertDB() {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			
//			String sql = "insert into items values(?, ?, ?, ?, ?);";
			String sql = "insert into items values(null, ?, ?, ?, now());";
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, "컴퓨터");
			ps.setInt(2, 2500000);
			ps.setInt(3, 10);
			
			int row = ps.executeUpdate();
			
			if (row > 0) {
				System.out.println(row);
				System.out.println("상품등록이 완료되었습니다.");
			}else {
				System.out.println("관리자에게 문의하세요.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class JdbcEx04 {

	public static void main(String[] args) {
		insertDao dao = new insertDao();
//		dao.insertDB();
		
		dao.selectDB();
		
	}

}
