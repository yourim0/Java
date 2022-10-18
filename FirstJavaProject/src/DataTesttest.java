
public class DataTesttest {

	public static void main(String[] args) {
//		//===============================================기본형 변수(기본형은 객체의 값자체를 넘긴 것)
//		Data d = new Data();
//		d.x = 10;
//		System.out.println(d.x);
//		
//		change(d.x); //d는 change함수로 넘어간 매개변수와 무관한 main 메소드의 지역변수
//		System.out.println(d.x); //따라서 호출한 쪽의 원본 데이터는 바뀌지 않는다. 지역변수이기 때문에 =값의 복사
//	
//	}
//
//
//	static void change(int x) { // 값 복사 -> change가 실행되면 x라는 매개변수가 생성되고 d.x의 값10으로 초기화.d.x는 관련이 없어짐. 
//	 x = 1000;
//	 System.out.println("change() : " + x);
		
		
		
		
//		//===============================================참조형 변수(참조형은 객체의 주소를 넘긴 것)
		//(메소드의 매개변수가 클래스 타입인 경우 : 주소를 복사)
		
		Data d = new Data();
		
		d.x = 10; //d는 주소값 .x는 그 주소값의 변수로 접근
		System.out.println(d.x);
		
		change(d); //메소드내에서 정의된 지역변수(ox100같은 Data class의 주소값)
		System.out.println(d.x);
	
		d.x = 5000;
		
		
}
	static void change(Data d) {// 매개변수 Data d는 주소값을 받는다 //여기 지역변수도 지역변수로 밖에서 사용할수 없다
		d.x=1000;
		System.out.println("change() : "+ d.x);
		//참조형은 주소값으로 해당 주소에 있는 객체자체의 값을 바꾸기 때문에 원래 x값 자체가 바뀜 
	}
}

