package singletonEx;

import java.sql.SQLException;
import java.util.List;

public class MemberEx {

	public static void main(String[] args) throws SQLException {

		MemberDao dao = new MemberDao();
		
		// Singleton 연결 객체 불러오기
		
		// DBConnect.getInstance().getConnection();
		
		DBConnect db = DBConnect.getInstance();
		// db.getConnection();
		
//		System.out.println(menu);
		
		boolean run = false;
		while (!run) {
			int menu = dao.menu();
			
			switch(menu) {
			case 1 :
				List<Member> list = dao.getMembers();
				//if (list.size() == 0)
				if (list.isEmpty()) {
					System.out.println("가입된 회원이 없습니다.");
				}else {
					System.out.println("가입된 회원은 " + list.size() + "명 입니다.\n");
					for (Member m : list) {
						System.out.println(m.toString());
						System.out.println("");
					}
				}
				
				break;
				
			case 2 :
				int row = dao.setMember();
				if (row > 0) {
					System.out.println("회원가입이 완료되었습니다.");
				}else {
					System.out.println("Fail");
				}
				break;
				
			case 3 :
				dao.updateMember(0);
				break;
				
			case 4 :
				dao.deleteMember(0);
				break;
				
			case 5 :
				dao.searchMember(0);
				break;
				
			case 6 :
				dao.disconnect();
				break;
				
			default :
				System.out.println("-------------------------------");
				System.out.println("메뉴를 다시 선택해주세요.");
				System.out.println("-------------------------------\n");
			}
		}
		
	}

}
