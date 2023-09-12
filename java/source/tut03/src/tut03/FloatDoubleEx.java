package tut03;

public class FloatDoubleEx {

	public static void main(String[] args) {
		// 부동소수점 오차
		// float 7자리 초과
		float f = 0.1234567F;
		System.out.println(f);
		
		float f2 = 1.12345678F;
		System.out.println(f2);
		
		// double 15자리 초과
		double d = 0.12345678912345;
		System.out.println(d);

		double d2 = 1.00000000000000008;
		System.out.println(d2);
	}

}
