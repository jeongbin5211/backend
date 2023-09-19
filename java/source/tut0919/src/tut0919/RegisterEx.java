package tut0919;

class Register { // 필드 -> 생성자 -> getter, setter -> 메소드
	// 1. 필드
//	String userid;
//	String userpw;
//	int point;
	
	// 4. private
	// 캡슐화
	private String userid;
	private String userpw;
	private int point;
	
	// 2. 생성자
//	public Register() {} // default 생성자 (생략가능)
//	
//	public Register(String title) {
//		System.out.println(title);
//	}
	
	// 3.
//	public Register() {}
	
//	public Register(String uid, String upw, int p) {
//		// 필드 = 파라미터 // 파라미터 이름을 필드 이름과 똑같이 해야 안복잡함
//		userid = uid;
//		userpw = upw;
//		point = p;
	
//	public Register(String userid, String userpw, int point) {
//		// this.필드 = 파라미터
//		this.userid = userid;
//		this.userpw = userpw;
//		this.point = point;
//		
//	}
	
	// 4. private -> 같은 클래스(public) 내에 있을 시 접근 가능 
	
	
	public Register(String userid, String userpw, int point) {
		this.userid = userid;
		this.userpw = userpw;
		this.point = point;
	}
	
	
	public void disp() {
		System.out.println("아이디 : " + this.userid);
		System.out.println("비밀번호 : " + this.userpw);
		System.out.println("point : " + this.point);
	}
	

	// getter, setter
	
	
	// 메소드
}

public class RegisterEx {

	public static void main(String[] args) {
		
		// 회원가입 프로그램 : 객체 = 회원 1명 정보
		// 아이디(String), 비번(String), 포인트(int)를 저장하고 출력하는 프로그램
		
		// 1. 필드에 직접 값을 입력
		
//		Register person = new Register(); // 빈 생성자
		
//		person.userid = "koreait";
//		person.userpw = "12345";
//		person.point = 1000;
		
		// 2. 생성자 - public으로 시작하고 class이름과 같아야함
		
//		Register person = new Register("회원가입을 진행합니다.");
		
		// 3.
//		Register p1 = new Register("koreait", "12345", 1000);
		
		// 4. private
		Register p1 = new Register("korea", "1234", 1000);
//		p1.userid = "koreait"; // private때문에 값을 못넣음
		
		p1.disp();
		

	}

}
