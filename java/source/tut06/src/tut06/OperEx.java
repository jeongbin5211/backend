package tut06;

public class OperEx {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		String s1 = "koreait";
		String s2 = "Koreait";
		
		// 비교
		System.out.println(num1 > num2); // true, false
		System.out.println(num1 == num2); // 
		System.out.println(s1.equals(s2)); // String equals 문자열 동등 비교
		System.out.println(!s1.equals(s2));
		
//		A = B (B를 A에 저장)
//		타입에 저장

		boolean b = (num1 == num2);
		
		// 조건문 : if
//		if (조건) {
//			출력코드
//		}else {
//			출력코드
//		}
		
		// 프로그래밍은 중복되거나 불필요한 내용은 줄이려고 합니다.
		
		if (b) // b == (b == true)
			System.out.println("두 수의 값은 같습니다.");
		else
			System.out.println("두 수의 값은 다릅니다.");
					
//		타입 변수 = (조건) ? "참일 때" : "거짓일 때";
		
		String result = (!b) ? "두 수는 다릅니다." : "두 수는 일치합니다.";
		System.out.println(result);
		
		// 정수 홀수, 짝수 구분하세요.
//		홀수,짝수 => 숫자 % 2 == 1 홀수
		
		int num3 = 3;
		// System.out.println(num3 % 2);
		
		if (num3 % 2 == 1)
			System.out.println("Odd");
		else
			System.out.println("Even");
		
		String result2 = (num3 % 2 == 1) ? "Odd" : "Even";
		System.out.println(result2);
		
		
				
		
	}

}
