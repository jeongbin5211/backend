package tut0922.Member;

public class MemberEx {

	public static void main(String[] args) {
		
		Member member1 = new Member(1001, "홍길동");
		
		Member member2 = new Member(2001, "김철수");
		
		Member member3 = new Member(3001, "이영희");
		
		MemberDao dao = new MemberDao(); // list 공간 생성
		
		dao.addMember(member1);
		dao.addMember(member2);
		dao.addMember(member3);
		
//		dao.showMember();
	
//		dao.deleteMember(1001);		
		
		System.out.println("회원 정보를 검색합니다...");
		System.out.println("검색할 회원 아이디를 입려하세요");
		
		dao.findById(3001);
		
		
		
		

	}

}
