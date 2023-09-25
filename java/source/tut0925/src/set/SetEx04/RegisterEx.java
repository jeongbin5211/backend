package set.SetEx04;

public class RegisterEx {

	public static void main(String[] args) {
		
		RegisterDao dao = new RegisterDao();
		
		dao.addRegister(new Register(1001, "홍길동", "1111"));
		dao.addRegister(new Register(2001, "김철수", "2222"));
		dao.addRegister(new Register(3001, "김나박", "3333"));
		
		
		dao.showInfo();
		
		System.out.println("--------------------");
		
//		boolean result = dao.removeRegister(1001);
//		if( result ) {
//			System.out.println("삭제되었습니다.");
//		}else {
//			System.out.println("존재하지 않는 아이디 입니다.");
//		}
//		
//		System.out.println(result); // true
		
		boolean result = dao.removeRegister(101);
		
		if(result)
			System.out.println("삭제 되었습니다.");
		else
			System.out.println("없는 회원번호입니다.");
		
		dao.showInfo();
	}

}
