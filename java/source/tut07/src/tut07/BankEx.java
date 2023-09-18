package tut07;

import java.util.Scanner;

public class BankEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money = 10000;
		int in = 0;
		int out = 0;
		
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1. 입금 | 2.출금 | 3.잔고확인 | 4.종료");
			System.out.println("---------------------------------------");
			System.out.print("메뉴를 선택하세요. >> ");
			int input = sc.nextInt();
			
//			System.out.println(input);
			
			switch (input) {
			case 1 :
				System.out.print("입금하실 금액을 입력해주세요. >> ");
				in = sc.nextInt();
				System.out.println("");
				System.out.println(in +"원 입금완료");
				System.out.println("");
				System.out.println("잔고는 " + (money += in) + "원 입니다.");
				System.out.println("");
				break;
				
			case 2 :
				System.out.println("");
				System.out.print("출금하실 금액을 입력해주세요. >> ");
				out = sc.nextInt();
				
				if (money < out || money <= 0) {
					System.out.println("");
					System.out.println("잔액이 부족합니다.");
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println(out + "원 출금완료");
					System.out.println("");
					System.out.println("잔고는 " + (money -= out) + "원 입니다.");
					System.out.println("");
				}
				
				break;
				
			case 3 : 
				System.out.println("");
				System.out.println("현재 잔고는 " + money + "원 입니다.");
				System.out.println("");
				break;
				
			case 4 : 
				System.out.println("");
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
				
			default :
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
		
		
		

	}

}
