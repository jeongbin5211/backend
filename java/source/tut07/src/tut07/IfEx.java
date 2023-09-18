package tut07;

public class IfEx {

	public static void main(String[] args) {
		
		int num; // 변수를 선언 -> 메모리 생성 -> 값 x -> 초기화
		num = 0;
		
		int[] arr; // 객체(배열) 선언
		arr = new int[3]; // 배열 초기화
		
		System.out.println(num);
		System.out.println(arr);
		
		// 임의의 점수(정수) 생성
		// 점수가 90보다 크면 A학점
		// 80보다 크면 B학점
		
		int score = 88;
		
		if (score >= 90) {
			System.out.println("100점 보다는 적습니다.");
			System.out.println("A학점입니다.");
		}else {
			System.out.println("100점 보다는 적습니다.");
			System.out.println("B학점입니다.");
		}
		
		// 출력코드가 두 줄 이상일 때 {} 필수
		
		

	}

}
