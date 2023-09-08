package tut01;

public class BooleanEx {

	public static void main(String[] args) {
		// 컴퓨터는 0, 1 만 읽는다 => false는 0, true는 0을 제외한 양수
		
		// 기본타입의 초기값 설정(임의 값을 무조건 넣어줘야함)
		// ex) int i = 0; double d = 0.0; boolean b = false; String str = "";
		
		boolean b = false;
		
		// 참이면 통과, 아니면 재평가
		// equals() : String 값
		// 그 외 같은 걸 비교할 때는 ==
//		if (b == true)		
//		if (b) 
//			System.out.println("통과");
//		else 
//			System.out.println("재평가");
		
//		삼항연산자로 변환하기
//		조건 ? "참일 때" : "거짓일 때";
		
		String str = (b) ? "통과" : "재평가";
		System.out.println(str);
		
//		조건이 참이면 1 아니면 0을 출력하세요.
		int i = (b) ? 1 : 0;
		System.out.println(i);
		
		
//		조건이 참이면 1.0 아니면 0.0을 출력하세요.
		double d = (b) ? 1.0 : 0.0;
		System.out.println(d);
		
//		조건이 참이면 true 아니면 false를 출력하세요.
		
		boolean b2 = (b) ? true : false;
		System.out.println(b2);
	}

//		int i = 1;
//		boolean b = (i < 10);
//		System.out.println(b); => false;
	

}
