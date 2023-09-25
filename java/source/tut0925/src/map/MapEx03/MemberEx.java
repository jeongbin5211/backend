package map.MapEx03;

public class MemberEx {

	public static void main(String[] args) {
		
//		List : 줄 + Member 칸 => 
//		홍길동, 1234 => List<Member>
//		홍길동, 1234 => List<Member>
//		홍길동, 1234 => List<Member>
//		순서가 있음 배열명.get(i); 배열명.add()
		
//		Map은 순서가 없고 key로 접근 가능(반복문 사용x), 배열명.put()
		
		MemberDao dao = new MemberDao();
		
		dao.putMember("u1", new Member("홍길동", "1234"));
		dao.putMember("u2", new Member("김철수", "0000"));
		dao.putMember("u3", new Member("김나박", "7777"));
		
		dao.showInfo();
		
//		dao.deleteMember("u1");
		
		boolean result = dao.deleteMember("u1");
		if(result)
			System.out.println("삭제 되었습니다.");
		else
			System.out.println("존재하지 않는 key입니다.");
		
		dao.showInfo();
	}

}
