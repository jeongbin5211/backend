package tut0925.List05;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	
	// 생성자를 통해 List 생성, 저장 메소드, 삭제 메소드, 출력 메소드
	
	// List 생성
	
	List<Member> list = null;
	
	public MemberDao() {
		list = new ArrayList<Member>();
	}
	
	public void addMember(Member m) { // Member를 받아옴 m = 별명
		list.add(m);
	}
	
	public void deleteMember(String id) {
		
		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getMemberID() == id) {
//				list.remove(i);
//				System.out.println(id + "회원이 삭제되었습니다.");
//			}
			
			// String 값 비교 -> equals
			String tmp = list.get(i).getMemberID();
//			if ( id.equals(list.get(i).getMemberID()) ) {
//				list.remove(i);
//			}
			
			if (id.equals(tmp)) {
				list.remove(i);
				System.out.println(id + " 회원이 삭제되었습니다.");
			}
		}
	}
	
	public void showInfo() {
//		System.out.println(list.size());
//		for (출력타입 별명 : 배열명) {
//			출력코드(별명)
//		}
		
		for (Member m : list) {
//			System.out.println(m);
			m.disp(); // disp() -> sysout
			System.out.println("----------------");
		}
		
		// 배열번호가 필요할때 for
		for (int i = 0; i < list.size(); i++) {
			// 배열명.get(i).disp();
			list.get(i).disp();
		}
		
	}
}
