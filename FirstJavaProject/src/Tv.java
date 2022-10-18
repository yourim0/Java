
public class Tv { //0927
	//1004 상속
	//부모클래스 : 여러 자식클래스를 갖는다
	//		  : 단일 상속만 가능하다
	
	
	
	//속성(변수) : 크기, 전원버튼, 채널, 볼륨 , 색상, 모델, 제조사, 제조년도  등
	//기능(메소드) : on/off, 채널 up/down, 볼륨 up/down
	//class의 멤버변수는 기본값으로 초기화가 되어있다. 따라서 초기화 없이 사용 가능하다.
	
	
	
	boolean power; //전원버튼  0
	int channel; //채널           0
	int volumn;//볼륨              0
	String color; //색상         null
	String model; //모델
	int year;  //제조년도
	String company; //제조사
	
	
	//on/off, 채널 up/down, 볼륨 up/down 구현
	//메소드 구현
	void Power() { //전원 on/off
		power = !power; //true->false, false->true; 반대상태로 바뀌어 버리게
	}
	
	void ChannelUp() { //채널 up버튼
		channel++;
	}
	
	void ChannelDown() { //채널 down버튼
		channel--;
	}
	
	void volumnUp() {//채널 Up버튼
		volumn++;
	}
	
	void volumnDown() {//채널 down버튼
		volumn--;
	}

	//tv를 소개하는 메소드
	
	void showInfo() {
		System.out.println(model);
		System.out.println(year);
		System.out.println(company);
	}
	
}
