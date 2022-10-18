//1013thread 방법2
public class Count2 implements Runnable{

	@Override
	public void run() {
	for(int i=10; i>0; i--) {
		System.out.println(i);
		try {
			Thread.sleep(1000); //1초에 한번씩 실행하도록 설정
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//인터페이스는 추상메소드이기 때문에 무조건 run메소드 오버라이딩 해야한다.
	}

}
