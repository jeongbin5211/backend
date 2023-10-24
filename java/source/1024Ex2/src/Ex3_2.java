
public class Ex3_2 {
	
	int arr[] = new int[] {8, 3, 1, 6, 2, 4, 5, 9};
	
	int sum = 0;
	
	public double avg() {
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		double avg = (double)sum / arr.length;
		
		return avg;
	}
	
	public static void main(String[] args) {
		
		Ex3_2 dao = new Ex3_2();
		
		System.out.print("평균은 ");
		System.out.printf("%.2f", dao.avg());
		System.out.println("입니다.");
	
	}
	
	
	
	

}
