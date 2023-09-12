package tut03;

public class StringEx2 {

	public static void main(String[] args) {
		// 이메일 형식이 맞는지 체크하는 charAt("찾을값의 인덱스")
		String email = "mail@mail.com";
		System.out.println(email.length()); // 13;
		
		// . => ~안에 라는 의미
//		System.out.println(email.charAt(4)); // @;
		if (email.charAt(5) == '@') {
			System.out.println("사용하셔도 되는 이메일 주소입니다.");
		}else {
			System.out.println("사용할 수 없는 이메일 주소입니다.\n다시 입력해주세요.");
		}
		
		System.out.println("---------------------------");
		
		String str = "korea it academy";
		System.out.println(str.length()); // 16
		
		System.out.println(str.replaceAll("it", "IT")); // korea IT academy
		
		System.out.println("------------------------");
		
		// 주민번호를 이용해서 1이면 남자, 2면 여자로 화면에 표시하세요.
		String jumin = "001231-1234567";
		
//		변수명.substring(시작인덱스, 찾을값의 인덱스 + 1)
		System.out.println(jumin.length()); // 14
		System.out.println(jumin.substring(7)); // 1234567; 7번 인덱스부터 다 추출함
		System.out.println(jumin.substring(7, 8)); // 1

		int gender = Integer.parseInt(jumin.substring(7, 8));
		
		if(gender % 2 == 1)
			System.out.println("남자입니다.");
		else
			System.out.println("여자입니다. ");
	}

}
