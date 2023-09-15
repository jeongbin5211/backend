package tut06;

public class LoopEx {

	public static void main(String[] args) {
		// for(초기값; 조건; 증감값;) {
		//	출력코드
		// }
		
		// 0부터 10 출력하는 반복문을 완성하세요.
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		
		System.out.println("----------------------------");
		
		// 1부터 20까지 출력하는 for
		for (int i = 1; i < 21; i++) {
			System.out.println(i);
		}
		
		// for 을 while로
		
		int i = 1;
		while (i < 21) {
			System.out.println(i);
			i++;
		}
		
		// 1. for 문 만 사용하기 
		// 0 ~ 10 까지 출력하는 for
		// 짝수만 출력하세요
		
		for (int i2 = 0; i2 < 11; i2 += 2) {
			System.out.print(i2 + " ");
		}
		
		System.out.println("");
		
		// 2. for + if문
		
		for (int j = 0; j < 11; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}
		
		System.out.println("----------------------------");
		
		// 3. continue 사용
		
		for (int j = 0; j < 11; j++) {
			if (j % 2 == 1) {
				continue;
			}
			System.out.println(j);
		}
		
		System.out.println("----------------------------");
		
		// 4. while로 변환
		
		int a = 0;
		while (a < 11) {
			
			a++;
			
			if (a % 2 == 1) {
				continue;
			}
			System.out.println(a);
		}

	}

}
