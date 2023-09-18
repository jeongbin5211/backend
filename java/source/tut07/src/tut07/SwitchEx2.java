package tut07;

public class SwitchEx2 {

	public static void main(String[] args) {
		// 대, 소문자 값을 처리
		// char
		// A/a -> 골드회원, B/b -> 실버회원, C/c -> 일반회원, 그 외에는 게스트
		
		char grade = 'b';
		
		// 문자, 문자열, 정수 -> 비교연산자 사용불가능
		
		switch (grade) {
		case 'A' :
		case 'a' :
			System.out.println("골드회원입니다.");
			break;
			
		case 'B' :
		case 'b' :
			System.out.println("실버회원입니다.");
			break;
			
		case 'C' :
		case 'c' :
			System.out.println("일반회원입니다.");
			break;
			
		default :
			System.out.println("Guest입니다.");
			
		}
		
		

	}

}
