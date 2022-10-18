
public class Product {//0929 ----9 초기화 블럭의 사용
	static int count = 0;
	int serial;
	
	//인스턴스 블럭에서 스태틱 사용가능
	{
		++count; //static은 값이 공유되니까 
		serial = count;
	}
	
	
}
