package com.java.polymorphism; //1005-3 다형성 //객체의 다형성은 상속을 전제로 한다. 캐스팅 불가

public class CarTest {

	public static void main(String[] args) {
		//일반적 객체 생성 
//		FireEngine fe = new FireEngine();
//		Ambulance ab = new Ambulance();
		
/*		
		//다형성을 적용한 객체 생성
		// 참조형의 형변환:참조할 수 있는 멤버의 갯수가 변한다.
		Car car = null; 	//부모타입 변수선언 
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null; //참조형 변수의 초기화. 기본값이 null
		//명싲거 형변환 : 업캐스팅, 다운캐스팅
		//fe.water();
		car = fe; //자동형변환 //원래 앞뒤 변수의 타입일치 x -> 데이터 사용불가(ex) double <- int , 상속구조에서만 타입이 클래스 인경우 부모가 - 큰타입, 자식 - 작은타입으로 판단
		//Car = FireEngine 같은 주소값이 넘어가지만, 주소값이 가진 타입이 선언된 변수 car의 Car타입으로 변함. 
		//car.water();
		car.stop();//따라서 car클래스의 stop은 사용 가능, fe클래스의 water메소드는 사용하지 못한다. 
		
		
		
		//fe2 = car; //부모타입을 작은타입인 자식 타입을 넣을 수 없다.
		fe2 = (FireEngine)car; //  -> 강제 형변환으로 사용
		fe2.water();//타입이 car -> FireEngine 타입으로 바뀌었기 때문에. 결국 다 같은 주소값 바라보는것 
	*/
		
		
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		
		Car car = new Car();
		car.doWork(ab);
		car.doWork(fe);
	}

}
