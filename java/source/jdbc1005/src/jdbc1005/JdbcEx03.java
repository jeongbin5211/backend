package jdbc1005;

import java.sql.*;

class UpdateDao {
	
	void updateDB() {
		try {
			
			Connection conn = null;
			Statement state = null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grp", "root", "1234");
			
			state = conn.createStatement();
			
			String sql = "update member set com_name = '광주아이디' where com_id = 2;";
			
			state.executeUpdate(sql);
			
			int result = state.executeUpdate(sql); // 수정되면 1 아니면 0
			
			if (result > 0) {
				System.out.println("회원 정보가 수정되었습니다.");
			}else {
				System.out.println("관리자에게 문의하세요.");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("연결 실패");
		}
	}
}

class DeleteDao {
	
	void DeleteDB() {
		
		try {
			Connection conn = null;
			Statement state = null;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grp", "root", "1234");
			
			String sql = "delete from member where com_id = 5;";

			state = conn.createStatement();
			
			int row = state.executeUpdate(sql); // 결과가 지워지면 1, 아니면 0
			
			if( row > 0) {
				System.out.println("회원정보가 삭제되었습니다.");
			}else {
				System.out.println("삭제할 수 없습니다.\n관리자에게 문의하세요.");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("관리자에게 문의하세요.");
		}
	}
}


public class JdbcEx03 {

	public static void main(String[] args) {
//		UpdateDao dao = new UpdateDao();
//		dao.updateDB();

		DeleteDao delete = new DeleteDao();
		delete.DeleteDB();
		
	}

}
