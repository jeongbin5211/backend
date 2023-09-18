package tut07;

public class LoopBreakEx {

	public static void main(String[] args) {
		//break
		// 0 ~ 10까지 출력하세요
		// 단 조건은 7까지만 출력
		
		for (int i = 0; i <= 10; i++) {
			
			if (i > 7) {
				break; // i 가 7보다 크면 반복문 탈출
			}
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		
		// 1 ~ 20까지 홀수만 출력하기
		
		// 내가 적은 코드
		
		for (int odd = 1; odd < 21; odd++) {
			if (odd % 2 == 1) {
				System.out.println(odd);
			}
		}
		
		System.out.println("-------------------------");
		
		// 강사님 코드
		
		for (int odd = 1; odd < 21; odd++) {
			if (odd % 2 == 0) {
				continue;
			}
			System.out.println(odd);
		}
		
	}

}
