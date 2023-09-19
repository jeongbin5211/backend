package tut0919;

public class LoginEx3 {

	public static void main(String[] args) {
		
		Login3 person = new Login3();
		
		// 생성자 실행하는 순간에 필드에 있는 시간이 들어감
		person.setUsermail("email@email.com");
		person.setUserpw("12345");
		
		System.out.println("---Getter 출력---");
		
		System.out.println(person.getUsermail());
		System.out.println(person.getUserpw());
		System.out.println(person.getNow());
		
		System.out.println("---메소드 출력---");
		System.out.println(person.toString());

	}

}
