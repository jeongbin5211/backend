
public class Ex3_3 {

	public static void main(String[] args) {
		
		String jumin = "001234-1234567";
		
		char gender = jumin.charAt(7);
		
		if (gender == '1' || gender == '3') {
			System.out.println("남자");
		}else if(gender == '2' || gender == '4') {
			System.out.println("여자");
		}else {
			System.out.println("주민등록번호를 확인하세요.");
		}
		
		
		
		

	}

}
