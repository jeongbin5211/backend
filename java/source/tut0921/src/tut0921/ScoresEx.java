package tut0921;

import java.util.Arrays;
import java.util.Scanner;

import tut0921.dao.ScoresDao;

public class ScoresEx {

	public static void main(String[] args) {
		// 전역변수, 전역객체 선언
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int[] scores = null;
		
		ScoresDao dao = new ScoresDao();
		
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
				
//				if (scores == null) {
//					System.out.println("\n1. 학생 수 메뉴에서 학생 수를 먼저 등록해주세요.\n");
//					break;
//				} // ScoresDao.java로 옮김 -> nullCheck() 메소드로 변환
				
//				dao.nullCheck();
				
//				if (scores != null) {
					for (int i = 0; i < scores.length; i++) {
						System.out.print((i + 1) + "번째 학생의 " + "점수 입력 >> ");
//						scores[i] = new int();
						scores[i] = sc.nextInt();
					}
					System.out.println("\n학생 점수 입력이 완료되었습니다.\n");
					System.out.println("3. 점수출력 메뉴에서 확인하세요.");
//				}
				
				break;
				
			case 3:
				
//				if (scores == null) {
//				System.out.println("\n1. 학생 수 메뉴에서 학생 수를 먼저 등록해주세요.\n");
//				break;
//				} // ScoresDao.java로 옮김 -> nullCheck() 메소드로 변환
			
//				dao.nullCheck();
				
//				if (scores != null) {
					System.out.println("학생 점수 출력");
					System.out.println("\n" + scores.length + "명의 학생 점수 출력");
					
					for (int i = 0; i < scores.length; i++) {
						
						System.out.println((i + 1) + "번 학생의 점수는 " + scores[i] + "점 입니다.");
						System.out.println("----------------------------------------------");
					}
					System.out.println("");
//				}
				
				break;
				
			case 4:
				
//				if (scores == null) {
//					System.out.println("\n1. 학생 수 메뉴에서 학생 수를 먼저 등록해주세요.\n");
//					break;
//				} // ScoresDao.java로 옮김 -> nullCheck() 메소드로 변환
				
//				dao.nullCheck();
				
				int sum = 0;
				
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				double avg = (double) sum / scores.length;
				System.out.println("\n학생 평균은 " + (double) sum / scores.length + "점 입니다.\n");
				
				break;
				
			case 5:
				
//				if (scores == null) {
//					System.out.println("\n1. 학생 수 메뉴에서 학생 수를 먼저 등록해주세요.\n");
//					break;
//				} // ScoresDao.java로 옮김 -> nullCheck() 메소드로 변환
				
//				dao.nullCheck();
				
				// 최대값, 최소값 = 비교값
//				최대값 = 비교값(가장 값이 작은 정수 => 0)
//				최솟값 = 비교값(가장 값이 큰 정수 => 9)
//				System.out.println(Arrays.toString(scores));
				int max = 0; // 비교값
				for (int i = 0; i < scores.length; i++) {
					// 55, 100, 77
					if( max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최대값은 " + max + "점 입니다.");
				
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
