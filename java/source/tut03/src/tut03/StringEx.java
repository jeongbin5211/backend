package tut03;

public class StringEx {

	public static void main(String[] args) {
		// 기본타입 koreait 문자열 저장
		// 객체타입 koreait 문자열 저장
		// 둘을 비교하는 예제
		String str = "koreait"; // stack 메모리에 저장됨
		String str2 = new String("koreait"); // heap 메모리에 저장됨
		
		// .equals 로 비교
		
//		boolean result = str.equals(str2);
//		System.out.println(result); // true;
		
		if (str.equals(str2)) {
			System.out.println("저장 위치는 다르지만 값은 동일합니다.");
		}
		
		// == 로 비교 (메모리 주소값 비교)
		if (str == str2)
			System.out.println("저장위치가 같습니다.");
		else
			System.out.println("저장위치가 다릅니다.");
		
		boolean result2 = (str == str2);
		if (result2)
			System.out.println("메모리가 동일합니다.");
		else
			System.out.println("메모리 위치가 다릅니다.");

		//** 문자열을 제외하면 비교는 == 사용하면 된다.
		
		int num1 = 1;
		int num2 = 2;
		
//		num1.equals(num2) -> 잘못된 비교방법
		boolean result3 = (num1 == num2);
		
//		public boolean resultCheck() {
//			return (num1 == num2);
//		}
	}

}
