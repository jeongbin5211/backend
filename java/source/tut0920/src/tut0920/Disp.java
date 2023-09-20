package tut0920;

public class Disp {
	public void title() {
		System.out.println("코리아아이티 아카데미");
	}
	
	public void title(String str) {
		System.out.println(str);
	}
	
	public String close() { // 프로그램 종료 
		return "프로그램 종료";
	}
	
	public String close(String str) {
		return str;
	}
}
