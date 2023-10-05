package JdbcEx05;

public class Items {
	private int itemId;
	private String itemName;
	private int itemPrice;
	private int itemStock;
	private String itemDate;
	
	// getter, setter
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		
		if (itemName.length() < 1) { // 예외처리
			System.out.println("잘못된 상품 이름 입니다."); 
		}
		
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		
		if (itemPrice < 0) { // 예외처리
			this.itemPrice = 0;
		}
		
		this.itemPrice = itemPrice;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		
		if (itemStock < 0) {
			this.itemStock = 0;
		}
		
		this.itemStock = itemStock;
	}
	public String getItemDate() {
		return itemDate;
	}
	public void setItemDate(String itemDate) {
		this.itemDate = itemDate;
	}
	
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemStock="
				+ itemStock + ", itemDate=" + itemDate + "]";
	}
	
	
}
