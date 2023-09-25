package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	private String userid;
	private String userpw;
	
	public Member() {}
	
	public Member(String userid, String userpw) {
		this.userid = userid;
		this.userpw = userpw;
	}
	
	public void disp() {
		System.out.println("아이디 : " + userid + ", 비밀번호 : " + userpw);
	}
}

public class setEx03 {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", "1234"));// 초기화 하면서 값넣기
		set.add(new Member("김철수", "2222"));
		set.add(new Member("이영희", "3333"));
		
		for (Member m : set) {
//			System.out.println(m);
			m.disp();
		}
		
		System.out.println("----------------------");
		Iterator<Member> ir = set.iterator();
		
		while(ir.hasNext()) {
			ir.next().disp();
		}
		
	}

}
