package tut0921;

import java.util.Scanner;

public class ScoresEx {

	public static void main(String[] args) {
		// 전역변수, 전역객체 선언
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int[] scores = null;
		
		while(run) {
			System.out.println("==============================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수출력 | 4. 평균점수 | 5. 최고점수 | 6. 종료");
			System.out.println("==============================================================");
			System.out.print("메뉴 선택 >> ");
			int menu = sc.nextInt();
			
			
//			int[] scores = null; // 루프 밖으로 
			switch(menu) {
			case 1 :
				
				if (scores == null) {
					System.out.print("\n등록할 학생 수를 입력하세요. >> ");
					int student = sc.nextInt();
					scores = new int[student];
					System.out.println("\n" + scores.length + "명의 학생이 등록되었습니다.\n");
				}
				System.out.println("2. 점수입력 메뉴로 이동하세요.\n");
				
				break;
				
			case 2:
				
				if (scores == null) {
					System.out.println("\n1. 학생 수 메뉴에서 학생 수를 먼저 등록해주세요.\n");
					break;
				}
				
				break;
				
			case 3:
				
				if (scores == null) {
					System.out.println("\n1. 학생 수 메뉴에서 학생 수를 먼저 등록해주세요.\n");
					break;
				}
				
				break;
				
			case 4:
				
				if (scores == null) {
					System.out.println("\n1. 학생 수 메뉴에서 학생 수를 먼저 등록해주세요.\n");
					break;
				}
				
				break;
				
			case 5:
				
				if (scores == null) {
					System.out.println("\n1. 학생 수 메뉴에서 학생 수를 먼저 등록해주세요.\n");
					break;
				}
				
				break;
				
			case 6:
				System.out.println("\n프로그램을 종료합니다.\n");
				System.exit(0);
				break;
				
			default :
				System.out.println("\n메뉴를 다시 선택해주세요.\n");
			}
			
		}
		
		// 무한루프
			// switch
		

	}

}
