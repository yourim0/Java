
public class CartTest {//0927


	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	System.out.println(Card.cv); //����ƽ������ �������� Ŭ���������� ������ �����ϴ�.
//								//c1���� �����Ǳ� �� �޸𸮿� �Ҵ�ȴ�.
//	
//	Card c1 = new Card();
//	c1.iv = 10;
//	
//	
//	Card c2 = new Card();
//	c2.iv = 20;
//	
//	//�ν��Ͻ� ������ iv�� ���� ������ ���� ����
//	System.out.println("c1.iv : "+c1.iv);
//	System.out.println("c2.iv : "+c2.iv);
//	
//	System.out.println("c1.cv : "+c1.cv);
//	System.out.println("c2.cv : "+c2.cv);
//	
//	//����ƽ������ ���� ���� �ȴ�. 
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
