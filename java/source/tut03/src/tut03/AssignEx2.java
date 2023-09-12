package tut03;

public class AssignEx2 {

	public static void main(String[] args) {
		// 증감연산자
		// 대입연산자를 줄여서 (축약) 사용
		
		int num = 5;
		++num;
		
		System.out.println(num); // 6
		
		System.out.println(++num); // 7
		System.out.println(num++); // 7
		System.out.println(num);   // 8
		
		num = num + 1;
		System.out.println(num);   // 9
		
		num += 1;
		System.out.println(num);   // 10
		
		num += 5;
		System.out.println(num);   // 15
		
		num *= 10;
		System.out.println(num);   // 150
		
		num /= 150;
		System.out.println(num);   // 1
		
//		0 ~ 9까지 더하는 반복문을 작성하세요.
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println(sum); // 45
	}

}
