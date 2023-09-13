package tut04;

import java.util.Scanner;

public class ContEx2 {

	public static void main(String[] args) {
		/*
		  	학점 91 ~ 100 A등급 
		  	학점 81 ~ 90 B등급 
		  	학점 71 ~ 80 C등급
		*/

		int score = 101;
		
		if (score > 100 || score < 0) {
			System.out.println("점수를 다시 입력하세요.");
		} else if (91 <= score) {
			System.out.println("A");
		} else if (81 <= score) {
			System.out.println("B");
		} else if (71 <= score) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		// 스캐너
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요(숫자: 0 ~ 100) >> ");
		// 값을 입력 받을 수 있게 sc.next();
//		int input = Integer.parseInt(sc.next());
		
		int input = sc.nextInt();
		
//		if (input > 100 || input < 0) {
//			System.out.println("점수를 다시 입력하세요.");
//		} else if (91 <= input) {
//			System.out.println("A");
//		} else if (81 <= input) {
//			System.out.println("B");
//		} else if (71 <= input) {
//			System.out.println("C");
//		} else {
//			System.out.println("F");
//		}
		
		String str = "";
//		String str = null;
		
		if (input > 100 || input < 0) {
			str = "점수를 다시 입력하세요.";
		} else if (91 <= input) {
			str = "A";
		} else if (81 <= input) {
			str = "C";
		} else if (71 <= input) {
			str = "D";
		} else {
			str = "F";
		}
		
		System.out.println(str);
		
		
	}

}
