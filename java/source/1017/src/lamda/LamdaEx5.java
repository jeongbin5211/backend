package lamda;

interface MaxNum {
	int getMaxNum(int a, int b);
}

public class LamdaEx5 {

	public static void main(String[] args) {
		// 두 개의 수중 큰 숫자를 출력하세요.
		// x > y -> return x;
		
		MaxNum m = (a, b) -> {
			if (a > b) {
				return a;
			}else {
				return b;
			}
		};
		
		int max = m.getMaxNum(5, 110);
		System.out.println(max);
		
		// 삼항연산자 이용
		
		MaxNum m2 = (x, y) -> {
			return (x > y) ? x : y;
		};
		
		System.out.println(m2.getMaxNum(2, 40));
		
		// 한줄로 만들기 -> return 생략해야함(비추)
		
		MaxNum m3 = (c, d) -> (c > d) ? c : d;
		
		System.out.println(m3.getMaxNum(2, 40));
		
	}

}
