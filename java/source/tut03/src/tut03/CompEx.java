package tut03;

public class CompEx {

	public static void main(String[] args) {
		// 결과는 true, false
		// 1. 크기비교 : >=, <=, >, <
		int num1 = 3;
		int num2 = 5;
		boolean result1 = (num1 >= num2);
		
		System.out.println(result1); // false
		
		
		// 2. 등가비교 : ==, !=
		boolean result2 = (num1 == num2);
		System.out.println(result2); // false
		
		boolean result3 = (num1 != num2);
		System.out.println(result3); // true
		
		// 3. 참조비교 : 메모리주소를 비교
		// new 키워드(자바에서 사용하는 문법)를 사용하면 다른 메모리에 저장 // ()가 없으니 키워드라고 읽음
		// 문자열 : 참조타입으로 생성
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		// 문자열 비교(equals) => 내용이 똑같은가
		boolean result4 = s1.equals(s2);
		System.out.println(result4); // true
		
		// 메모리 주소 비교( == )
		boolean result5 = (s1 == s2);
		System.out.println(result5); // false
		
	}

}
