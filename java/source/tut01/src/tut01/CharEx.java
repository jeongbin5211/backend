package tut01;

public class CharEx {

	public static void main(String[] args) {
		// 데이터타입 변수명 = 값;
		char c = 'a'; // 한글자만 대입 가능
		String str = "b"; // 문자열 대입 가능
		int ch = 'a';	  // 아스키코드가 출력됨, 97
		int ch2 = 'C';
		
		System.out.println(c);
		System.out.println(str);
		System.out.println(ch + 1); // 98(아스키코드b)출력
		System.out.println( (char)(ch + 1)); // b
		System.out.println(ch2);
		
		System.out.println("------------");
		
		// 회원가입 했을 때 저장된 아이디, 비밀번호
		String userid = "koreait";
		String userpw = "12345";
		
		// 값이 같냐 다르냐 A.equals("B"); A와 B의 값이 같으면
		// 확인 => if -> 맞으면 로그인되었습니다. 틀리면 다시 로그인해주세요.
		
		// 내가 지금 입력한 아이디, 비밀번호
		String userid2 = "seoul";
		String userpw2 = "123414";
		
//		if(조건 // 회원 = 입력) {
//			조건이 맞으면 츨력
//		}
		
		if (!userid.equals(userid2)) { // userid userid2 가 같지 않으면
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("다시 로그인 해주세요.\n회원가입 해주세요."); // \n : 줄바꿈(개행)
		}
		
		
		System.out.println("---------------------------");
		
		
		
	}

}
