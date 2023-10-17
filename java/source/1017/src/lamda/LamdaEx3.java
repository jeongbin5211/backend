package lamda;

interface Hello {
	String greeting(String str); 
}

public class LamdaEx3 {

	public static void main(String[] args) {
		
		Hello h = (s) -> { 
			return s;
		};
		
		System.out.println(h.greeting("안녕"));

	}

}
