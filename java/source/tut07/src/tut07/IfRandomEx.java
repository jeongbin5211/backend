package tut07;

import java.util.Scanner;

public class IfRandomEx {

	public static void main(String[] args) {
		// 가위(1) 바위(2) 보(3)
		// me, com 변수 생성
		// 나와 컴퓨터를 비교해서 일치하지 않으면 이겼습니다. 일치하면 졌습니다.
		
//		int me = 2;
		
		// 스태틱 메소드는 기울기가 적용된 상태로 적힘
		// System.out.println(Math.random());
		
		// random 메소드 사용법
		// (int)(Math.random() * 마지막값) + 시작값
		// 가위 바위 보 = 1, 2, 3
		// (int)(Math.random() * 3) + 1
		
		// System.out.println((int)(Math.random() * 3) + 1);
		
//		int com = (int)(Math.random() * 3) + 1;
//		
//		if (me != com) {
//			System.out.println("컴퓨터가 이겼습니다.");
//			System.out.println("프로그램을 종료합니다.");
//		}else {
//			System.out.println("내가 이겼습니다.");
//			System.out.println("프로그램을 종료합니다.");
//		}
		
		// 2. scanner 사용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 선택 >> ");
		
		int me = sc.nextInt();
		
		int com = (int)(Math.random() * 3) + 1;
		
//		System.out.println((int)(Math.random() * 3) + 1);
		
		if (me != com) {
			System.out.println("컴퓨터는 "+ com + ", 나는 " + me + "입니다.");
			System.out.println("컴퓨터가 이겼습니다.");
			System.out.println("프로그램을 종료합니다.");
		}else {
			System.out.println("내가 이겼습니다.");
			System.out.println("프로그램을 종료합니다.");
		}
	}

}
