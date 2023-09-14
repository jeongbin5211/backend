package tut05;

public class LoopEx4 {

	public static void main(String[] args) {
		// while 무한루프 기본형
		
//		while (true) {
//			System.out.println("loop");
//		}
		
		boolean run = true;
		
		int i = 0;
		while (run) { // while 무한루프
			System.out.println(++i);
		}

	}

}
