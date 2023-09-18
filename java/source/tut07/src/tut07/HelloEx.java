package tut07;

public class HelloEx {
	
	// 메소드를 사용하는 이유는 유지보수가 용이하기 때문이다.

	// 매개변수는 있을 수도 있고 없을 수도 있다.
	// 접근제한자 public, private
	// public(아무나) private(나만 : 캡슐화)
		
	// sysout 사용시 void, sysout사용 안할 시(타입)
	// 접근제한자 리턴타입 메소드명(매개변수) {
	// 		return 변수명;
	// }
	
	public void disp(String title) {
//		System.out.println(title + "아카데미");
		
		// 만약 아카데미를 영어로 바꾸고 싶다
		System.out.println(title + "Academy");
	}
	
	
	
	public static void main(String[] args) {
		
		// System.out.println("코리아아이티 아카데미");
		
		// 다른 메소드를 가져다 쓰려면
		// 메소드가 있는 클래스명을 사용한다.
		// 클래스명 이름 = new 클래스명();
		
//		HelloEx he = new HelloEx();
//		he.disp();
//		he.disp();
//		he.disp();
//		he.disp();
		
		HelloEx he = new HelloEx();
		// 매개변수에서 보낼 때는 값이고 받을 때는 타입 변수로 받아야함
		he.disp("부산"); // 메소드를 동적으로 처리하기 위해서 (동적 : 값을 그때그때 다르게 처리)
		he.disp("서울"); 
		
		
		

	}

}
