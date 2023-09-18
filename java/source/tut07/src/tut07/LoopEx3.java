package tut07;

public class LoopEx3 {

	public static void main(String[] args) {
		// 1 ~ 100까지 합을 구하세요.
		// while
		// 출력 예시 : 1 ~ 100까지 합은 ~입니다.
		
		int sum = 0;
		int i = 1;
		while (i < 101) {
			sum += i;
//			System.out.println(sum);
			i++;
		}
		System.out.println("1 ~ 100 까지의 합은 " + sum + "입니다.");
		// 출력예시 : 5050입니다.
		// 출력예시 : 값은 5050
		
		System.out.println("출력예시 : " + sum + "입니다.");
		System.out.println("출력예시 : 값은 " + sum );

	}

}
