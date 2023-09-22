package tut0922.shopping;

import java.util.ArrayList;
import java.util.List;

public class Seller {
	private int memberID;
	private String memberName;
	List<Item> list = null;
	
	
	// 생성자
	
	public Seller(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
		
		list = new ArrayList<Item>();
	}
	
	
	// 상품추가 메소드
	public void addItem(String itemName, int itemPrice, int itemStock) {
		Item item = new Item();
		
		item.setItemName(itemName);
		item.setItemPrice(itemPrice);
		item.setItemStock(itemStock);
		
		list.add(item);
	}
	
	// 매개변수 가져오기
	
//	public void addItem2(Item item) {
//		
//	}
	
	
	// 판매자정보출력 메소드
	public void showMemberInfo() {
		for (Item info : list) {
			System.out.println("판매자 아이디 : " + memberID + " 판매자 이름 : " + memberName + " 상품명 : " + info.getItemName() + " 상품 가격 : " + info.getItemPrice() + " 상품 재고 : " + info.getItemStock());
			System.out.println("--------------------");
		}
		System.out.println(list.size() + "개의 상품이 등록 되었습니다.");
	}
	
}
