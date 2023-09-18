package tut07;

import java.util.Scanner;

public class BankExTeacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = 0;
		int balance = 0;
		
		boolean run = true;
		
		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1. 입금 | 2.출금 | 3.잔고확인 | 4.종료");
			System.out.println("---------------------------------------");
			System.out.print("메뉴를 선택하세요. >> ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1 :
				System.out.print("예금할 금액 입력 >> ");
				balance += sc.nextInt();
				System.out.println("입금 되었습니다.");
				System.out.println("잔고를 확인하세요.");
				break;
				
			case 2 :
				if (balance <= 0) {
					System.out.println("잔액이 부족합니다.");
					break;
				}else {
					System.out.println("출금을 진행합니다.");
					System.out.println("현재 잔액 : " + balance);
					System.out.println("");
					System.out.println("");
					
					System.out.print("출금할 금액 >> ");
					balance -= sc.nextInt();
					System.out.println("출금 되었습니다.");
					
				}
				break;
				
			case 3 : 
				System.out.println("잔고는 " + balance + "원 입니다." );
				break;
				
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				
			default :
				System.out.println("메뉴를 다시 선택하세요. (1 ~ 4)");
			}
		}
	}

}
