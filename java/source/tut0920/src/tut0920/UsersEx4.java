package tut0920;

public class UsersEx4 {

	public static void main(String[] args) {
		// UserEx3.java 간단하게
		
		Users2[] u2 = new Users2[3];
		
		for(int i = 0; i < u2.length; i++) {
			// 초기화
			u2[i] = new Users2();
			
			u2[i].setUserid("코리아"+ i);
			u2[i].setUserpw("비밀번호 " + i);
			u2[i].setAge(i);
		}
		System.out.println(u2.length + "명의 회원정보가 저장되었습니다.\n");
		
		System.out.println("회원정보를 출력합니다.");
		
		for (int i = 0; i < u2.length; i++) {
			Users2 member = u2[i];
			System.out.println(member.getUserid());
			System.out.println(member.getUserpw());
			System.out.println(member.getAge());
		}

	}

}
