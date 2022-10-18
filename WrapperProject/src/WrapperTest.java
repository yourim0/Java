import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import Collection.Student;


public class WrapperTest { //1011Wrapper Class

	public static void main(String[] args) {
		//Wrapper Class: �⺻���� �������� ����ȯ(�ڽ�, ��ڽ�) ����ڽ�
		//�ڽ� : �⺻�� -> ������
		//��ڽ� : ������ -> �⺻�� 
	
		/*
		
		int i = 10; //�⺻���� ���������� ��ȯ
		Integer intg = i; //�ڽ� (Integer)i; new Integer(i)
		
		Integer intg2 = new Integer(10);
		int i2 = intg2; //�ּҰ��� int���� �߰��Ѵ� =>��ڽ�
		
		System.out.println(intg + i2);
		
		
		Object obj = (Object)i; //�⺻���� �ڽ��� �� �ִ�.
		//int i3 = obj; //��ڽ��� �Ұ��ϴ�
		
		String str = "50"; //"a50"�϶� a�� ó���� �� ����  numberformatexception ���� �߻�
		//���ڿ��� ���ڷ� �ٲ�
		int i4 = Integer.parseInt(str); //integer.parseint ���־��� Ŭ���� 
		System.out.println(i4); */
	
	/*	
		// list�� ����ü�̸鼭 vector Ŭ������ ���
		//stack ������ Ȱ�� : LIFO 1-2-3
		Stack st = new Stack();
		st.push("1");
		st.push("2");
		st.push("3");
	
		//�����͸� �о���� �޼ҵ� 3-2-1 �������� �� �����͸� ������� 
		try {
		System.out.println((String)st.pop());
		System.out.println((String)st.pop());
		System.out.println((String)st.pop());
		System.out.println((String)st.pop());//java.util.EmptyStackException stack�� ���� ���� �� �߻��ϴ� ���� 
		}catch(EmptyStackException e) {
			System.out.println("Stack�� ����ֽ��ϴ�."); 
		} */
	
//		while(!st.empty()) {
//			System.out.println((String)st.pop());
//		}
	
		
		/*
		ArrayList list = new ArrayList();
		
		list.add("1"); //String -> Object ����ȯ
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//iterator(�ݺ��� ���� - �������̽�)
	
	
		Iterator it = list.iterator();
		
		while(it.hasNext()){ //������ ���� ���� Ȯ��
			String str = (String)it.next(); //���� ������ ���� ����
			System.out.println(str); */
		
	
		
	/*
		//���׸�(Ÿ������) :�����͸� ���� ���� Ÿ���� �̸� ���س��´� 
		//�÷��� ��ü�� ������ Ÿ���� �����Ѵ�. 
		ArrayList<String> list = new ArrayList<String>();
		//ArrayList<Integer> list = new ArrayList<Integer>();
		list.add("1"); //String -> Object ����ȯ
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		// list.add(1); integer�ȵ� 
	
		list.get(0); //stringŸ������ �о��
		
		//Iterator it = list.iterator();
		
		Iterator<String> it = list.iterator(); //Ÿ�� �����ϰ� ����  �÷��ǿ� ���׸��� �����ϴ°� 
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		}*/
		
		
		
		//hashƯ¡�� setƯ¡�� ������ 
		//Set : ������ ���� ������ ����, �ߺ��Ǵ� �� �Է� �Ұ�
		
/*		
		//HashSet set = new HashSet();
		//���׸� ����
		HashSet<String> set = new HashSet<String>();
		
		//Ÿ���� �ٸ��� �ٸ� �����ͷ� �ν�
		set.add("1");
		set.add("2");
		set.add("1");
		set.add("4");
		//set.add(new Integer(1)); //������� �� �� �ƴϴ�.
		
		System.out.println(set);
				
//		for(Object obj : set) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			//String str = (String)it.next();
			String str = it.next(); //���׸� ����� ĳ���� ���� �ʾƵ� ������
		}
		
		*/
		
	/*	
		Set<Integer> set = new HashSet<Integer>(); //�θ�Ÿ���� set���� �� ����
	
		//���� �ߺ� ���� ������ �ֱ� ���� 
		
		int[][] bingo = new int[5][5];
		
		for(int i=0; set.size()<25 ; i++) {//set.size()�θ� �ϸ� �ߺ��Ǹ� �ȵ��� ������ 25�� �ȵ�� �� �� ����
			set.add((int)(Math.random()*50)+1); 
				
		}
		
		//System.out.println(set);
		
		//���� �����ִ� ���
		ArrayList list = new ArrayList(set);//���ñ���� arraylist�� �ֱ� ������ (collection) 
		Collections.shuffle(list); 
	
		Iterator<Integer> it = list.iterator();
		
		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				bingo[i][j] = it.next(); 
			}
		}
		
		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				System.out.print(bingo[i][j] +" "); //1~2���� 1���ڸ��� ���̰� ������ �� ������ �ʴ´�
			}
		System.out.println();
		} */
		
		
		//TreeSet : Ʈ�������� �÷����� ������ Ư¡ :
		//���� ���ĵǾ�����.
		//�ݵ�� ������ ���Ǵ� �ش� Ŭ���� �ȿ��� ���� ������ �������̵� �Ǿ��־�� �Ѵ�.
		//implements Comparable (Integer,String)
		
	/*	
		TreeSet set = new TreeSet();
		set.add(new Integer(2)); //����ڽ��� �Ǿ ������ ��. wrapper Ÿ������ �����
		set.add(5);
		set.add(1);
		set.add(4);
		set.add(3);
	
		System.out.println(set);
		
		Iterator it = set.iterator(); //Ÿ�� �����ϰ� ����  �÷��ǿ� ���׸��� �����ϴ°� 
		
		while(it.hasNext()) {
			Integer intg = (Integer)it.next();
			System.out.println(intg);
		}
		*/
		
		
		//student Ŭ������ compareto �������̵� ������ ���� 
		TreeSet<Student> set = new TreeSet<Student>();
		
		Student s1 = new Student("kim", 9,1,10,10,10);
//		Student s2 = new Student("pim", 3,1,10,10,10);
//		Student s3 = new Student("gim", 4,1,10,10,10);
//		Student s4 = new Student("him", 7,1,10,10,10);
		Student s5 = new Student("qim", 1,1,10,10,10);
		
		set.add(s1);
//		set.add(s2);
//		set.add(s3);
//		set.add(s4);
		set.add(s5);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Student s = (Student) it.next(); //ĳ���� : �⺻object Ŭ������ �Ѱ��ֱ⶧��
			System.out.println(s.toString());
			
		}
	}
	}
