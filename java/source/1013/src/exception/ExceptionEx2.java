package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// interruptException : 쓰레드
		

	}
	
	void thread1() throws InterruptedException {
		// 1초 뒤에 멈추세요.
		Thread.sleep(1000);
	}
	
	void thread2() {
		
		try {
			
			Thread.sleep(1000);
			System.out.println("Thread success");
			
		} catch (InterruptedException e) {

			e.printStackTrace();
			
		} finally {
			
			System.out.println("Thread를 종료합니다.");
			
		}
		
	}

}
