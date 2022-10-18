
public class ProductTest { //0929 ----9 초기화 블럭의 사용
	//생성자를 호출하면 생성자가 호출되기 직전에 초기화 블럭이 호출된다.

	public static void main(String[] args) {

		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("총 생성된 객체의 수 : "+ Product.count);
		System.out.println("p1은 "+p1.serial + "생성됨");
		System.out.println("p2은 "+p2.serial + "생성됨");
		System.out.println("p2은 "+p3.serial + "생성됨");
		
	}

}
