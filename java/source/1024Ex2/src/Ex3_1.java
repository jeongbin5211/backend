import java.util.Scanner;

public class Ex3_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while (run) {
			System.out.print("학년을 입력해주세요.(1 ~ 4) >> ");
			int grade = sc.nextInt();
			System.out.println("");
			if (grade > 4 || grade < 0) {
				System.out.println("유효하지않은 학년입니다.\n");
				System.out.println("프로그램을 종료합니다.\n");
				System.exit(0);	
			}
			System.out.print("점수를 입력해주세요.(0 ~ 100) >> ");
			int score = sc.nextInt();
			System.out.println("");
			
			if(score > 100 || score < 0) {
				System.out.println("유효하지않은 점수입니다.\n");
			}else if (score >= 60 && grade < 4) {
				System.out.println("합격\n");
			}else if(score >= 80 && grade == 4) {
				System.out.println("졸업입니다.\n");
			}else if(score < 80 && grade == 4) {
				System.out.println("재시험입니다.\n");
			}else {
				System.out.println("불합격\n");
			}
		}
		
		
		
	}

}
