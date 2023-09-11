package tut02;

public class ArithEx {

	public static void main(String[] args) {
		// / : 몫, % 나머지(나누어지지 않으면 값이 나머지)
		// 임의 정수 2개를 선언, 초기화 한 후 산술연산을 수행하세요.
		// 4, 5 초기값으로 설정
		int num1 = 4;
		int num2 = 5;
		
		// 합계는 9 입니다.
		System.out.println("합계 " + ": " + (num1 + num2));
		// syntax오류 = 특수기호 오류
		
		// 나머지는 4입니다.
		System.out.println("나머지는 " + (num1 % num2) + "입니다.");
		
		System.out.println("----------------------------");
		
		// 홀수 Odd, 짝수 Even
		// 객체지향언어에서 boolean 타입의 변수이름 : is~로 시작
		// 임의의 숫자를 변수에 저장 후 나머지가 1이면 홀수 2면 짝수로 출력하세요.
		
		int num = 7;
		
//		1. if문 사용
		if (num % 2 == 1)
			System.out.println("홀수");
		else
			System.out.println("짝수");
		
//		2. 삼항연산자 사용
		String result = (num % 2 == 1) ? "Odd" : "Even";
		System.out.println(result);
		
		System.out.println("----------------------------");
		
// 		3. boolean 타입 이용
//		System.out.println(num % 2 == 1); // true
		
		boolean isOdd = (num % 2 == 1);
		
		if (isOdd)
			System.out.println("홀수입니다.");
		else
			System.out.println("짝수입니다.");
		
		System.out.println("----------------------------");
		// 비교연산자
		// 철수와 전체 총점을 비교해서 출력하세요.
		
		int sum = 80;
		int std = 85;
		
//		System.out.println(std > sum); // true
		
		boolean isCheck = std > sum;
		
		// 철수가 촘점보다 큰지 작은지
		if (isCheck) {
			System.out.println("철수의 점수가 총점보다 큽니다.");
		}

	}

}
