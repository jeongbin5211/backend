package override;

public class CellEx {

	public static void main(String[] args) {
		
		AndroidCell android = new AndroidCell();
		android.On();
		android.Off();
		
		System.out.println("-------------------------");
		
		AppleCell apple = new AppleCell();
		apple.On();
		apple.Off();

	}

}
