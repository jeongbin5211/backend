package tut0925.List05;

public class MemberEx {

	public static void main(String[] args) {
		
		// List(dao) 만들고 칸만들기(member)
		
		MemberDao md = new MemberDao(); // 초기화
		
		md.addMember(new Member("홍길동", "1111"));
		md.addMember(new Member("김철수", "2222"));
		
		md.showInfo(); // 2
		
		md.deleteMember("홍길동");
		
		md.showInfo();
		
	}

}
