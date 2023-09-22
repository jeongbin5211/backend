package tut0922.shopping;

public class ShopEx {

	public static void main(String[] args) {

		// 판매자로 회원가입 -> 판매자 승인 -> 상품 등록(여러 개)
		
		// 허정빈만 쓸 수 있는 List 배열 공간 생성
		Seller seller = new Seller(10001, "허정빈");
		
		
		seller.addItem("삼성 노트북", 1000000, 10);
		seller.addItem("무선 마우스", 5000, 100);
		
		seller.showMemberInfo();
		
		System.out.println("\n---------------------------\n");
		
		Seller seller2 = new Seller(10002, "박박박");
		System.out.println("");
		
		
		seller2.addItem("LG 노트북", 1000000, 10);
		
		seller2.showMemberInfo();
		
	}

}
