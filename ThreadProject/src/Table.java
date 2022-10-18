import java.util.ArrayList;

//1013thread 연습문제 2 (notify-wait : 반드시 동기화가 정의 된 메소드에서만 쓸 수 있다. )
public class Table {
	String[] dishNames = { "donut", "donut", "burger" }; // 요리사가 쓸 재료
	final int MAX_FOOD = 6; // 더이상 만들지 못하게 상수로 정의?

	private ArrayList<String> dishes = new ArrayList<String>(); // 접시역할

	// 접시에 음식정보를 담아 접시에 추가 하는 메서드
	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) { //true동안 반복
			String name = Thread.currentThread().getName();
			System.out.println(name + "waiting");
			//6개를 다 만들면 wait
			
			try {
				wait();//요리사 run 메소드 실행못하게. 예외선언 되어있기 때문에 try catch 해줭야한당
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		dishes.add(dish);
		notify();//****다 만들엇다고 다시 고객한테 알려줌  
		System.out.println("Dished : " + dishes.toString()); //접시정보가 같이나옴
	}//while문 종료 

	// 서로 noti를 해주어야 실행대기 상태로 갈 수 있다.
	// 음식을 다먹으면 빼는 메소드
	public synchronized void remove(String dishName) {
		String name = Thread.currentThread().getName();
		
		//음식이 채워져 있을 땐 패스
		while(dishes.size() == 0) { //요리사에게 음식만들으라고 전달.
			System.out.println(name + " is wating");
		
			try {
				wait();//예외선언 되어있기 때문에 try catch 해줭야한당
				Thread.sleep(500); //0.5초간 대기상태 가지고 있다 (요리를 만들 시간을 주는 것)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//음식이 채워져 있을 때 실행 
		while(true) {
			for(int i=0;i<dishes.size();i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i); //먹을 수 있는게 나오면 먹어 
					notify(); //음식 6개를 다 먹기까지 기다리는 것이 아님. 먹었다고 채우라고 요리사한테 말해라**** 
					return; //cooker가 wait상태면 알려줄거고, 아니면 무시당할 것 
				}
			}
			
			try { //뒤졌는데 내가 먹을 게 없어. 도넛만 6개이거나 내가 먹을 수 있는게 없을때??
				System.out.println(name + "is waiting");
				wait();
				Thread.sleep(500); //0.5초간 대기상태 가지고 있다 (요리를 만들 시간을 주는 것)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	// 현재 배열의 크기 반환메서드(재료의 개수)
	public int dishName() {
		return dishNames.length;
	}

}
