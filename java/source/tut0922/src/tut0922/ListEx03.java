package tut0922;

import java.util.ArrayList;
import java.util.List;

// 접근 제한자 : public > protected > default > private
// 클래스에서는 public 과 default만 사용가능 -> default 는 같은 클래스 내에서만 사용가능?

class Item {
	private Long itemNum;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	
	// 생성자
	public Item() {}
	
	public Item(Long itemNum, String itemName, int itemPrice, int itemStock) {
		this.itemNum = itemNum;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}
	
	public void itemDisp() {
		System.out.println("상품번호 : " + itemNum + " 상품명 : " + itemName + " 가격 : " + itemPrice + " 재고 : " + itemStock);
	}

}

class ItemDao {
	
	public List<Item> getItems() {
		List<Item> aList = new ArrayList<>();
		
		aList.add(new Item(10001000L, "사과", 1000, 10)); // 고정배열 초기화 arr[i] = new Item(); 와 같은 의미
		aList.add(new Item(20001000L, "복숭아", 1500, 20));
		aList.add(new Item(30001000L, "바나나", 1200, 30));
		
		return aList;
	}
	
}


public class ListEx03 {

	public static void main(String[] args) {
		// 객체(Item) : 상품번호, 상품명, 가격, 재고
		
		// ItemDao 로 이동
//		List<Item> aList = new ArrayList<>();
//		
//		aList.add(new Item(10001000L, "사과", 1000, 10)); // 고정배열 초기화 arr[i] = new Item(); 와 같은 의미
//		aList.add(new Item(20001000L, "복숭아", 1500, 20));
//		aList.add(new Item(30001000L, "바나나", 1200, 30));
		
		ItemDao dao = new ItemDao();
		
		
//		System.out.println("등록된 상품은 " + aList.size() + "개 입니다.");
//		System.out.println("for1 상품 출력\n");
//		
//		for(int i = 0; i < aList.size(); i++) {
//			
//			
//			aList.get(i).itemDisp();
//		}
		
		System.out.println("for2 상품 출력\n");
		for (Item item : dao.getItems()) {
			item.itemDisp();
		}
		
		// dao.getItems 변수로 받아서 넣기
		
		List<Item> list = dao.getItems();
		
		System.out.println("for2 상품 출력\n");
		for (Item item : list) {
			item.itemDisp();
		}
		

	}

}
