import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberDao {
	
	Scanner sc = new Scanner(System.in);
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	String url = "jdbc:mysql://localhost:3306/kordb";
	String id = "kordb";
	String pw = "0000";
	
	int disp() {
		System.out.println("=====================");
		System.out.println("1.회원가입 2.회원목록 3.종료");
		System.out.println("=====================");
		System.out.print("\n메뉴를 선택해주세요.(숫자 1 ~ 3) >> ");
		int menu = sc.nextInt();
		
		return menu;
		
	}
	
	int setMember() {
		
		int row = 0;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, id, pw);
			
			String sql = "insert into kordb_member values(null, ?, ?, now(), ?, ?);";
			
			Member m = new Member();
			
			m.setMem_name("홍길동");
			m.setMem_pw("1234");
			m.setMem_gender("M");
			m.setMem_intro("자기소개1");
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, m.getMem_name());
			ps.setString(2, m.getMem_pw());
			ps.setString(3, m.getMem_gender());
			ps.setString(4, m.getMem_intro());
			
			row = ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
		
	}
	
	List<Member> getMember() {
		
		List<Member> list = new ArrayList<Member>();
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, id, pw);
			
			String sql = "select * from kordb_member;";
			
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				
				
				Member m = new Member();
				m.setMem_id(rs.getInt(1));
				m.setMem_name(rs.getString(2));
				m.setMem_pw(rs.getString(3));
				m.setMem_regdate(rs.getString(4));
				m.setMem_gender(rs.getString(5));
				m.setMem_intro(rs.getString(6));
				
				list.add(m);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
}
