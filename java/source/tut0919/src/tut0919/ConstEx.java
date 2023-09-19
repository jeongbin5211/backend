package tut0919;

class Const {
	// default 생성자 생략 가능, 그 외 생성자는 만들어서 사용해야 합니다.
//	public Const() {
//		
//	}
//	
//	public Const(String str) { // 오버로딩 때문에 오류 사라짐
//		System.out.println(str);
//		
//	}
//	
//	public Const(String title, String domain) {
//		System.out.println(title + ", " + domain);
//	}
	
	// 2번에서 사용할 메소드
	public Const(String str) {
		System.out.println(str);
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public String close(String str) {
		return str;
//		return null; // 객체 타입도 가능
	}
	
	// 3번에서 사용
	public Const(String str, String tel) { // 생성자 오버로딩
//		System.out.println(str);
//		System.out.println(tel);
		
		// sysout 줄이기
		this(str); // 바로 전에 만들어둔 생성자에서 가져옴
		System.out.println(tel);
	}
	
	// 4번에서 사용
	public Const(String str, String tel, String addr) { // 생성자 오버로딩
//		System.out.println(str);
//		System.out.println(tel);
//		System.out.println(addr);
		
		// sysout 줄이기
		this(str, tel);
		System.out.println(addr);
		
		
	}
}

public class ConstEx {

	public static void main(String[] args) {
//		Const c = new Const();
//		
//		// 초기값 : 프로그램 시작시 코리아아이티 출력 -> 작업
//		Const c2 = new Const("코리아아이티");
//		
//		// 추가적인 작업을 할 때
//		// 코리아아이티, 도메인 출력
//		Const c3 = new Const("코리아아이티", "koreait.com");
		
		
		
		// 2.
		// 코리아아이티 계산기 Ver1.0 출력
		// 정수 + 정수 = 정수 메소드
		// 프로그램 종료 = 메소드
//		Const c4 = new Const("코리아아이티 계산기 Ver1.0");
		
		Const cal = new Const("코리아아이티 계산기 Ver1.0");
		cal.add(100, 200);
		cal.close("프로그램 종료");
		
		System.out.println(cal.add(100, 200));
		System.out.println(cal.close("프로그램 종료"));
		
		System.out.println("---------------------------");
		
		// 3. 코리아아이티, 전화번호 추가
		Const seoul = new Const("코리아아이티 계산기 Ver1.0", "tel : 051-1234-5678");
		
		System.out.println("---------------------------");
		
		// 4. 코리아아이티, 전화번호, 주소 추가
		Const gwangju = new Const("코리아아이티 계산기 Ver1.0", "tel : 051-1234-5678", "광주");

	}

}
