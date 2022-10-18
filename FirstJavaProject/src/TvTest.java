
public class TvTest {//0927

		//int sum; //멤버변수 : 클래스 단위 변수
		
	public static void main(String[] args) { //객체 생성은 main 클래스에서 한다.
		//블록단위가 클래스 영역에서 선언되는 변수 = 전역(멤버)변수 (Tv클래스의 멤버변수 는 사용할 수 없음)
		
	//	int sum =0; //지역변수 
	//	sum += 10; //연산 전 무조건 초기화가 되어있어야 함.
		
		
//		new Tv(); //메모리로 할당되어진 tv가 가진 멤버변수, 함수의 첫번째 주소값을 가짐.
		
		//참조연산자 : . 
//		new Tv().power = true; //Tv클래스 안에 있는 변수를 .연산자를 통해 참조
//		new Tv().channel = 10; //new 수만큼 Tv 수가 생성되는 것. 
		//이렇게 되면 각 다른 Tv가 만들어지는 것. 

		 Tv t = new Tv(); //만들어진 클래스를 타입으로 선언하고 변수명 넣음 : 참조변수(==주소값)
		//생성된 객체의 주소값을 가져오려면
	 	t.power = true; //참조변수.메소드
	 	t.channel = 10;
	 	//System.out.println(t.channel);
	 	t.ChannelDown(); //메소드 참조
		System.out.println(t.channel);
		
		Tv t2 = new Tv();//객체를 생성할 때마다 물리적으로 완전히 다른 주소값을 가지고 있음. 새로운 객체
		t2.channel = 20;
		System.out.println(t.channel);
		System.out.println(t2.channel);
		t2.ChannelDown();

		//t2 = t : t의 참조변수의 주소값을 t2에 넣는 경우 기존 t2의 메모리를 삭제 해주어야함 : garbage collection
		//치환되는 조건 : 두 참조변수의 타입이 동일한 경우만 가능
		t2=t; 
		System.out.println(t.channel);
		System.out.println(t2.channel);
		t.ChannelDown();
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		
		
	}

}
