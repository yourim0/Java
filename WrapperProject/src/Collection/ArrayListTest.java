package Collection; //1011 제네릭과 컬렉션
//arraylist :Constructs an empty list with an initial capacity of ten.

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
			ArrayList list = new ArrayList(); //기본크기는 10개, 부족하면 사이즈를 자기가 알아서 늘림 // 기본 Object 형변환
			
			
			/*list.add("1"); //Appends the specified element to the end of this list.
			list.add("1"); //기본형은 넣을 수 없다. 
			list.add(new Integer(1)); //기본형을 참조형으로 바꾸는 wrapper 역할 후 넣을 수 있다. 
			list.add(1);//오토박싱으로 가능*/ 
	
			//추가
			list.add("1"); //String 으로 들어가지만 -> Object 형변환이 발생한다. 
			list.add("2");
			list.add("3");
			list.add("4");
			list.add("5");
			//list.add(new String("5"); 원래 형식
			
			//인덱스로 값 가져오기
			System.out.println(list.get(0));//Returns the element at the specified position in this list.
			//원래타입으로 캐스팅 해주어야 함.
			String str = (String)list.get(0);
			System.out.println(str);
			
			
			int sum =0;
			for(Object obj : list) {
				String str1 = (String)obj;
				System.out.println(str1);
				int num = Integer.parseInt(str1); //wrapper클래스 활용 문자형을 숫자로 변환
				sum += num;
			}

			System.out.println("sum = " + sum);
	
			for(int i=0;i<list.size();i++) {//데이터가 들어있는 실제 크기반환. 
				System.out.println(list.get(i));
			}
			
			//삭제 
			list.remove(1);
			
			for(int i=0;i<list.size();i++) { 
				System.out.println(list.get(i));
			}
}
	}
