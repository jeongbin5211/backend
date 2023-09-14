package tut05;

public class LoopEx2 {

	public static void main(String[] args) {
		// 0 ~ 10 중 짝수만 출력하세요. 증감연산자
		for (int i = 2; i <11; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		System.out.println("------------------------");
		
		// 0 ~ 10 중 홀수만 출력하세요. for if, break
		// 변수 % 2 == 0 -> 짝수
		// break : 가장 가까운 '반복문'을 벗어나는 키워드
		// continue : 해당하는 '반복문'의 조건을 건너 뛰는 것
		
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		System.out.println("------------------------");
		
		// 0 ~ 100 까지 출력하는 반복문을 작성하되
		// 0 ~ 20 까지만 출력하세요. for
		
		for (int i = 0; i <= 100; ++i) {
			if (i > 20) break;
			
			System.out.println(i);
		}
		
		
		
	}

}
