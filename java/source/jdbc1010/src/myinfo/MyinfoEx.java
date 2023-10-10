package myinfo;

import java.sql.*;

class Myinfo {
	private String userid;
	private String userpw;
	private int age;
	
	public Myinfo() {}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Myinfo [userid=" + userid + ", userpw=" + userpw + ", age=" + age + "]";
	}
	
	
}

class InsertDB {
	
	void insertQuery() {
		
		// 연결(Connection), SQL실행(PreparedStatement), (결과출력)
		
		Connection conn = null;
		PreparedStatement pr = null;
		
		try {
			
			// 접속에 필요한 드라이버
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("연결 확인");
			
			String sql = "insert into myinfo values(?, ?, ?)";
			
			pr = conn.prepareStatement(sql);
			
			
//			첫번째 방법 = db에 직접 넣기
//			pr.setString(1, "koreait");
//			pr.setString(2, "1234");
//			pr.setInt(3, 20);
			
//			두번째 방법 = 객체화
			Myinfo info = new Myinfo();
			
			info.setUserid("setUserid");
			info.setUserpw("2222");
			info.setAge(20);
			
			pr.setString(1, info.getUserid());
			pr.setString(2, info.getUserpw());
			pr.setInt(3, info.getAge());
			
			int row = pr.executeUpdate();
			
			if (row > 0) {
				System.out.println("회원가입완료");
				System.out.println(info.getUserid() + " 님 환영합니다.");
			} else {
				System.out.println("실패");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	void selectQuery() throws ClassNotFoundException, SQLException {
		
		// 연결, 쿼리실행, 결과출력
		Connection conn = null;
		PreparedStatement pr = null;
		ResultSet rs = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id = "root";
		String pw = "1234";
		
		conn = DriverManager.getConnection(url, id, pw);
		
		String query = "select * from myinfo order by userid asc;";
		
		pr = conn.prepareStatement(query); // 준비
		
		rs = pr.executeQuery();
		
		while (rs.next()) {
//			System.out.println("아이디 : " + rs.getString(1) + " 비밀번호 : " + rs.getString(2) + " 나이 : " + rs.getInt(3));
			
			Myinfo m = new Myinfo();
			
			m.setUserid(rs.getString(1));
			m.setUserpw(rs.getString(2));
			m.setAge(3);
			
			System.out.println(m.toString());
			
			System.out.println("-------------------------------------------------------");
			
//			System.out.println(m.getUserid());
//			System.out.println(m.getUserpw());
//			System.out.println(m.getAge());
			
		}
		
	}
	
}

public class MyinfoEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		InsertDB db = new InsertDB();
//		db.insertQuery();
		
		db.selectQuery();
	}
	
}
