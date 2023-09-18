package tut07;

public class LoopEx2 {

	public static void main(String[] args) {
		// 값을 누적할 때 전역변수 처리 혹은 static메소드 사용
		// 1 ~ 100 더하기
		
//		for (int i = 1; i <= 100; i++) {
//			int sum = 0; // -> 지역변수라서 계속 0으로 초기화됨
//			sum += i;
//		}
//		System.out.println(sum); // -> sum은 지역변수라 for문 밖에서 사용불가능
		
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum); // 5050
		
		System.out.println("----------------------------------");
		
		// 1 ~ 100 사이 정수 중 홀수의 합 구하기

		sum = 0;
		
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum); // 2500
	}

}
