package tut02;

public class IncDecEx {

	public static void main(String[] args) {
		// 임의 정수 두 개 생성 후 증감자로 값을 1씩 증가시키거나 감소시키시오.
		
		int num1, num2; // 변수 선언 => 메모리에 공간 설정(4byte)
		num1 = 1; // 초기값 설정, ++
		num2 = 2; // 초기값 설정, --
		
		num1++;
		num2--;
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println("---------------------------");
		
		int num3, num4;
		num3 = 10;
		num4 = 5;
		
		System.out.println(num3++); // 10
		System.out.println(++num3); // 12
		
		System.out.println("---------------------------");
		
		// char a; 문자지만 숫자로 변환 가능
		char a = 'a';
		
		System.out.println((int)a); // 97
		System.out.println(a);	 // a
		System.out.println(++a); // b
		System.out.println(a++); // b
		System.out.println(a);   // c
		
		System.out.println((int)a); // 99

	}

}
