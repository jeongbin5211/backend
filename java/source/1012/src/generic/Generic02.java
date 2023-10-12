package generic;

// 상품 : 타입, 값
class Item<T, V> {
	private T t;
	private V v;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	
}

public class Generic02 {

	public static void main(String[] args) {
		// 1. 문자열, 숫자
		// Item<T, V>
		Item<String, Integer> item1 = new Item<>();
		item1.setT("의류");
		item1.setV(100000);
		
		System.out.println(item1.getT() + "의 가격은 " + item1.getV());
		
		// 2. 웹 -> 에러 코드 -> 500(서버), 400(프로그램), 200(성공)
		// 404, 요청하신 주소를 찾을 수 없습니다.
		Item<Integer, String> code = new Item<>();
		code.setT(404);
		code.setV("요청하신 주소를 찾을 수 없습니다.");
		
		System.out.println(code.getV() + "(" + code.getT() + ")");
	}

}
