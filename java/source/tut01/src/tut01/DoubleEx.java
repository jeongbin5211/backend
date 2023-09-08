package tut01;

public class DoubleEx {

	public static void main(String[] args) { // 단축키 main
		// 실수를 저장하는 변수 -> 값을 지정하지 않았을 때
		// 값을 1.0으로 바꿀 때
		
//		double d = 0.0;
//		System.out.println(d);
		
		// 변수 선언은 기본적으로 overwrite(덮어쓰기)
//		d = 1.0;
//		System.out.println(d);
		
//		d2라는 변수 하나를 추가하는데 값은 2.0이고 d와 d2 두값을 더하기
//		double d2 = 2.0;
//		System.out.println(d + d2);
		
		double d, d2;
		d = 1.654354;
		d2 = 2.867646;
		
		//쇼핑몰 -. 1.2 + 2.2 = 3.4 => 3 소수점 없애고 싶을 때
		// 실수 -> 정수로 타입 변환 : 형변환 = (바꿀 타입)변수명
		
		// 순수한 숫자를 제외하면 + 연산자는 앞뒤를 연결할 때 사용합니다.
		System.out.println("합계" + ":" + " " + (int)(d + d2) + "달러");
		// 연산자 우선순위
		// 특별히 지정하지 않으면 가까운 쪽 먼저 처리
		// () 소괄호가 우선순위가 가장 높음
		
		
//		% : 몫이 아니고 나머지를 의미
		System.out.println( 3 % 2 ); // 1
		System.out.println( 3 % 4 ); // 3
		
//		0012345-1234567 주민번호의 8번째 숫자를 이용하여 남자 여자를 표시하세요.
//		단, %, if 사용해서 표시하시오.

//		1이면 남자 2이면 여자로 표시하세요.
		int jumin = 2;
		
//		if (jumin % 2 == 1) {
//			System.out.println("남자");
//		}else {
//			System.out.println("여자");
//		}
		
//		(조건) ? "참일 때" : "거짓일 때";
		String result = (jumin % 2 == 1) ? "남자" : "여자";
		System.out.println(result);
		
		
	}

}










