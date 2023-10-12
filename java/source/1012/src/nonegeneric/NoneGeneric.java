package nonegeneric;

class Fruit {
	
	void fruit() {
		System.out.println("과일입니다.");
	}
	
}

// 과일을 상자에 저장하는 클래스
class FruitBox {
	
	private Fruit fruit;

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	
	
}

class Pencil {
	void pencil() {
		System.out.println("연필입니다.");
	}
}

class PencilBox {
	private Pencil pencil;

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
	
}

public class NoneGeneric {

	public static void main(String[] args) {
		FruitBox fb = new FruitBox();
		fb.setFruit(new Fruit());
		System.out.println(fb.getFruit());
		
		System.out.println("----------------------------");
		
		PencilBox pb = new PencilBox();
		pb.setPencil(new Pencil());
		System.out.println(pb.getPencil());
	}

}
