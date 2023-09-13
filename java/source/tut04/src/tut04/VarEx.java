package tut04;

public class VarEx {

	public static void main(String[] args) {
		// 정수(decimal) -> printf()
		int num = 100;
		
		// 정수 값은 100입니다.
		System.out.println("정수 값은 " + num + "입니다.");
		
		System.out.printf("정수 값은 %d입니다.", num); // printf -> 형식을 지정해서 만들게요
		
		System.out.println(String.format("\n정수 값은 %d입니다.", num)); // 위 두개를 합쳐서 사용하는법
		
		// Koreait 아카데미입니다. 출력하기
		String str = "Koreait";
		System.out.println( String.format("%s 아카데미입니다.", str)); // %s 사용
	}

}
