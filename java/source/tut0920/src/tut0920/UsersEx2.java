package tut0920;

class Users {
	// 필드
	String userid;
	String userpw;
	int age;
	
	// 생성자
	
	public Users() {}
	
	public Users(String userid, String userpw, int age) {
		this.userid = userid;
		this.userpw = userpw;
		this.age = age;
	}

	// 캡슐화(데이터보호) 처리 : 저장 setter, 출력 getter
	
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
	
	public void disp() {}
	
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", userpw=" + userpw + ", age=" + age + "]";
	}
}

public class UsersEx2 {

	public static void main(String[] args) {
		// 3명의 회원(Users)을 생성자로 저장 후 출력
//		Users user = new Users; // 한명
		Users[] user = new Users[3]; // 여러명
		
//		List<> list = new ArrayList<>(); // list 

		// 3명 -> 초기화 3번
		
//		user[0] = new Users("a", "b", 10);
//		user[1] = new Users("1", "2", 22);
//		user[2] = new Users("4", "3", 55);
		
		// n명을 for 로 n번 초기화
//		for (int i = 0; i < user.length; i++) {
//			user[i] = new Users("아이디" + i, "비번" + i, 0 + i);
//			System.out.println(user[i].toString());
//		}
		
		System.out.println("--------------------------------");
		
		for(int i = 0; i < user.length; i++) {
			
			user[i] = new Users(); // 초기화
			
			// set 이용해서 저장
			user[i].setUserid("busan");
			user[i].setUserpw("1234");
			user[i].setAge(10);
			
			System.out.println(user[i].toString());
		}
	}

}
