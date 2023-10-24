import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while (run) {
			System.out.println("A(a).입력 | Q(q).종료");
			System.out.print("선택 > ");
			String menu = sc.next();
			
			if (menu.equals("A") || menu.equals("a")) {
				System.out.print("\n영어입력(띄어쓰기 없이) > ");
				String upper = sc.next();
				System.out.println("");
				String result = upper.toUpperCase();
				System.out.println("대문자로 변환 : " + result );
				System.out.println("");
			}else if (menu.equals("Q") || menu.equals("q")) {
				System.out.println("\n프로그램을 종료합니다.\n");
				System.exit(0);
			}else {
				System.out.println("\n잘못된 메뉴 선택입니다.\n");
			}
			
		}
		    
		}
		
	}

