
public class Thread6 implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName()); //쓰레드의 이름을 출력한다
			try {
				Thread.sleep(1000); //일초간격으로 실행(1초뒤 실행대기상태가 먼저 되기때문에 정확히 1초는 아닐수있음)
			}catch(InterruptedException e) { //sleep 메소드에 예외선언되어있음
				e.printStackTrace();
			}
		
		}
	}

}
