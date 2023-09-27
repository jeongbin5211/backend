package override;

public class AppleCell extends Cell {

	@Override
	void On() {
		System.out.println("IOS 운영체제를 시작합니다.");
	}

	@Override
	void Off() {
		System.out.println("IOS 운영체제를 종료합니다.");
	}
	
}
