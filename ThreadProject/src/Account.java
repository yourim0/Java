import lombok.Getter;
import lombok.Setter;

//1013thread 연습문제 1

@Getter
@Setter
public class Account {
	private int balance=1000;
	
	//동기화 처리 전
	//출금기능
	/*	public void withdraw(int money) {
	/*	if(balance >= money) { //동기화 : 순서를 지켜서 사용하게 한다.  
			//쓰레드는 서로를 기다려주지 않음. 값을 경쟁함
			//1초의 텀을두고 돈이 빠져나가고 차감이 되도록 설정 
			//Thread클래스가 아니기 때문에 자신이 아닌 호출하는 쪽에서 걸릴 것
			try {
				Thread.sleep(1000); //th1이 if문 실행되고 출금을 1초 대기하는 도중 th2가 들어와버려서 -가 발생한다. //-> 동기화 처리로 해결해준다. 
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			balance -= money;
		} */
		
	
	
	
	//동기화 처리 후
		public/* synchronized*/ void withdraw(int money) { //1. 타입앞에synchronized 추가 = 잠금 : 특정 메소드를 사용하지 못하게 하는 것 
		
			synchronized(this) { //2. 1번보다 범위가 넓다. class자체의 멤버들 전체가 락이 걸린다.
			if(balance >= money) { //동기화 : 순서를 지켜서 사용하게 한다.  
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			balance -= money;
		} // -> 풀어주는 위치
	}
		}
	
}
