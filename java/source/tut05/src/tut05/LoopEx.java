package tut05;

public class LoopEx {

	public static void main(String[] args) {
		// 1. for 문 기본형 0 ~ 4까지 출력하는 반복문 작성
		
//		for (초기값; 조건; 증감값) {
//			출력코드
//		}
		
		for (int i = 0; i <= 4; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
//		
//		// 0부터 100미만 까지 출력하는 for문 작성
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
//		
//		System.out.println("");
//		
//		// 1부터 10이하까지 출력하는 for
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 2. while문과 for문 비교
		
		// 0 ~ 10 미만 출력하는 for
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
		// 0 ~ 10 미만 출력하는 while
		
//		초기값;
//		while (조건) {
//			출력코드
//			증감값
//		}
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			++i;
		}
		
		System.out.println("------------------------");
		
		// 10 이하 부터 1까지 출력하는 for
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}
		
		System.out.println("------------------------");
		
		// 0 ~ 10 짝수 출력하기 for 문
		
		for (int z = 2; z <= 10; z += 2) {
			System.out.println(z);
		}
	}

}
