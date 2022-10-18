
public class TimeTest { //0927

	public static void main(String[] args) {
		Time t1, t2, t3; //변수 선언
//		Time t1 = new Time
		

//		t1 = new Time(); //동일한 작업 하는데 걸린시간
//		t1.hour = 10;
//		t1.minute = 29;
//		t1.second = 33;
//		
//		t2 = new Time();
//		t2.hour = 3;
//		t2.minute = 45;
//		t2.second = 11;
//		
//		t3 = new Time();
//		t3.hour = 5;
//		t3.minute = 15; 
//		t3.second = 53;
		
		
		Time[] time = new Time[3]; //참조형 변수를 사용하여 배열생성
		
		for(int i=0;i<time.length;i++) { //객체 한번에 생성
			time[i] = new Time();
		}
		
		//time[0] = new Time(); //인덱스 0번째에 객체 생성
		time[0].hour = 10;
		time[0].minute =29;
		time[0].second =33;
		
		//time[1] = new Time();//인덱스 1번째에 객체 생성
		time[1].hour = 3;
		time[1].minute = 45;
		time[1].second = 11;
	
		//time[2] = new Time();//인덱스 2번째에 객체 생성
		time[2].hour = 5;
		time[2].minute = 15;
		time[2].second = 53;
	
	
		// x시x분x초로 출력
		//1
		for(int i=0;i<time.length;i++) {
			System.out.println(time[i].hour + "시" + time[i].minute+"분"+time[i].second+"초");
			
		}System.out.println();
	
		//2
		for(Time t : time) { //배열 time의 길이만큼 반복 (Time 클래스자료형)
			System.out.println(t.hour + "시" + t.minute+"분"+t.second+"초");
		}
	
	}

}
