package tut05;

import java.util.Scanner;

public class LoopEx6 {

	public static void main(String[] args) {
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
