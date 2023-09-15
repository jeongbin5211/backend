package tut06;

public class OperEx2 {

	public static void main(String[] args) {
		int std1 = 80;
		int std2 = 70;
		int avg = 75;
		// AND : 이고, 이면서
		// OR : 이거나, 또는
		// 학생1 점수가 평균 점수보다 높고 학생2 점수가 평균보다 높으면
		// 통과, 아니면 재평가
		
		
//		if(조건) {
//			출력코드(참)
//		}else {
//			출력코드(거짓)
//		}
		
		if (std1 >= avg && std2 >= avg) {
			System.out.println("pass");
		}else {
			System.out.println("재평가");
		}
		
		System.out.println("------------------------");
		
//		학생 점수가 90이상 100이하이면 최우수
//		80이상 89이하이면 우수
//		나머지는 보통으로 출력하세요.
		
		int score = 88;
		
		if (score > 100 || score < 0) {
			System.out.println("점수를 다시 입력하세요.");
		}else if (score >= 90 && score <= 100) {
			System.out.println("최우수");
		}else if (score >= 80 && score <= 89) {
			System.out.println("우수");
		}else {
			System.out.println("보통");
		}
		
		System.out.println("");
		
		// 가입한 회원정보의 이메일과 비밀번호를 비교하여
		// 모두 일치하면 로그인 되었습니다.
		// 아니면 로그인 정보가 일치하지 않습니다.
		// 가입된 정보는 db 이메일, 비번
		// 로그인 할 때 입력하는 이메일, 비번
		
		String db_useremail = "email@email.com";
		String db_userpw = "12345";
		
		String useremail = "email@email.com";
		String userpw = "12345";
		
		boolean id_check = db_useremail.equals(useremail);
		boolean pw_check = db_userpw.equals(userpw);
		
		if (id_check && pw_check) 
			System.out.println("로그인 되었습니다.");
		else {
			System.out.println("로그인 정보가 일치하지 않습니다.\n로그인 페이지로 이동합니다.");
		}
		
		System.out.println(true && true);	// true
		System.out.println(true && false);	// false
		System.out.println(false && false);	// false
		
		System.out.println("");
		
		System.out.println(true || true);	// true
		System.out.println(true || false);	// true
		System.out.println(false || false);	// false
		
		System.out.println("");
		
		boolean result1 = true && true;
		System.out.println(!result1);
		
		if (result1) {
			System.out.println("위 결과는 참입니다.");
		}
		
		boolean result2 = true && false;
		System.out.println(result2);
		
		if (result2) {
			System.out.println("위 결과는 참입니다.");
		} // result2 가 거짓이기 때문에 아무것도 출력안됨
		
		boolean result3 = false && false;
		System.out.println(result3);
	}

}
