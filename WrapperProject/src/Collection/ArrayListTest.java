package Collection; //1011 ���׸��� �÷���
//arraylist :Constructs an empty list with an initial capacity of ten.

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
			ArrayList list = new ArrayList(); //�⺻ũ��� 10��, �����ϸ� ����� �ڱⰡ �˾Ƽ� �ø� // �⺻ Object ����ȯ
			
			
			/*list.add("1"); //Appends the specified element to the end of this list.
			list.add("1"); //�⺻���� ���� �� ����. 
			list.add(new Integer(1)); //�⺻���� ���������� �ٲٴ� wrapper ���� �� ���� �� �ִ�. 
			list.add(1);//����ڽ����� ����*/ 
	
			//�߰�
			list.add("1"); //String ���� ������ -> Object ����ȯ�� �߻��Ѵ�. 
			list.add("2");
			list.add("3");
			list.add("4");
			list.add("5");
			//list.add(new String("5"); ���� ����
			
			//�ε����� �� ��������
			System.out.println(list.get(0));//Returns the element at the specified position in this list.
			//����Ÿ������ ĳ���� ���־�� ��.
			String str = (String)list.get(0);
			System.out.println(str);
			
			
			int sum =0;
			for(Object obj : list) {
				String str1 = (String)obj;
				System.out.println(str1);
				int num = Integer.parseInt(str1); //wrapperŬ���� Ȱ�� �������� ���ڷ� ��ȯ
				sum += num;
			}

			System.out.println("sum = " + sum);
	
			for(int i=0;i<list.size();i++) {//�����Ͱ� ����ִ� ���� ũ���ȯ. 
				System.out.println(list.get(i));
			}
			
			//���� 
			list.remove(1);
			
			for(int i=0;i<list.size();i++) { 
				System.out.println(list.get(i));
			}
}
	}
