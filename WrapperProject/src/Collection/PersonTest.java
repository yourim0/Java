package Collection;

import java.util.HashSet;
import java.util.Set;

public class PersonTest {
//set�� �ߺ��� �Ұ��ѵ� �ٸ���ü�� �ν��Ͽ� �ߺ� �ԷµǴ� ���� �������� 
	//hashcode, equals �������̵��� �ʿ�� �Ѵ�. 
	public static void main(String[] args) {

		Set<Person> set = new HashSet();

		set.add(new Person("Hongkil", 10));
		set.add(new Person("Hongkil", 10));
		
		System.out.println(set);
	}

}

