package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest { //1012_Collection(Map) --1

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap() ; //���׸����� Ÿ�� ����. ������ Ÿ�� �� �Է� �Ұ�  
		map.put("myid", "1234"); //map.put("myid", 1234); int �⺻�� �Է½� wrapper class ó���� �Ǿ� IntegerŸ������ ���Ѵ�. ���׸� ���� �� ���� �߻� 
		map.put("your", "1111");
		map.put("your", "3114"); 
		
		 //keySet() : Ű�� ��ü�� ��ȯ�ϴ�.
		Set<String> keys = map.keySet();	
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		
		System.out.println("================");
		// values() : values ��ü�� ��ȯ�Ѵ�. 
		Collection<String> values = map.values();
		Iterator<String> itV = values.iterator();
		
		while(itV.hasNext()) {
			String value = itV.next();
			System.out.println(value);
		}
		//System.out.println(map); 
		
//		Scanner sc = new Scanner(System.in);
		
		
		//key �� value�� ��ü ��ȯ: map �������̽� ���� �� entry �������̽��� ���. ���ο� getkey, getvalue �� ���ԵǾ� �ִ�. 
		//<Stirng, String> Ÿ�Ը� �������ָ� �ȴ�. �������� ������ ����.
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
		
		
		//for�� �̿��� �������� 
/*		for(Map.Entry<String, String> ent : map.entrySet()) {
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[key]:" + key + ", [value]:" + value);
		} */ 
		
		
		
		System.out.println(map);
		System.out.println(map.keySet().size());

		
		/*while(true) {
			System.out.println("���̵� �Է�: ");
			String id = sc.next();
			
			System.out.println("�н����� �Է�: ");
			String password = sc.next();
			
			if(!map.containsKey(id)) { //key���� �������� �ʴ´ٸ�
				System.out.println("���̵� �������� �ʽ��ϴ�. �ٽ� �Է��ϼ��� :");
				continue;
			}else {
				if(!map.get(id).equals(password)) { //���� �������ϱ�
				
				
					System.out.println("�н����带 �ٽ� �Է��ϼ���");
				}else {
					System.out.println("�α��� ����");
					break;
				}
			}
		}
		*/
		
	//	map.remove("myid"); //key ���� �ش�Ǵ� ���� ������ �ȴ�.
	//	System.out.println(map);
		
	}

}

//1. Ű�� ����� ������ �̷������. pair����
//2. ������ ���� : put("key","value") �޼ҵ� ���
//3. ���̵�, �н������ �ǹ̺ο��� ���� �Ѵ�.
//4. Ű�� �ߺ��� �ȵǳ�, ���� �ߺ��� �����ϴ�
//5. Ű�� �ߺ��Ǵ� �����Ͱ� ���� �� ������ �����Ͱ��� �����Ѵ�. 
//6. ������ �˻�: get(key) -> value�� ��ȯ, ex) get("myid") ->"1234" ��ȯ
//7. Ű���� �������� Ȯ�� containsKey(key) -> true, false ��ȯ
//8. ������ ���� : remove(key)
//9. keySet() : Ű�� ��ü�� ��ȯ�ϴ�.
//10.values() : values ��ü�� ��ȯ�Ѵ�.