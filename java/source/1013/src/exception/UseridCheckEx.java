package exception;

class UseridCheckException extends Exception {

	public UseridCheckException() {
		
	}

	public UseridCheckException(String message) {
		super(message);
	}
	
}

// 우리가 만들어 놓은 Exception을 체크하는 별도의 클래스로 동작을 만들어서 확인
class UseridCheck extends UseridCheckException  {
	
	// 메인에서 아이디를 전달 받아서 체크
	void useridCheck(String userid) throws UseridCheckException {
		if(userid.isEmpty()) {
			
			throw new UseridCheckException("아이디를 입력하세요.");
			
		}else if(userid.length() < 8) {
			
			throw new UseridCheckException("아이디 길이가 짧습니다.\n8이상 ~ 12이하로 입력하세요.");
			
		}else if(userid.length() > 12) {
			
			throw new UseridCheckException("아이디 길이가 깁니다.\n8이상 ~ 12이하로 입력하세요.");
			
		}else {
			System.out.println(userid + "사용가능");
		}
	}
	
}


public class UseridCheckEx {

	public static void main(String[] args) throws UseridCheckException {
		// 아이디 체크
		// 1. 빈 값 체크 : 아이디를 입력하세요
		// 2. 길이 짧은 경우 : 아이디가 너무 짧습니다. 8자리 이상 ~ 12 이하로 해주세요.
		// 3. 길이 긴 경우 : 아이디가 너무 깁니다. 8자리 이상 ~ 12 이하로 해주세요.
		// 4. 정상적인 경우 : 사용하셔도 됩니다.

		UseridCheck uc = new UseridCheck();
		
		uc.useridCheck("1234567123451");
		
	}

}
