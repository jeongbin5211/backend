/*
1. 프로그램명 : 정수 100을 출력하는 프로그램 
2. 작성일 : 2023.09.07
3. 작성자 : 허정빈
*/

package tut00;

public class Var {

	public static void main(String[] args) {
		// 데이터타입 이름 = 값;
		// a = b : b를 a에 저장
		// a == b : a 와 b의 메모리 값이 같다 
		// a.equals("b") : a와 b의 값이 같다
//		int num = 100;
//		System.out.println(num);
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 + num2);
		
		// 0.2 - 0.1
		double d1 = 0.2;
		double d2 = 0.1;
		System.out.println(d1 - d2);
		
		// 0.333 을 int에 강제 저장할 때 : 타입변환시키기
		// 작은 것은 큰 것에 담아도 손실이 일어나지 않음
		// 큰 것을 작은 것에 담으면 손실이 일어남
		// int는 저장 공간이 4byte(32bit)
		// double은 저장공간이 8byte(64bit)
		int i = (int)0.333;
		System.out.println(i); // 0 -> 소수점은 잘려서 출력됨
		
		double d3 = 0.333;
		System.out.println(d3);
	}

}
