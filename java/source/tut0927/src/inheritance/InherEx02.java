package inheritance;

class Cals {
	// 더하기, 빼기
	
	int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	int sub(int num1, int num2) {
		return num1 - num2;
	}
}

class AdvCals extends Cals {
	int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	int div(int num1, int num2) {
		return num1 / num2;
	}
}

public class InherEx02 {

	public static void main(String[] args) {
		Cals cal = new Cals();
		System.out.println(cal.plus(100, 200));
		System.out.println(cal.sub(100, 200));
		
		System.out.println("---------------------");
		
		AdvCals adv = new AdvCals();
		
		System.out.println(adv.plus(100, 200));
		System.out.println(adv.sub(100, 200));
		System.out.println(adv.mul(2, 10));
		System.out.println(adv.div(100, 10));
		
	}

}
