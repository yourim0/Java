//1013thread 방법1
public class Count extends Thread {  //자바가 만들어 놓은 Thread 클래스
//자바를 이용한 Thread 클래스를 상속받고
// run 메소드 안에 실행문을 넣으면 thread 클래스가 된다.
	
	@Override
	public void run() { //Thread클래스는 반드시 run메소드가 필요함
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //1초에 한번씩 실행하도록 설정 :쓰레드의 제어 
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	}

	//쓰레드의 제어 :1 sleep : 자동 timeout,2. wait notify()를 통해 다시 실행대기상태로 변경 해 주어야 한다. 3. suspend() - resume(잘쓰진 x)
	//notify 와 resume차이는 동기화 순서이다
}
