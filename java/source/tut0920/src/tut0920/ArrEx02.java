package tut0920;

import java.util.Arrays;

public class ArrEx02 {

	public static void main(String[] args) {
		// 타입[] 이름 = new 타입[]{1, 2, 3, 4, 5};
		
		int[] arr = new int[] {1, 2, 3, 4, 5};
		
		boolean[] arr2 = new boolean[] {true, false};
		
		double[] arr3 = new double[] {0.0, 0.1, 0.2};
		
		String[] arr4 = new String[] {"Red", "Green", "Blue"};
		
		// 고정배열.length, 가변배열.size() -> 배열 길이
		System.out.println(arr4.length);
		// toString -> 문자열로 표현해주세요. (주로 확인용으로 사용됨)
		
		System.out.println(Arrays.toString(arr4)); // 배열일 때 [] 출력됨 [Red, Green, Blue]
		
		System.out.println(Arrays.toString(arr2)); // [true, false]
		
		// 정수는 ~ 입니다. 출력하기
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 정수는 " + arr[i] + "입니다.");
		}
		
		System.out.println("\n향상된 for문 출력\n");
		
//		for (출력타입 별명 : 배열명) {
//			출력코드(별명)
//		}
		
		for (int v : arr) {
			System.out.println("정수는 " + v + "입니다.");
		}
		
		for (boolean b : arr2) {
			System.out.println(b);
		}
		
		for (String s : arr4) {
			System.out.println(s);
		}
		
	}

}
