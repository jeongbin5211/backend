package inheritance;

class Phone {
//	private String model;
//	private String color;
	String model;
	String color;
	
	public Phone() {}
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void On() {
		System.out.println("전원을 켭니다.");
	}
	
	void Off() {
		System.out.println("전원을 끕니다.");
	}
	
	void disp() {
		System.out.println("모델 : " + model + ", 색상 : " + color);
	}
}

class AddCompany extends Phone {
	private String company;
	
	public AddCompany(String model, String color, String company) {
		super(model, color); // 부모페이지에서 가져오기
		this.company = company;
	}
	
	void disp() {
		System.out.println("제조사 : " + company + ", 모델 : " + model + ", 색상 : " + color );
	}
}

public class InherEx04 {

	public static void main(String[] args) {
		// 생성자를 이용해서 모델, 색상을 저장 후 출력
		Phone phone = new Phone("iPhone-X", "white");
		phone.On();
		phone.disp();
		phone.Off();
		
		System.out.println("------------------------");
		// model, color, company -> 생성자
		
		AddCompany add = new AddCompany("Galaxy", "black", "samsung");
		
		add.On();
		add.disp();
		add.Off();
		
	}

}
