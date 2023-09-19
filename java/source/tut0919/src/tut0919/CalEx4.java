package tut0919;

// 3. class 하나 더 만들기

class Cal {
	public boolean isCheck(int num) {
		return (num % 2 == 1) ? true : false;
	}
}

public class CalEx4 {

	// 1. 먼저 해보기
//	public boolean isOdd(int a) {
//		return (a % 2 == 1) ? true : false;
//	}
	
	// 2. 강사님
//	public boolean isCheck(int num) {
		
		// 첫번째 방법
		
//		boolean result = false;
//		
//		if (num % 2 == 1) 
//			result = true;
//		else 
//			result = false;
//		
//		
//		return result;
		
		// 두번째 방법
		
//		return (num % 2 == 1) ? true : false;
//	}
	
	public static void main(String[] args) {
		// 정수를 이용하여 홀수면 true, 짝수면 false를 출력하세요.
		
		// 1. 먼저해보기
//		CalEx4 cal4 = new CalEx4();
//		cal4.isOdd(5);
//		System.out.println(cal4.isOdd(5)); // true
		
		// 2. 강사님
		
//		CalEx4 c = new CalEx4();
//		System.out.println(c.isCheck(5));
		
		// 3. 다른 클래스에서 가져오기
		Cal c = new Cal();
		c.isCheck(4);
		
		System.out.println(c.isCheck(5)); // true
		
		// 4. Cal2.java 에서 객체 가져오기
		Cal2 c2 = new Cal2();
		
		System.out.println(c2.isEven(4)); // true
		
		

	}

}
