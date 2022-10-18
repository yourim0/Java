package HashMap;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest { //1012_Properties

	public static void main(String[] args) {
		
		
		//Properties : k -> String, v -> String (타입을 하나로 강제)
/*		Properties prop = new Properties();
		
		
		//중복을 허용하지 않는다.
		
		prop.setProperty("myid", "1234");
		prop.setProperty("qwer", "1244");
		prop.setProperty("qwer", "1111");
		
		//getProperty value 값을 반환. 들어간 타입 그대로 
		//String value = prop.getProperty("myid");
		//System.out.println(value);
	
		Enumeration e = prop.propertyNames(); //Enumeration : boolean 타입을 반환(현재의 커서 이후에 요소들이 있는지 여부를 체크)
		while(e.hasMoreElements()){  //true일때
			String element = (String)e.nextElement(); //String밖에 없어서 제네릭 필요없다. 
			String value = prop.getProperty(element);
			System.out.println(value);
			}
		*/
		
		
		//파일과 연결된 데이터를 읽어오기
		
		Properties prop = new Properties();
		
		//1.로딩작업(위치 알려주기) - 예외처리 해야함
		try {
			prop.load(new FileInputStream("input.txt")); //load에 예외선언이 되어있기 때문에 반드시 예외처리 해주어야 한다.
		}catch(IOException e) { //파일을 못찾을 때 발생
			System.out.println("지정한 파일이 없습니다.");
			System.exit(0); //프로그램 강제 종료 명령어
		}
	
		String name = prop.getProperty("name"); //txt파일의 name의 문자열 값이 데이터로 넘어온다. //Hong Kil Dong
		String[] data = prop.getProperty("data").split(","); //패턴값 지정해서 쪼개서 가져옴 -> String의 1차원 배열로 반환
		
		
		
		//이름 max min sum 평균 구하기
		 
		int max = 0;
		int min = 0;
		int sum = 0;
		
		//System.out.println(name);

		
		for(int i = 0; i < data.length;i++) {
			int value = Integer.parseInt(data[i]);
			if(i==0) {
				max = min = value;
			}
			
			if(max < value) {
				max = value;
			}else if(min>value) {
				min = value;
			}			
			sum += value;
		
			}
		
		
		
	/*		//min값 구하기 추가
			min = max;
			
			for(int i=0;i<data.length;i++) {
				int value = Integer.parseInt(data[i]);
				
				if(min>value) {
					min = value;
				}
			}
		*/
		
		
		System.out.println("이름 " + name + " min " + min+" max "+max+" sum "+sum+" 평균 "+(double)sum / data.length);
		
		//문자열 -> 숫자는 : Integer.parseInt(문자열);
		//숫자 -> 문자 : String.valueOf(숫자)
		



		}
	
}
