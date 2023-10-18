package thread;

class NumCount1 extends Thread {
	
	public void run() { // 작업코드
		String[] strArr = {"하나", "둘", "셋", "넷", "다섯"};
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException ie) {
			
		}
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class HanCount1 extends Thread {
	
	public void run() { // 작업코드
		int[] intArr = {1, 2, 3, 4, 5};
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadEx3 {

	public static void main(String[] args) {
		NumCount1 nc1 = new NumCount1();
		nc1.start();
		
		HanCount1 hc1 = new HanCount1();
		hc1.start();
		
	}

}
