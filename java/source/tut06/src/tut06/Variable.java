package tut06;

public class Variable {

	public static void main(String[] args) {
		// 변수 : 값을 메모리에 저장하는 동작
		// 저장할 값의 타입 변수명 = 초기값;
		// 저장할 값의 타입 변수명;
		// 변수명 = 초기값;
		// 기본형 타입 : 소문자로 시작
		// int(정수 - 4byte), double(실수 - 8byte)
		// boolean(논리형 - 1byte) : true, false만 가능
		
		// 정수 100을 저장하는 변수를 생성하세요.
		int i; // 메모리에 4byte 정수를 저장할 수 있는 공간
		i = 100; // 메모리에 처음(초기화)
		
		int i2 = 100;
		
		int j, k, a;
		j = 100;
		k = 200;
		a = 500;
		
		// 실수 : float(실수 - 4byte), double(실수 - 8byte)
		// 0.1, 0.2를 저장하는 변수 생성
		float f = 0.1F;
		double d = 0.2;
		
		// 10000000000을 변수에 저장하세요.
		// long(정수 - 8byte) 큰 수 저장할 때 사용합니다.
		// 접미사 L 붙여주기
		long l = 10000000000L;
		
		// 논리형 true, false(0)
		
		boolean b = false;
		
		// 문자(char) => ''사용
		// 대문자 A 값을 저장하세요.
		char c = 'A';
		String str = "A";
		
		// 참조형 타입 : 대문자로 시작(단, 고정배열은 소문자로 시작)
		// Integer(정수형객체), Double(실수형 객체), 객체, 배열...
		// 100 -> 객체형 정수
		
		// 저장할 객체타입 변수명 = new 저장할 객체타입();
		// 100 -> 객체형 정수에 저장하세요.
		Integer num = new Integer(100);
		
		// 문자열 저장 코리아 -> 객체
		String str2 = new String("코리아");
		
		// 0.1을 객체로 저장하세요.
		Double d2 = new Double(0.1);
		
		// 학생 점수(정수) 10개 저장하세요. => 배열
		int[] scores = new int[10];
		
		
		
	}

}
