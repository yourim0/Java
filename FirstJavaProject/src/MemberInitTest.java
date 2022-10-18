
public class MemberInitTest { //0929 ----8 초기화 블럭

	public static void main(String[] args) {
		//초기화가 먼저 진행되고 생성자가 호출된다. (static - instance - 생성자)
		MemberInit mi = new MemberInit(88,99);
		//static 초기화는 같은 타입의 경우 첫 한번만 동작한다. 
		//MemberInit mi2 = new MemberInit(101,102);
		
			
	}

}
 