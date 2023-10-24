
public class MultipleEx {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 0; i < 1000; i++) {
			sum = sum + i;
			
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum - i;
			}
		}
		System.out.println(sum);

	}

}
