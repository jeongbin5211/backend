package tut06;

public class ScopeEx {

	public static void main(String[] args) {
		// 변수가 미치는 범위 {}
		
		int num = 10; // 전역변수
		{
			int num2 = 5; // 지역변수
			num = num+1;
			System.out.println(num);
		}
		
		System.out.println(num);
//		System.out.println(num2); // 출력 불가능
		
		
		
		int num3 = 10; // 전역변수
		
		for (int i = 0; i < 10; i++) {
			System.out.println(num3);
			System.out.println(i);
		}
		
		System.out.println(num3);
//		System.out.println(i); // 출력 불가능
		
		int a; // 전역변수
		for (a = 0; a < 10; a++) {
			System.out.println(num3);
			System.out.println(a);
		}
		
		System.out.println(a); // a 가 전역변수라서 출력가능
		
		System.out.println("-------------------------------");
		
		// 1 ~ 10까지 더해서 총합을 출력하세요.(한번만)
		// 누적되는 값을 처리하려면 반복문 밖이나 static 메소드를 사용해야 합니다.
		
		for (int b = 1; b <= 10; b++) {
			int sum = 0; // 총합을 저장하는 변수
			
			sum = sum + b;
			System.out.println(sum);
		}
//		System.out.println(sum); // sum 이 지역변수라서 출력이 불가능
		
		System.out.println("-------------------------------");
		
		int sum = 0; // 총합을 저장하는 변수
		for (int b = 1; b <= 10; b++) {
			sum = sum + b;
			System.out.println(sum);
		}
		System.out.println(sum); // 55
		
		System.out.println("-------------------------------");
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println(i);
		
//		for(int i = 0;) // i가 전역변수라서 오류발생
		
		System.out.println("-------------------------------");
		
		// 변수 값은 바로 위 중괄호 영역에서만 값을 사용
		// 단, for()문은 오른쪽 {} 안에서만 값을 사용할 수 있다.
		
		// 값을 누적할 때는 전역변수로 형태로 사용하거나
		// 변수 앞에 static을 붙혀서
		

	}

}
