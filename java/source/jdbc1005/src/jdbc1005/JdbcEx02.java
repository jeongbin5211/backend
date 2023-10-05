package jdbc1005;

import java.sql.*;

class SelectDao {
	void selectDB() {
		// 연결, 쿼리실행, 실행결과
		
		// 1. Connection
		Connection conn = null;
		Statement state = null;
		ResultSet rs = null; // while
		
		
		// 2. 쿼리실행
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grp", "root", "1234");
			System.out.println("연결확인");
			
			state = conn.createStatement();
			
			String sql = "select * from member order by com_id desc;";
			rs = state.executeQuery(sql); // rs == 객체 배열
			System.out.println("사원 목록을 출력합니다.");
			while(rs.next()) { // 한줄씩 값을 가져와서...
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
				System.out.println("사번 : " + rs.getInt(1) + ", 이름 : " + rs.getString(2) + ", 입사일 : " + rs.getDate(3) + ", 퇴사일 : " + rs.getDate(4));
				System.out.println("------------------------------------------------------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("연결 실패");
		}
		
		// 3. 실행결과
		
	}
}

public class JdbcEx02 {

	public static void main(String[] args) {
		
		SelectDao dao = new SelectDao();
		dao.selectDB();
	}

}
