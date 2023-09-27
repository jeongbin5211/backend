package inheritance;

class Add {
	String title = "계산기 프로그램";
	
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 정수 + 정수 = 정수
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
}

class DeskTop extends Add { // extends는 하나만 상속가능
	
	void Os() {
		System.out.println("Windows Ver 11...");
	}
}

class Laptop extends Add {
	
	void Os() {
		System.out.println("IOS Ver 16");
	}
}

public class InherEx01 {

	public static void main(String[] args) {
		// 객체 => 상속 => 프로그램 확장(회원가입 -> 게시판 -> 다중게시판 -> 일정관리... 확장)
		// C++ -> 다중상속 -> 상속(자바) : 강제x -> 인터페이스(다중) : 강제성
		// 					강제성 abstract
		//					extends				implements
		
		DeskTop d = new DeskTop();
		System.out.println("데스크탑 컴퓨터");
		System.out.println(d.title);
		d.title = "데스크탑";
		System.out.println(d.title );
		d.turnOn();
		d.Os();
		System.out.println(d.add(100, 200));
		d.turnOff();
		
		System.out.println("-----------------------------");
		
		Laptop l = new Laptop();
		System.out.println("랩탑");
		l.turnOn();
		l.Os();
		System.out.println(l.title);
		System.out.println(l.add(400, 400));
		l.turnOff();
		
	}

}
