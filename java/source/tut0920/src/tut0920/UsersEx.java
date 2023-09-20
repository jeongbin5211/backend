package tut0920;

//class Users { // 객체 구성 요소 -> 필드, 생성자, getter,setter, 메소드
//	// 필드
//	String userid;
//	String userpw;
//	int age;
//	
//	// 생성자 : 객체 초기화 -> public으로 시작하며 class이름과 동일해야 하고 리턴값x;
//	
//	// 기본생성자
//	public Users() {
//		
//	}
//	
//	public Users(String userid) {
//		this.userid = userid;
//	}
//	
//	public Users(String userid, String userpw) {
//		this.userid = userid;
//		this.userpw = userpw;
//	}
//	
//	public Users(String userid, String userpw, int age) {
//		this(userid, userpw);
//		this.age = age;
//	}
//	
//	// getter, setter
//
//	public String getUserid() {
//		return userid;
//	}
//
//	public void setUserid(String userid) {
//		this.userid = userid;
//	}
//
//	public String getUserpw() {
//		return userpw;
//	}
//
//	public void setUserpw(String userpw) {
//		this.userpw = userpw;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	// 메소드
//	@Override
//	public String toString() {
//		return "Users [userid=" + userid + ", userpw=" + userpw + ", age=" + age + "]";
//	}
//	
//}

public class UsersEx {

	public static void main(String[] args) {
		// 회원가입 1명을 배열로 처리하세요.
		// 생성자를 이용해서 저장
		// getter, setter
		
//		String[] userid = new String[1];
//		String[] userpw = new String[2];
		
//		Users[] user = new Users[1]; // 회원 한명만 저장하는 배열(아이디, 비밀번호, 나이)
//		System.out.println(user.length);
		
		// 필드에 직접 저장
//		user[0].userid = "aaa"; 
//		user[0].userpw = "123";
//		user[0].age = 20;
		
		// 생성자를 이용해서 초기화(값 입력)
//		user[0] = new Users("아이디", "비밀번호", 10);
//		
//	    user[0].toString();
//	    System.out.println(user[0].toString());

	    
	    // 2개
//	 	Users[] user = new Users[2];
//	 		
//	 	user[0] = new Users("아이디1", "비번1", 10);
//	 	user[1] = new Users("아이디2", "비번2", 20);
//	 	
//	 	System.out.println(user[0].toString());
//	 	System.out.println(user[1].toString());
	 	
	 	// 3개
//		Users[] user = new Users[3];
////		user[0] = 초기화
//		user[0] = new Users();
//		user[1] = new Users();
//		user[2] = new Users();
//		
//		user[0].toString();
//		user[1].toString();
//		user[2].toString();
		
		// 여러개
//		Users[] user = new Users[3];
//		for (int i = 0; i < user.length; i++) {
//			user[i] = new Users();
//			user[i] = new Users("아이디");
//			user[i] = new Users("아이디", "비번");
//			user[i] = new Users("아이디", "비번", 10);
		
		// getter, setter
		
//		Users[] user = new Users[1];
//		
//		user[0] = new Users("saf");
//		
//		user[0].setUserid("setId");
//		
//		System.out.println(user[0].getUserid());
//		
//		}
		
	 	
	}

}
