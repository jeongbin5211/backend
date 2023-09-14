package tut05;

import java.util.Scanner;

public class LoopEx5 {

	public static void main(String[] args) {
		
		// q를 입력하기 전에는 프로그램은 계속실행 (무한루프)
		// q/Q 입력하면 프로그램 종료
		// ui : a 입력하면 더하기, q 종료
		// a를 누르면 두 정수를 입력 받아 더하기 한 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean run = true;
		while (run) {
			// 무한루프는 sc.next() 를 만나면 멈춤(입력 대기)
			
			System.out.println("===========================");
			System.out.println("1. 더하기(a) 2. 종료(q/Q)");
			System.out.println("===========================");
			System.out.print("작업 내용 입력 >> ");
			String input = sc.next();
//			System.out.println(input);
			System.out.println("");
			
			switch (input) {
			case "a" :
				System.out.print("첫 번째 정수를 입력하세요 >> ");
				int num1 = sc.nextInt();
				
				System.out.print("두 번째 정수를 입력하세요 >> ");
				int num2 = sc.nextInt();
				
				int result = num1 + num2;
				
				System.out.println("두 정수의 합은 " + result + "입니다.");
				System.out.println();
				
				break;
				
			case "q" : 
			case "Q" : 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 무한루프를 종료하고 프로그램을 빠져 나감
				break;
				
			default :
				System.out.println("다시 입력해주세요.");
				System.out.println("");
				
			}
			
		}
		

	}

}
