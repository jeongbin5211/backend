package singletonEx;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberDao {

	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	DBConnect db = DBConnect.getInstance();
	
	// 화면 메뉴
	
	int menu() {
		System.out.println("회원가입 프로그램");
		System.out.println("1.회원목록 | 2.회원가입 | 3.회원수정 | 4.회원삭제 | 5.회원검색 | 6.종료");
		System.out.print("메뉴를 선택하세요. >> ");
		int menu = sc.nextInt();
		System.out.println("");
		
		return menu;
	}
	
	// 회원목록
	
	List<Member> getMembers() throws SQLException {
		
		System.out.println("-------------------------------");
		System.out.println("1. 회원 목록");
		System.out.println("-------------------------------\n");
		
		List<Member> list = new ArrayList<Member>(); // list.add(객체명)
		conn = db.getConnection();
		String sql = "select * from member order by id desc;";
		
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next()) {
			
			// 컬럼 내용
			Member m = new Member();
			
			m.setId(rs.getInt(1));
			m.setEmail(rs.getString(2));
			m.setPasswd(rs.getString(3));
			m.setName(rs.getString(4));
			m.setDepart(rs.getString(5));
			m.setPosition(rs.getString(6));
			m.setSalary(rs.getInt(7));
			m.setStartDate(rs.getString(8));
			m.setEndDate(rs.getString(9));
			
			// 줄에 컬럼내용 담기
			list.add(m);
			
		}
		
		return list;
	}
	
	// 회원가입
	
	int setMember() throws SQLException {
		
		conn = db.getConnection(); // conn
		
		String sql = "insert into member values(null, ?, ?, ?, ?, ?, ?, now(), ?);";
		
		Member m = new Member();
		m.setEmail("mail4@mail.com");
		m.setPasswd("********");
		m.setName("허정빈");
		m.setDepart("HR");
		m.setPosition("대리");
		m.setSalary(2000000);
		m.setEndDate(String.valueOf(LocalDate.now())); // 0000-00-00
		
		ps = conn.prepareStatement(sql);
		ps.setString(1, m.getEmail());
		ps.setString(2, m.getPasswd());
		ps.setString(3, m.getName());
		ps.setString(4, m.getDepart());
		ps.setString(5, m.getPosition());
		ps.setInt(6, m.getSalary());
		ps.setString(7, m.getEndDate());
		
		int row = ps.executeUpdate();
		
//		if (row > 0) {
//			System.out.println("회원가입이 완료되었습니다.");
//		}else {
//			System.out.println("실패");
//		}
		
		
		
		System.out.println("-------------------------------");
		System.out.println("2. 회원 가입");
		System.out.println("-------------------------------\n");
		
		return row;
	}
	
	// 회원수정
	// update member set ~ where ~;
	// where 조건이 있는경우 파라미터 사용하기
	// 파라미터 = int pk
	
	int updateMember(int pk) {
		System.out.println("-------------------------------");
		System.out.println("3. 회원 정보 수정");
		System.out.println("-------------------------------\n");
		return 0;
	}
	
	// 회원삭제
	// pk(primary key) 를 통해서 하나만 삭제하니까 int pk 파라미터 사용
	
	int deleteMember(int pk) {
		System.out.println("-------------------------------");
		System.out.println("4. 회원 삭제");
		System.out.println("-------------------------------\n");
		return 0;
	}
	
	// 회원검색 - 결과가 하나만 나오기때문에 List 안쓰고 Member 사용
	// pk 검색
	
	Member searchMember(int pk) {
		System.out.println("-------------------------------");
		System.out.println("5. 회원 검색");
		System.out.println("-------------------------------\n");
		return null;
	}
	
	// 종료
	
	void disconnect() {
		
		System.out.println("-------------------------------");
		System.out.println("6. 프로그램을 종료합니다.");
		System.out.println("-------------------------------");
		System.exit(0);
	}
	
}
