package tut07;

public class LoopEx {

	public static void main(String[] args) {
		
		// 임의 정수값이 0인데 0과 대소를 비교할 때
		
		for (int i = 0; i > 0; i++) 
			System.out.println(i); // 아무것도 출력안됨
		
			
		System.out.println("------------------------");
		
		int n = 0;
		while (n < 0) {
			System.out.println("출력확인"); // 아무것도 출력안됨
		}
		
		System.out.println("------------------------");
		
		int k = 0;
		
		do {
			System.out.println("조건이 틀려도 한번은 출력됩니다.");
			++k;
		}while(k < 0);

	}

}
