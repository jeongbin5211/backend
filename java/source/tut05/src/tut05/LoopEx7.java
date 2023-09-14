package tut05;

import java.util.Scanner;

public class LoopEx7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 10000;
		int coffee = 3000;
		int cnt = 10;
		
		boolean run = true;
		while (run) {
			System.out.println("=====================");
			System.out.println("스타벅스 커피 자동 판매기");
			System.out.println("=====================");
			System.out.println("1. 구매(P/p) | 2. 잔액(B/b) | 3. 종료(Q/q)");
			System.out.print("메뉴 선택 >> ");
			
			
			String input = sc.next();
			System.out.println("");
			
			switch (input) {
			case "P" :
			case "p" :
				System.out.println("구매를 진행합니다.");
				System.out.println("");
				
				if(money < coffee) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("");
				}else if(cnt <= 0) {
					System.out.println("커피 재고가 없습니다.");
					System.out.println("");
				}else {
					money = money - coffee;
					cnt = cnt - 1; 
					System.out.println("구매하였습니다.");
					System.out.println("");
					System.out.println("남은 커피 재고 : " + cnt);
					System.out.println("");
				}
				
				break;
				
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
				System.out.println("");
				continue; // 반복문을 건너뛰고 다시 돌아가세요.
			}
		}
			

	}

}
