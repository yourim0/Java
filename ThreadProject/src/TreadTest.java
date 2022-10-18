import javax.swing.JOptionPane;

public class TreadTest { //1013thread 

	public static void main(String[] args) {
		//프로그램 -> 프로세스 (실행) ->쓰레드(여러 동작들을 동시에 돌아가는 것 : 멀티쓰레드) -> 멀티쓰레드 동작 : 멀티태스크
		//모든 프로그램은 기본적으로 쓰레드가 동작 (1개 이상의 쓰레드가 있다)
		//쓰레드 만드는 방법
		//1.Thread 클래스를 상속
		//2.Runnable 인터페이스를 상속 
		
		
		//원쓰레드???
/*		for(int i = 0;i<10;i++) { //순차실행
			System.out.println(i);
		}
		
		for(int j=0;j<10;j++) {
			System.out.println(j);
		} */
	
		
		
		//멀티 쓰레드 방식
		//다른 쓰레드 클래스르 생성
		//thread 클래스 직접 상속받은 경우 : 
	/*	Count cnt = new Count();
		cnt.start(); //run 이 아닌 start라는 메소드를 호출해야 독립된 쓰레드로서 동작함. */
		
		// 인터페이스 runnable 상속받은 경우:
		
		//Count2 cnt2 = new Count2();
		//부모타입으로 타입 생성해도 된다.
		/*			Runnable r  = new Count2();
		Thread cnt2 = new Thread(r);//start메소든느 thread클래스꺼다. Thread클래스 생성자의 매개변수를 넣으면 
		cnt2.start();  
		
		
	
		String input = JOptionPane.showInputDialog("아무값이나 입력"); //값을 입력후 엔터하지 않으면 코드 진행이 안되는 방식.
		System.out.println("입력값은" + input + "입니다.");
	*/
	
		
		/*Threadex5 th = new Threadex5(); //세로찍기
		th.start();
		
		for(int i=0;i<500;i++) { //가로찍기 메인 쓰레드 
			System.out.print("-");
		}*/
	
	
		
		
		//Thread 클래스 상속 : 클래스를 직접생성
		//Runnable 인터페이스 상속: 
		//-2번의 생성의 과정을 거친다. 
		//-클래스 생성후 다시한번 Thread클래스의 생성자를 사용해서 다시한번 생성한다. 
		//- 다중상속을 하는 경우 사용한다.
		
		
		//Thread의 제어 
		//Thread.sleep(1000) ->스레드의 일시정지
		//wait() -> 쓰레드의 일시정지 / notify() -> 쓰레드를 실행대기
		
		
		
		
		
		Runnable r = new Thread6();
		Thread th1 = new Thread(r, "*"); //"스레드의 이름지정"
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r, "***"); //main쓰레드까지 총 4개의 쓰레드가 돈다. 
		
		th1.start();
		th2.start();
		th3.start(); //쓰레드는 코드 순서에 따라 실행 순서가 정해지는 것은 아니다. - start와 stop 만
		//jvm에 의해 쓰레드의 동작이 정해진다
		
		try {
			Thread.sleep(2000); //현재 자신을 호출한 thread를 호출한다. (일시정지)
			//여기서sleep 은 main함수에서 호출하는 것. main thread -> main 함수 -> sleep 순서로 호출
			//th 123는 상관없이 돈다.
			th1.suspend(); //스레드 일시정지 메소드
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();//suspend되어있던 Thread를 실행 대기상태로 변경 
			Thread.sleep(3000);
			th2.resume();
			Thread.sleep(3000);
			th1.stop(); //th1이 먼저인지 th2가 먼저 stop될지는 모른다. 
			th2.stop();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//main
		//th1.suspend는 2초뒤 멈추고 
		//th2.suspend는 최소 4초뒤 멈춤
		
		
		
		
			
	}	

}
