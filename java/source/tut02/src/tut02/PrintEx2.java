package tut02;

public class PrintEx2 {

	public static void main(String[] args) {
		// char : 문자, '', 2byte, ASCII표현시 주로 사용, 숫자로 형변환 가능(타입 캐스팅)
		
		char c = 'k';
		System.out.println(c);
		System.out.println((int)c); // 107
		System.out.println((char)97); // a
		
		
		
		// boolean : true, false(따옴표 사용하면 안됨)'
		boolean b = false;
		
		// true면 통과, false면 실패
		// if와 사용
		// 문자열은 값이 같다는 equals(), 그외에는 ==
		
		if (b == true)
			System.out.println("pass");
		else
			System.out.println("fail");
		
		
		System.out.println("--------------------");

		boolean run = true;
		
		if (!run) // !
			System.out.println("fail");
		else
			System.out.println("pass");

		// (조건) ? "참일 때" : "거짓일 때";
		
		char grade = (!run) ? 'A' : 'F';
		System.out.println(grade);
	}

}
