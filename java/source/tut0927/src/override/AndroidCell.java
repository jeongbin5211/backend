package override;

public class AndroidCell extends Cell {

	@Override
	void On() {
		System.out.println("안드로이드 운영체제를 시작합니다.");
	}

	@Override
	void Off() {
		System.out.println("안드로이드 운영체제를 종료합니다.");
	}
	
}
