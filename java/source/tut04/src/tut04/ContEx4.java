package tut04;

import java.util.Scanner;

public class ContEx4 {

	public static void main(String[] args) {
		// 임의의 정수를 입력 받아서 홀수, 짝수를 표시하시오.
		// 입력은 문자로 입력 받아서 정수로 변환하여 사용하시오.
		// switch
		// 입력 화면은 1이면 홀수, 짝수 결과, 2 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계산(1), 종료(2) >> ");
		int choice = Integer.parseInt(sc.next());
//		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.println("======================");
			System.out.println("홀수, 짝수를 구분합니다.");
			System.out.println("======================");
			
			System.out.print("임의의 정수를 입력하세요. >> ");
			int input = Integer.parseInt(sc.next());
			
			String result = (input % 2 == 1) ? "Odd" : "Even";
//			System.out.println("입력하신 정수는 " + result + "입니다.");
			System.out.printf("입력하신 정수는 %s 입니다.", result);
			
			break;
		case 2 :
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		default :
			System.out.println("다시 입력해주세요.");
		}
		
		
		
//		System.out.println(input); // console.log() 역할 -> 테스트용도
		
		
		

	}

}
