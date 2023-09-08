package tut01;

public class IntEx {

	public static void main(String[] args) {
		// 데이터타입 변수명 = 값;
		// 1. 타입을 선언하고 나이 20을 대입한 후
		// 2. 20보다 이상이면 성인, 아니면 미성년으로 표시하시오.
		
		// 부등호 사용시 < > 부터 적고 등호적기  <=, >=
		
		int age = 20;
		
//		if (조건) {
//			결과(출력)
//		}
		
		// 출력이 한 줄 일때만 중괄호는 생략가능
		if (age >= 20) 
			System.out.println("성인");
		else 
			System.out.println("미성년");
		
		// 삼항 연산자
		// 조건 ? "참일때" : "거짓일때";
		
//		String result = (age >= 20) ? "성인" : "미성년";
//		System.out.println(result);

	}

}
