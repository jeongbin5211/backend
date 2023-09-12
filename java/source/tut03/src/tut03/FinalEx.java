package tut03;

public class FinalEx {

	public static void main(String[] args) {
		// 아이디와 비밀번호가 모두 일치하면 "마이페이지로 이동합니다."
		// 일치하지 않으면 "회원정보를 확인하세요."
		// 회원가입 정보(아이디, 비번) = 로그인 정보(아이디, 비번)
		// database 값을 정하는 변수 이름은 단어와 단어가 이어질 때 _사용
		
		// 회원가입정보(db) : 저장
		String db_userid = "koreait";
		String db_passwd = "12345";
		int point = 1000;
		
		// 로그인정보 : 입력
		String userid = "koreait";
		String passwd = "12345";
		
		
		boolean result = db_userid.equals(userid) && db_passwd.equals(passwd);
		
		if (result) {
			point = point + 100;
			System.out.println(db_userid + " 회원님 안녕하세요. 마이페이지로 이동합니다.");
//			System.out.println(point += 100);
			System.out.println(point + " 점");
		}else {
			System.out.println("로그인 정보를 확인하세요.\n회원가입 페이지로 이동합니다.");
			System.out.println("보유한 포인트" + point + "점");
		}
		
		// 삼항연산자 사용
		
		String login = result ? db_userid + " 회원님 안녕하세요. 마이페이지로 이동합니다." : "로그인 정보를 확인하세요.\n회원가입 페이지로 이동합니다.";
		System.out.println(login);
	}

}
