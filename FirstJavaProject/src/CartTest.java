
public class CartTest {//0927


	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	System.out.println(Card.cv); //스태틱변수는 생성없이 클래스명으로 참조가 가능하다.
//								//c1으로 생성되기 전 메모리에 할당된다.
//	
//	Card c1 = new Card();
//	c1.iv = 10;
//	
//	
//	Card c2 = new Card();
//	c2.iv = 20;
//	
//	//인스턴스 변수인 iv는 각각 별도의 값을 가짐
//	System.out.println("c1.iv : "+c1.iv);
//	System.out.println("c2.iv : "+c2.iv);
//	
//	System.out.println("c1.cv : "+c1.cv);
//	System.out.println("c2.cv : "+c2.cv);
//	
//	//스태틱변수의 값은 공유 된다. 
//	c1.cv = 80;
//	
//	System.out.println("c1.cv : "+c1.cv);
//	System.out.println("c2.cv : "+c2.cv);
//	
//	c2.cv = 200;
//	System.out.println("c1.cv : "+c1.cv);
//	System.out.println("c2.cv : "+c2.cv);
//	
//	
	
		Card c1 = new Card();
		c1.number = 1;
		c1.kind = "heart";
	
		Card c2 = new Card();
		c2.number = 3;
		c2.kind = "spade";
		
		System.out.println(c1.number);
		System.out.println(c1.kind);
		
		System.out.println(c2.number);
		System.out.println(c2.kind);
		
		System.out.println(Card.height);
		System.out.println(Card.width);
	}

}
