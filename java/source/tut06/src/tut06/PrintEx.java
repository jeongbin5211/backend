package tut06;

public class PrintEx {

	public static void main(String[] args) {
		// 정수 10을 출력 : 10진수, 8진수, 16진수로 출력
						// d    o      x
		int num = 10;
		// 출력값은 10입니다.
		// System.out.printf(출력예시, 변수);
		System.out.printf("출력값은 %d입니다.\n", num);
		System.out.println(String.format("출력값은 %d입니다.", num));
		System.out.println("");
		
		// 10을 8진수로 표현한 값은 12입니다.
		System.out.printf("%d을 8진수로 출력한 값은 %o입니다.\n", num, num); 
		System.out.println(String.format("8진수 출력값은 %o입니다.", num)); // 12 => 십이(x), 일 이(0)
		System.out.println("");
		
		// 10을 16진수로 표현한 값은 12입니다.
		System.out.printf("10을 16진수로 표현한 값은 %x입니다.\n", num); // a
		System.out.println(String.format("10을 16진수로 표현한 값은 %x입니다.", num));
		System.out.println("");
		
		// 실수 출력
		double d = 1.2345; // 실수 -> %f
		System.out.printf("실수 값은 %f입니다.\n", d);
		
		// %(.x)f => 소수점 x자리만큼 출력할 때
		System.out.printf("실수 값은 %.2f입니다.\n", d);
		
		// 문자열 출력
		// 부산 코리아아이티 아카데미 입니다.
		String str = "Koreait";
		
		System.out.println(String.format("부산 %s 아카데미 입니다.", str));
		
		System.out.println("----------------------------------------");
		
		// 타입이 다른 연산 -> 형변환(캐스팅)
		// 메모리 공간이 적은 값을 큰 값에 넣으면 자동 형변환 - 묵시적 형변환 == 업캐스팅
		// 메모리 공간이 큰 값을 작은 값에 넣으면 강제 형변환 - 명시적 형변환 == 다운캐스팅
		
		// 정수 + 실수 = 실수
		int num1 = 5;
		double d2 = 0.5;
		
		double add = num1 + d2;
		System.out.println(add); // 5.5
		
		// 정수 + 실수 = 정수
		
		int num2 = 10;
		double d3 = 0.6;
		
		int add2 = num2 + (int)d3;
		System.out.println(add2); // 10
		
		
		
	}

}
