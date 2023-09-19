package tut0919;

public class CalEx2 {
	
	public String disp2() {
		return "코리아아이티 계산기";
	}
	
	// 3. 두 개의 정수를 더하는 메소드 만들기
	
	// 첫번째 방법
//	public int add(int a, int b) {
//		return a + b;
//	}
	
	// 두번째 방법 
	// 불필요한 메모리 생성하기 때문에 첫번째 방법을 쓰자
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	// 5. a + b + c
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	// 6. 메소드 오버로딩
	// 매개변수 개수가 다르거나 타입을 다르게 사용할 때는 같은 이름을 써도 가능
	// 매개변수가 다른 예시
	public int sum(int a, int b) {
		return a + b;
	}
	
	// 7. 메소드 오버로딩2
	// 매개변수의 개수는 같지만 타입이 다른 예시
	public double sum(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// 코리아아이티 계산기
		// 정수 1 + 정수2 = 결과를 출력하는 프로그램
		// 프로그램종료

		// 보내줄 때 값, 처리할 때 타입 변수
		// 배열은 보내줄 때는 생성자, 처리할 때는 타입[]변수
		
		CalEx2 cal = new CalEx2();
		cal.disp2();
		System.out.println(cal.disp2());
		
		// 2. 정수1 + 정수2 = 결과
		
		cal.add(100, 200);	
		System.out.println(cal.add(100, 200)); // 300
		
		
		// 4. 100, 200, 300 더하기 = 600 -> 메소드 만들기
		cal.sum(100, 200, 300);
		System.out.println(cal.sum(100, 200, 300)); // 600
		
		
	}

}
