package customer;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class CustomerDao {

	Connection conn = null;
	PreparedStatement pr = null;
	ResultSet rs = null;
	
	CustomerDao dao = null;
	
	
	// 연결 객체
	Connection getConnection() {
		
//		Connection conn = null; // 전역처리
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	// 입력
	void setCustomer() throws SQLException {
		
//		PreparedStatement pr = null; // 전역처리
		
//		CustomerDao dao = new CustomerDao(); // 전역처리
		dao = new CustomerDao();
//		dao.getConnection(); // db 연결 완료
		conn = dao.getConnection();
		
		String sql = "insert into customers values(?, ?, ?, ?, now())";
		
//		pr = dao.getConnection().prepareStatement(sql);
		pr = conn.prepareStatement(sql);
		
		// db에 저장하기 전에 setter에 임시 저장
		Customer c = new Customer();
		
		c.setId(102);
		c.setName("이길동");
		c.setEmail("email@mail.com");
		c.setSalary(2000000);
		
		pr.setInt(1, c.getId());
		pr.setString(2, c.getEmail());
		pr.setString(3, c.getName());
		pr.setInt(4, c.getSalary());
		
		int row = pr.executeUpdate();
		if (row > 0) {
			System.out.println("고객 등록 완료");
		}else {
			System.out.println("fail");
		}
	}
	
	// 출력
	// 결과가 몇줄로 나와서 List사용
	List<Customer> getCustomers() throws SQLException {
		
		// Collections 이용
		// 빈줄, 빈칸 -> 값 삽입 -> 객체.add();
		List<Customer> list = new ArrayList<>();
		
		dao = new CustomerDao();
		conn = dao.getConnection();
		
		String sql = "select * from customers order by id desc;";
		
		pr = conn.prepareStatement(sql);
		rs = pr.executeQuery();
		
		while(rs.next()) {
			
			Customer c = new Customer();
			
			c.setId(rs.getInt(1));
			c.setEmail(rs.getString(2));
			c.setName(rs.getString(3));
			c.setSalary(rs.getInt(4));
			c.setRegdate(rs.getString(5));
			
			list.add(c); // list 3줄 생김
			
		}
		
		return list;
	}
}
