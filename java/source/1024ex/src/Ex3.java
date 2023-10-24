
public class Ex3 {
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		do {
			for (int i = 97; i <= 122; i++) {
				char ch = (char)i;
				System.out.println(ch);
			}
			run = false;
		} while (run);
	}
}
