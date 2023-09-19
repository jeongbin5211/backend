package tut0919;

//class Login {
//	String userid;
//	String passwd;
//	int age;
//}

//2. Login 클래스 따로 만들어서 관리

public class LoginEx2 {

	public static void main(String[] args) {
		Login web = new Login();
		
		web.userid = "aaa";
		web.passwd = "1234";
		web.age = 10;
		System.out.println("아이디는 " + web.userid + " 입니다.");
		System.out.println("비밀번호는 " + web.passwd + " 입니다.");
		System.out.println("나이는 " + web.age + "입니다.");
		
		System.out.println("--------------------");
		
		Login grp = new Login();
		
		grp.userid = "bbb";
		grp.passwd = "7777";
		grp.age = -10;
		
		// \n
		// \t
		
		System.out.println("아이디는 " + grp.userid + " 입니다.\n비밀번호는 " + grp.passwd + " 입니다.\n나이는 " + grp.age + " 입니다.");
				

	}

}
