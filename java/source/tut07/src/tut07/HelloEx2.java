package tut07;

public class HelloEx2 {

	// 메소드는 메인메소드 밖에 만들기
	// 접근제한자 리턴타입 메소드명() {
	//
	// }
	
	private void title(String local) {
		// System.out.println("코리아아이티 아카데미");
		// System.out.println("Koreait 아카데미");
		
		// 지역만 바꾸고 싶을때 
		// ()안에 원하는 타입 + 매개변수명 ex) (String str)
		
		// 부산 코리아아이티 아카데미
		// 서울 코리아아이티 아카데미
		// 광주 코리아아이티 아카데미
		
		System.out.println(local + "코리아아이티 아카데미" );
	}
	
	public void info(String tel, String addr) {
		System.out.println("전화번호 : " + tel);
		System.out.println("주소 : " + addr);
		// 이메일 추가하고싶을때
//		System.out.println("이메일 : ");
	}
	
	public static void main(String[] args) {
		// 코리아아이티 아카데미 : sysout 으로 출력할 예정 -> 메소드의 리턴타입을 void로 해야함
		// 전화번호, 주소 -> 중복이 아니기 때문에 굳이 메소드로 만들필요없음
		// 코리아아이티 아카데미 : sysout 으로 출력할 예정 -> 메소드의 리턴타입을 void로 해야함
		
		// HelloEx2 전체를 가져온다.
//		HelloEx2 he = new HelloEx2();
//		
//		he.title();
//		
//		System.out.println("전화번호 : 051 - 1234-56789");
//		System.out.println("주소 : 부산광역시");
//		
//		he.title();
//		
//		System.out.println("---------------------------------");
		
		HelloEx2 busan = new HelloEx2();
		
		busan.title("부산");
		
		System.out.println("---------------------------------");
		
		
		HelloEx2 seoul = new HelloEx2();
		
		seoul.title("서울");
		
		System.out.println("전화번호 : 02-1234-5678");
		System.out.println("주소 : 서울특별시");
		
		seoul.title("서울");
		
		System.out.println("---------------------------------");
		
		HelloEx2 gwangju = new HelloEx2();
		
		gwangju.title("광주");
		
		System.out.println("전화번호 : ");
		System.out.println("주소 : 광주광역시");
		
		gwangju.title("광주");
		
		System.out.println("---------------------------------");
		
		busan.title("부산");
		
		busan.info("051-1234-5678", "부산광역시");
		
		busan.title("부산");
		
		System.out.println("---------------------------------");
		
		seoul.title("서울");
		
		seoul.info("02-123-123312", "서울광역시");
		
		seoul.title("서울");
	}

}
