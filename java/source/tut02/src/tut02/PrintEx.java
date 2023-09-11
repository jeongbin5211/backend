/* 

*/

package tut02;

public class PrintEx {

	public static void main(String[] args) {
		// 정수 5와 8의 합을 출력하시오.
		// 변수 선언, 초기화 / 선언과 초기화를 동시에 하는 방법
		
//		첫번째 방법
//		int num1, num2, sum; // 선언
//		num1 = 5; // 초기화
//		num2 = 8; // 초기화
//		sum = num1 + num2;
		
//		두번째 방법
//		변수 이름의 첫글자는 소문자로 입력
		int num1 = 5;
		int num2 = 8;
		
		System.out.println(num1 + num2);
			
		// 결과값을 변수에 저장 후 출력
		// 정수 + 정수 = 정수, 정수 + 실수 = 실수;
		int sum = num1 + num2;
		
		// System.in (스캐너)
		System.out.println(sum);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		// byte(1) -> int(4) -> float(4) -> double(8)
		// 0, 1 => 1byte = 8bit => 2^8 = 256 / 2 = 128
		// byte = 음수(-128), 0, 양수(+127)
		// byte b = -129;
		// byte : 메시지 전송, 이미지 처리
		
		// 사람이 읽는 수는 10진수
		
		// 16진수 (2진수로 표현하면 너무 길기때문에 사용)
		// 0 ~ 15 : 0 ~ 9, a, b, c, d, e, f
		// 색상코드 = 16진수
		// 메모리 주소에 x 는 hexa를 의미하고 16진수라는 뜻
		// #ff00ae : 0000 0000 0000 000
		
		// 메모리 주소 0 = oct = 8진수
		
		System.out.println("-------------------------");
		
		// int 10억 넘어가면 오류발생(범위초과)
		// long : 접미사 L 붙여줘야함 (소, 대문자 무관함)
		
		long money = 100000000000L;
		
		// float 7, double 15자리
		// float : 접미사 F 붙여주기
		
		// PI는 값이 정해져 있는(고정되어 있는) 값 = 상수이므로 변수이름을 대문자로 작성
		double PI = 3.12345678;
		float PI2 = 3.123456789F;
		System.out.println(PI2);
		
		final double ITEM_POINT = 0.1;
		// 고정된값은 final 접두사를 붙이기도 하고, 이름은 대문자로 작성, 단어와 단어사이는 _로 연결시킴 
		
		
	}

}
