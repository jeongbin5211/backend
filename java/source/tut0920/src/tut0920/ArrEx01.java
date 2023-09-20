package tut0920;

public class ArrEx01 {

	public static void main(String[] args) {
		// 배열은 반복문과 같이 사용합니다.
		// (for - 배열번호가 필요할 때, 향상된 for - 배열번호 필요없이 값만 필요할 때)
//		for(int i = 0; i < 배열명.length; i++) {
//			출력코드(배열명[i]);
//		}
		
		// 향상된 for
//		for (츨력타입 별명 : 배열명) {
//			출력코드(별명);
//		}
		
		// 배열번호(index)는 0부터 시작
		// 변수이름중 i, idx, index 가 있다면 배열을 처리
		
		// 정수 100개를 저장하는 프로그램을 완성하세요.
//		데이터타입 변수명 = new 데이터타입;
		// int[] value = new int[100]; // 4byte짜리 빈 공간이 100개 생성됨 -> 초기화가 아닙니다.
		
		// int[] value = null; // 참조형이기 때문에 null로 초기화
		// value = new int[10];
		
		// 생성자 : 초기화
		// Member m = new Member(); // 이건 초기화 된것
		
		int [] value = new int[3]; // 초기화x
		value[0] = 100; // 초기화
		value[1] = 200; // 초기화
		value[2] = 300; // 초기화
		
		// 배열 0 ~ 2번까지 출력하세요.
		
		System.out.println(value[0]);
		System.out.println(value[1]);
		System.out.println(value[2]);
		
		System.out.println("-------------------------------");
		
		// 배열 0 ~ 2번까지 출력하세요.
		// 배열명[인덱스]
		// for
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
		
		System.out.println("-------------------------------");
		
		// value[0]의 값은 0입니다. 출력하기
		for (int i = 0; i < value.length; i++) {
			System.out.println("value[" + i + "]의 값은 " + value[i] + "입니다.");
		}
		
		System.out.println("-------------------------------");
		
		// 1번 값은 100입니다. 출력하기
		for (int i = 0; i < value.length; i++) {
			System.out.println((i + 1) + "의 값은 " + value[i] + "입니다.");
		}
		
		System.out.println("-------------------------------");
		
		// int[] num = {1, 2, 3, 4, 5}; // 값을 직접 입력해서 넣는 경우
		// 초기값을 설정하면 자동으로 배열 개수가 생성이 됩니다.
		
		// 학생 3명 점수를 초기값으로 설정 후
		// 화면에 출력하세요
		// 합계를 출력하세요
		// 평균을 출력하세요
		
		int[] score = {80, 90, 100, 53};
		
		System.out.println("화면에 출력");
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		System.out.println("-------------------------------");
		
		// 등록된 학생 수는 x명입니다.
		System.out.println("등록된 학생 수는 " + score.length + " 명입니다."); // 고정배열은 length, 동적배열은 size()
		
		System.out.println("-------------------------------");
		
		System.out.println("점수 합계 출력");
		// 합계 : 누적(전역변수 or static사용)
		
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println(sum); // 270
		
		System.out.println("-------------------------------");
		
		System.out.println("점수 평균 출력");
		
		// 합계 / 배열길이 = 평균
		
		// 먼저 실수 가능성 확인하기
		
		System.out.println((double) sum / score.length);
		
		// 출력 포맷 변경 소수점 2자리로 설정
		
		double result = (double) sum / score.length;
		
		System.out.println(String.format("평균은 %.2f 입니다." , result));
		System.out.printf("평균은 %.2f 입니다.\n", result);
		
		
		System.out.println(sum / score.length); // 90
		
		
			
		
	}

}
