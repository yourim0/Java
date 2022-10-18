package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest { //1012_Collection(Map) --1

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap() ; //제네릭으로 타입 정의. 지정된 타입 외 입력 불가  
		map.put("myid", "1234"); //map.put("myid", 1234); int 기본형 입력시 wrapper class 처리가 되어 Integer타입으로 변한다. 제네릭 정의 시 오류 발생 
		map.put("your", "1111");
		map.put("your", "3114"); 
		
		 //keySet() : 키값 전체를 반환하다.
		Set<String> keys = map.keySet();	
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		
		System.out.println("================");
		// values() : values 전체를 반환한다. 
		Collection<String> values = map.values();
		Iterator<String> itV = values.iterator();
		
		while(itV.hasNext()) {
			String value = itV.next();
			System.out.println(value);
		}
		//System.out.println(map); 
		
//		Scanner sc = new Scanner(System.in);
		
		
		//key 와 value를 전체 반환: map 인터페이스 내부 의 entry 인터페이스를 사용. 내부에 getkey, getvalue 가 포함되어 있다. 
		//<Stirng, String> 타입만 정의해주면 된다. 나머지는 정해진 문법.
		Set<Map.Entry<String, String>> entry = map.entrySet();
		Iterator<Map.Entry<String, String>> itE = entry.iterator();
		
		while(itE.hasNext()) {
			Map.Entry<String, String> ent = itE.next();
			String key = ent.getKey();
			String value = ent.getValue();
			
			System.out.println("[key]:" + key + ", [value]:" + value);
		
		}
		
		/* for(String key: map.keySet()) {
			System.out.println(key);
		}*/
		
		
		//for문 이용해 가져오기 
/*		for(Map.Entry<String, String> ent : map.entrySet()) {
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[key]:" + key + ", [value]:" + value);
		} */ 
		
		
		
		System.out.println(map);
		System.out.println(map.keySet().size());

		
		/*while(true) {
			System.out.println("아이디 입력: ");
			String id = sc.next();
			
			System.out.println("패스워드 입력: ");
			String password = sc.next();
			
			if(!map.containsKey(id)) { //key값이 존재하지 않는다면
				System.out.println("아이디가 존재하지 않습니다. 다시 입력하세요 :");
				continue;
			}else {
				if(!map.get(id).equals(password)) { //값을 가져오니까
				
				
					System.out.println("패스워드를 다시 입력하세요");
				}else {
					System.out.println("로그인 성공");
					break;
				}
			}
		}
		*/
		
	//	map.remove("myid"); //key 값에 해당되는 값이 삭제가 된다.
	//	System.out.println(map);
		
	}

}

//1. 키와 밸류가 쌍으로 이루어진다. pair구조
//2. 데이터 삽입 : put("key","value") 메소드 사용
//3. 아이디, 패스워드로 의미부여를 많이 한다.
//4. 키는 중복이 안되나, 값은 중복이 가능하다
//5. 키가 중복되는 데이터가 있을 때 마지막 데이터값을 저장한다. 
//6. 데이터 검색: get(key) -> value값 반환, ex) get("myid") ->"1234" 반환
//7. 키값의 존재유무 확인 containsKey(key) -> true, false 반환
//8. 데이터 삭제 : remove(key)
//9. keySet() : 키값 전체를 반환하다.
//10.values() : values 전체를 반환한다.