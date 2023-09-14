package tut05;

import java.util.Scanner;

public class LoopEx6 {

	public static void main(String[] args) {

		/*
			========================
			스타벅스 커피 자동 판매기
			========================
			1. 구매(P/p) | 2. 잔액(B/b) | 3. 종료(Q/q)
			메뉴 선택 >
			
			[조건]
			*최초 잔액은 10000, 커피 한잔 가격은 3000, 커피 재고량은 10
			*p/P 를 입력하면 구매
			 - 구매 시 내가 가진 돈이 커피 한잔 가격보다 적거나
			   커피 재고량이 0보다 적으면 "커피를 구매할 수 없습니다."
			   출력 후 메뉴 화면으로 이동
			 - 커피 구매 후 잔액 및 커피 재고량 감산
			* B/b 를 입력하면 잔액 확인
			 - 현재 남은 잔액 출력하기
			
			* 종료를 입력하기 전까지는 무한반복
			 - Q/q를 입력하면 프로그램 종료
			
			* 잘못된 입력 값을 입력하면 종료가 아닌 메뉴 화면으로 이동
		*/

		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while (run) {
			System.out.println("=====================");
			System.out.println("스타벅스 커피 자동 판매기");
			System.out.println("=====================");
			System.out.println("1. 구매(P/p) | 2. 잔액(B/b) | 3. 종료(Q/q)");
			System.out.print("메뉴를 선택하세요. >> ");
			
			String input = sc.next();
			System.out.println(input);
			
			int cnt = 10;
			int price = 3000;
			int money = 10000;
			
			switch (input) {
			case "P" :
			case "p":
				cnt -= 1;
				money -= price;
				System.out.println("구매하였습니다.");
				System.out.println("잔액은 " + money + "입니다.");
				System.out.println("");
//				continue;
				
				if (money < price || cnt <= 0) {
					System.out.println("커피를 구매할 수 없습니다.");
					break;
				}
				continue;
				
			case "B" :
			case "b" :
				System.out.println("현재 남은 잔액은 " + money + "입니다.");
				System.out.println("");
				break;
				
			case "Q" :
			case "q" :
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
				
			default :
				System.out.println("메뉴를 다시 입력해주세요.");
				
			}
			
			
		}

	}

}
