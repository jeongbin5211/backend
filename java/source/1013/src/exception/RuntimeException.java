package exception;

public class RuntimeException {

	public static void main(String[] args) {

		/*
		Runtime Exception : 실행 단위
		ArimetricException : 나누기 예외
		ArrayIndexOutBoundE~
		NullPointEx~
		*/
		
		// ArimetricException
		
//		try {
//		
//			System.out.println(10 / 0);
//			
//		} catch (ArithmeticException ae) {
//			ae.printStackTrace();
//			ae.getMessage();
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		
		String[] str = new String[] {"a", "b", "c"};
		System.out.println(str.length);
		
//		for (int i = 0; i < str.length; i++) {
//			
//			System.out.println(str[i]);
//			
//		}
		
		// 2. ArrayIndexOutofBoundsException
		
//		try {
//			System.out.println(str[3]);
//		}catch (ArrayIndexOutOfBoundsException aiobe) {
//			aiobe.printStackTrace();
//			System.out.println("인덱스 번호 예외");
//		}

		String string = "Koreait";
		String string2 = new String("Koreait");
		
		// 글자 추출 후 char로 변경해서 출력
		
		System.out.println(string.charAt(0));
		
		String string3 = null;
		
		try {
			
			System.out.println(string3.charAt(2));
			
		}catch(NullPointerException npe) {
			npe.printStackTrace();
			System.out.println("데이터 값이 없습니다.");
		}
	}

}
