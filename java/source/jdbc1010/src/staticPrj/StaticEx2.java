package staticPrj;

class Shop {
	
	static int number = 100; // static 붙이면 공유
	String userid;
	String userpw;
	
	// 아이디, 비번을 생성자에 입력하면 number가 자동으로 1씩 증가
	
	public Shop(String userid, String userpw) {
		this.userid = userid;
		this.userpw = userpw;
		++number;
	}

	@Override
	public String toString() {
		return "Shop [number=" + number + ", userid=" + userid + ", userpw=" + userpw + "]";
	}
	
	
	
}

class Login {
	static int point = 1000;
	String userid;
	String userpw;
	
	public Login(String userid, String userpw) {
		
		this.userid = userid;
		this.userpw = userpw;
//		point += 100;
		if(userid.equals("이지윤") && userpw.equals("0605")) {
			System.out.println("로그인 되었습니다.");
			point += 100;
		}else {
			System.out.println("다시 시도");
			point += 0;
		}
	}

	@Override
	public String toString() {
		return "Login [point=" + point + ", userid=" + userid + ", userpw=" + userpw + "]";
	}
	
	
	
}

public class StaticEx2 {

	public static void main(String[] args) {

		Shop shop = new Shop("홍길동", "1111");
		
		System.out.println(shop.toString());
		
		System.out.println("--------------------");
		
		Shop shop2 = new Shop("허길동", "2222");
		
		System.out.println(shop2.toString());
		
		System.out.println("--------------------");
		
		Login login = new Login("이지윤", "0605");
		
		System.out.println(login.toString());
		
		Login login2 = new Login("이지윤", "0605");
		
		System.out.println(login.toString());
		
	}

}
