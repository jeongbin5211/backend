package tut0919;

public class CalEx3 {

	// 1. 스스로 해보기
	public int sum(int a, int b) {
		return a + b;
	}
	
	// 2. 강사님
	public boolean isPrint(int a, int b) {
//		int sum = a + b;
//		boolean result = false;
//		
//		if (sum > 200) {
//			result = true;
//		}else {
//			result = false;
//		}
//		
//		return result;
		
		// 3. 리팩토링
//		boolean result = false;
//		
//		if (a + b > 200)
//			result = true;
//		else 
//			result = false;
//		
//		return result;
		
		// 4. 삼항연산자
//		boolean result = (a + b) > 200 ? true : false;
//		
//		return result;
		
		// 5. 삼항연산자 리팩토링
		return (a + b) > 200 ? true : false;
		
	}
	
	public static void main(String[] args) {
		// 100 + 100의 결과가 200보다 크면 true를 출력하세요.
		
		CalEx3 cal3 = new CalEx3();
		
		// 1. 스스로 해보기
//		if(cal3.sum(100, 100) > 200) {
//			System.out.println(true);
//		}
		
		// 2. 강사님 코드
		
		cal3.isPrint(100, 100);
		System.out.println(cal3.isPrint(100, 100)); // false
		System.out.println(cal3.isPrint(100, 200)); // true
	}

}
