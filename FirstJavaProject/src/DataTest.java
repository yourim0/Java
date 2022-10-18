
public class DataTest {//0928-2  //class이기 때문에 멤버변수, 함수 정의 가능
	//메소드의 매개변수가 기본형인지, 참조형인지에 따라 값을 보내는지 주소값을 보내는지 다름
	public static void main(String[] args) { 
		

		
		//=========================================================//리턴타입을 참조형으로 갖는 메소드
		Data d = new Data(); //ex.5x100이라는 주소값이 있다
		d.x =10;			//			-5x200(x)
		
		Data d2 = copy(d);//Data타입을 가진 변수를 보내야 하니까 d
		
		//참조하는 위치가 다르다
		System.out.println(d.x);
		System.out.println(d2.x);
	}
	

		//=========================================================//리턴타입을 참조형으로 갖는 메소드(참조형을 리턴할 땐 반드시 return 있어야함)
		static Data copy(Data d) { //d는 주소값
			
			Data tmp = new Data(); //각각 main-d, copy-tmp 가지는 지역변수
			tmp.x = d.x;
			
			return tmp; //tmp가 가지고 있던 5x200주소값이 return
		}
	
	
}
