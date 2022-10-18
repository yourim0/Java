package Collection; //1011_Comparable 인터페이스 정렬

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student implements Comparable { //comparable 인터페이스 

	
	String name;
	int ban;
	int no;
	int kor,eng,math;
	

	int getTotal() {
		return kor + eng + math;
	}
	
	float getAvg() {
		return getTotal() / 3.0f;
	}
	
	//tree 방식은 데이터의 정렬기준값을 정해두지 않으면 아예 오류가 발생한다. 
	@Override //타입체크를 통한 student인지 확인
	//treeSet 내부적으로 호출하는 메소드. 직접호출x (treeSet에 student객체를 넣을 때)
	//이 작업이 없으면 treeSet에 넣지 도 못함. 

	
	public int compareTo(Object o) {
		if(o instanceof Student){
			Student tmp = (Student)o;
			return tmp.ban - this.ban;//내림차순
			//return this.ban - tmp.ban;//오름차순 0 : 같은 값 , 양수 : 앞의 값이 큰값, 음수 : 뒤의값이 큰값
		} //반으로 정렬 
		
		
		return -1;//그냥 기본값설정하는 것 
	}

}
