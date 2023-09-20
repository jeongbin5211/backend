package tut0920;

public class Cal {
	
	// 길이 확인 메소드 
	
	public int leng(int[] scores) {
		return scores.length;
	}
	
	// 합계메소드
	
	// 기본세팅
//	public void sum() {
//		System.out.println();
//	} 
	
	public int sum(int[] scores) {
		// 누적하는 전역변수
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		return sum;
	}
	
	
	
	// 평균메소드
	
	// 기본세팅
//	public void avg() {
//		System.out.println();
//	}
	
	public double avg(int[] scores) {
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
			
		return (double) sum / scores.length;
	}
}
