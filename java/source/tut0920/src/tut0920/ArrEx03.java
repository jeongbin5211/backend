package tut0920;

import java.text.Format;

//	class Cal {
//	
//	}

//class Disp {
//	
//}

public class ArrEx03 {
	
	public static void main(String[] args) {
		// 메소드를 이용해서 출력
		// 정수에 5개 점수를 저장한 후
		// 합계
		// 평균
		
//		int[] scores = new int[] {1, 2, 3, 4, 5};
		
		int[] scores = null;
		scores = new int[] {1, 2 ,3, 4, 5};

		Cal c = new Cal(); // 생성자를 통해서 접근
		
		// 배열 길이 확인 메소드
		
		// 보낼 때 new ~, 메소드에서 받을 때는 타입 ~
//		c.leng(new int[] {1, 2, 3, 4, 5});
		c.leng(scores);
		
		System.out.println(c.leng(scores));
		
		// 합계
		
		System.out.println(c.sum(scores)); // 15
		
		// 배열 10개의 합은 100입니다.
		
		System.out.println("배열 " + (scores.length) + "개의 합은 " + c.sum(scores) + "입니다.");
		System.out.println("배열 " + c.leng(scores) + "개의 합은 " + c.sum(scores) + "입니다."); // 메소드 이용
		
		
		// 평균
		c.avg(scores);
		
		// 평균은 ~입니다.
		System.out.printf("평균은 %.2f입니다.\n", c.avg(scores));
		
		
		Disp d = new Disp();
		d.title();
		System.out.println(d.close());
		
		System.out.println("---------------");
		
		// d.title 내용을 다르게 출력하기 -> 오버라이딩 활용
		d.title("컴퓨터 프로그램");
		
		// d.close 내용을 다르게 출력하기
		d.close("시스템 종료");
		System.out.println(d.close("시스템 종료"));
		
	}
}


