package thread;

class HanCount extends Thread {
	public void run() {
		String[] strArr = {"하나", "둘", "셋", "넷", "다섯"};
		
		try {
			Thread.sleep(100);
		}catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx2 {

	public static void main(String[] args) throws InterruptedException {
		// 1 하나, 2 둘...
		// 나중에 실행될 작업을 먼저 처리해주기
		
		HanCount hc = new HanCount();
		hc.start();
		
		int[] intArr = {1, 2, 3, 4, 5};
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
			Thread.sleep(500);
		}

	}

}
