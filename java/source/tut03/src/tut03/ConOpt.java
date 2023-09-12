package tut03;

public class ConOpt {

	public static void main(String[] args) {
		// 삼항연산자
		// 정수 두 개를 비교하여 크면 1, 작으면 0을 출력하세요.
		
		int num1 = 10;
		int num2 = 5;
		
		int result = (num1 > num2) ? 1 : 0;
		System.out.println(result); // 1
		
		// 임의의 정수를 생성 후 나머지가 1이면 홀수, 0이면 짝수를 출력하세요.
		
		// 1. 삼항연산자 이용
		int num3 = 13;
		String result2 = (num3 % 2 == 1) ? "Odd" : "Even";
		System.out.println(result2); // Odd
		
		// 2. if문 사용
		if (num3 % 2 == 1)
			System.out.println("Odd");
		else
			System.out.println("Even");
		
		// 3. if문 사용 2
		String msg = "";
		if(num3 % 2 == 1) {
			msg = "홀수";
		}else {
			msg = "짝수";
		}
		System.out.println(msg);
	}

}
