package tut0920;

class Users2 {
	// 필드
	String userid;
	String userpw;
	int age;
	
	// 생성자
	public Users2() {
		
	}

	
	// getter, setter
	
	
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
	
	// 메소드
	
	@Override
	public String toString() {
		return "Users2 [userid=" + userid + ", userpw=" + userpw + ", age=" + age + "]";
	}
	
}

public class UsersEx3 {

	public static void main(String[] args) {
		Users2[] u2 = new Users2[3];
		
		// set 저장
		for (int i = 0; i < u2.length; i++) {
			
			// 초기화
			u2[i] = new Users2();
			
			u2[i].setUserid("아이디 " + i);
			u2[i].setUserpw("비밀번호 " + i);
			u2[i].setAge(i);
			
			System.out.println((i + 1) + "번째 회원정보를 출력합니다.");
			System.out.println(u2[i].getUserid());
			System.out.println(u2[i].getUserpw());
			System.out.println(u2[i].getAge());
			System.out.println("\n---------------------\n");
		}

	}

}
