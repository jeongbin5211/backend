package exam1;

import java.util.Scanner;

public class RandomEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("랜덤값의 개수를 설정하세요. >> ");
		int max = sc.nextInt();
		
		System.out.println(max + "개의 임의의 수 중에서 짝수만 출력합니다.\n");
		
		int []random = new int[max];
		
		for (int i = 0; i <max; i++) {
			random[i] = (int)(Math.random() * max) + 1;
			if(random[i] % 2 == 0) {
				System.out.println(random[i]);
			}
//			System.out.println(random[i]);
		}

	}

}
