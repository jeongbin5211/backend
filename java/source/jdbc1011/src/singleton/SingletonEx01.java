package singleton;

class SingletonTest {
	
	// 생성자
//	public SingletonTest() {}
	
	
	private SingletonTest() {}
	
	private static SingletonTest st = new SingletonTest();
	
	public static SingletonTest getInstance() { // instance = 연결용도
		return st;
	}
	
	// 공유해서 사용할 메소드
	
}

public class SingletonEx01 {

	public static void main(String[] args) {
		// 생성자를 호출하면 호출하는 개수 객체
		
		// A
//		SingletonTest st1 = new SingletonTest();
		
		// B
//		SingletonTest st2 = new SingletonTest();
		
//		System.out.println(st1);
//		System.out.println(st2);
//		
//		System.out.println(st1 == st2); // 주소 비교
		
		SingletonTest st3 = SingletonTest.getInstance();
		SingletonTest st4 = SingletonTest.getInstance();
		
		System.out.println(st3 == st4); // true
		
	}

}
