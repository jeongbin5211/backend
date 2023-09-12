package tut03;

public class StringEx3 {

	public static void main(String[] args) {
		
		// 같은 타입을 이름 하나로 많은 데이터를 다루기 위해 필요 - 배열[] + for
		// 다른 타입을 다루기 위해서는 객체를 사용합니다. - for 사용
		
		// 소문자 -> 대문자로 바꾸기
		// toUpperCase();
		String title = "korea it academy";
//		"korea it academy".toUpperCase(); -> 하드코딩, 좋지않은 방법
		
		System.out.println(title.toUpperCase()); // KOREA IT ACADEMY
		
		System.out.println("--------------------------");
		
		String menus = "Home,Company,Contact,Help"; // 구분자는 : , ; 중 원하는걸로 사용가능합니다.
		
//		System.out.println(menus.split(",")); // 메모리 주소가 출력됨 -> [Ljava.lang.String;@6e8dacdf
		
		String[] s = menus.split(",");
		System.out.println(s[0]); // Home
		System.out.println(s[1]); // Company
		System.out.println(s[2]); // Contact
		
//		for (데이터타입 별명 : 배열이름) {
//			출력코드
//		}
		
		for (String result : s) {
			System.out.println(result);
		}
		
//		for (int i = 0; i < 배열명.length; i++) {
//			출력코드
//		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		// for문을 사용하는 이유는 배열이 추가될때 관리가 용이하기 때문이다.
		// 그냥 하려면 하나하나 출력해야함
		
		System.out.println(s.length); // 4
		
		System.out.println("--------------------------");
		
		// 정수 생성 후 초기값은 100
		// 출력 : 생성된 변수의 초기값은 100입니다.
		int num = 100;
		System.out.println("생성된 변수의 초기값은 " + num + " 입니다.");
		
		// %d -> decimal: 10진수
		System.out.printf("생성된 변수의 초기값은 %d 입니다.", num);
		
		// %s -> string
		String str = "부산";
		
		System.out.println();
		System.out.printf("내가 사는 곳은 %s입니다.", str);
		
		// 2진수 -> binary => 01010101
		// 8진수 -> Oct => 01 010 101
		// 16진수 -> hex => 0101 0101 -> 0~9, a(10) b(11) c(12) d(13) e(14) f(15)
		// fff = 255 255 255;
		// 10진수 -> dec
	}

}
