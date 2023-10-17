package lamda;

// disp()
interface MyLamda {
	void disp();
}

// 람다식으로 화면 출력(sysout)
public class LamdaEx {

	public static void main(String[] args) {
		
//		MyLamda m = new MyLamda(); // 생성자 사용 안됨
		
		// 화살표 함수 뒤에 중관호는 출력 내용이 한줄일 때는 생략 가능합니다.
		
//		MyLamda m = disp() -> {}; // 익명함수 처리하기
		MyLamda m = () -> {
			System.out.println("Koreait Academy");
		};
		
		m.disp();
		
		System.out.println("------------------------------------");
		
		MyLamda m2 = () -> System.out.println("코리아아이티 아카데미");
		
		m2.disp();

		System.out.println("------------------------------------");
		
		MyLamda m3 = () -> {
			String str = "코리아아이티 아카데미2";
			System.out.println(str);
		};
		
		m3.disp();
		
		// 자바스크립트 화살표함수
//		let num = () => {1 + 1};
//		clg(num);
		
		// 자바 인터페이스
//		() -> {1 + 1};
//		System.out.println();
	}

}
