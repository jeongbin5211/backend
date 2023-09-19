package tut0919;

public class CalEx {

	// 2.
	
	// 매개변수 설정은 자유
	
//	접근제한 리턴타입 메소드명(매개변수) {
//		
//	}
	
	public void disp(String local) {
//		System.out.println("코리아아이티 계산기");
		// 계산기를 영어로 바꾸기, 지점이름 붙히기
//		System.out.println("부산 코리아아이티 Calculator");
		
		// 5. 매개변수 설정하기
		System.out.println(local + " 코리아아이티 Calculator");
		
		
	}
	
	// 3.
	
	public void close() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public static void main(String[] args) {
	
		// 1.
		
		// 재사용 가능성을 항상 고려해야 합니다.
		// 반복 사용 -> 메소드 사용
		
		// 코리아아이티 계산기
		// 정수 1 + 정수2 = 결과를 출력하는 프로그램
		// 프로그램종료
		
		// 4.
		
		CalEx c = new CalEx();
//		c.disp();
//		c.close();
		
		// 5.
		System.out.println("-------------------------");
		
		c.disp("서울");
		c.close();
	}

}
