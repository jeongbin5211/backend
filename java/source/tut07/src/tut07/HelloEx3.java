package tut07;

public class HelloEx3 {

//	접근제한 리턴 메소드(매개변수) { // 이것만으로 화면 출력 안됨
//		return 값;
//	}
	
	public String title(String local) {
		return local + " 코리아아이티 아카데미";
	}
	
	public static void main(String[] args) {
		
		// 코리아아이티 아카데미
		// 전화번호, 주소
		// 코리아아이티 아카데미
		
		HelloEx3 he = new HelloEx3(); // 클래스안에 메소드를 가져오기위해 작성
		// he.title(); // 출력안됨
		
		// 출력하려면
		System.out.println(he.title("부산"));
		
		// 서울로 변경
		System.out.println(he.title("서울"));
		
		// 광주로 변경
		System.out.println(he.title("광주"));

	}

}
