package JdbcEx05;

import java.sql.*;

class ItemCrud {
	
	void insertItem() {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			
//			String sql = "insert into items values(null, ?, ?, ?, now());";
			String sql = "insert into items values(null, ?, ?, ?, now());";
			
			ps = conn.prepareStatement(sql);
			
//			ps.setString(1, "소"); // 객체로 바꾸기
			
			Items item = new Items();
			
			item.setItemName("소");
			item.setItemPrice(100000);
			item.setItemStock(10);
			
			ps.setString(1, item.getItemName()); // 실제 디비 저장
			ps.setInt(2, item.getItemPrice());
			ps.setInt(3, item.getItemStock());
			
			int row = ps.executeUpdate();
			
			if(row > 0) {
				System.out.println(item.getItemName() + " 상품 등록이 완료 되었습니다.");
			}else {
				System.out.println("상품 등록에 실패하였습니다.");
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	void selectItem() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		String id = "root";
		String pw = "1234";
		
		conn = DriverManager.getConnection(url, id, pw);
		
		String sql = "select * from items order by item_id desc;";
		
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next()) { // 디비에 있는것을 바로 출력하는게 아님
							// 디비에서 get -> 객체에 set -> 화면출력
			Items item = new Items(); // 반복하는 수 만큼 초기화
			
//			rs.getInt(1); // db에서 id값 가져옴
//			item.setItemId(rs.getInt(1));
			item.setItemName(rs.getString(2));
			item.setItemPrice(rs.getInt(3));
			item.setItemStock(rs.getInt(4));
			item.setItemDate(rs.getString(5));
			
			System.out.println(item.toString());
			
		}
		
	}
}

public class ItemsEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ItemCrud crud = new ItemCrud();
//		crud.insertItem();
		
		crud.selectItem();

	}

}
