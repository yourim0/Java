package Collection; //1011_Comparable �������̽� ����

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student implements Comparable { //comparable �������̽� 

	
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
	
	//tree ����� �������� ���ı��ذ��� ���ص��� ������ �ƿ� ������ �߻��Ѵ�. 
	@Override //Ÿ��üũ�� ���� student���� Ȯ��
	//treeSet ���������� ȣ���ϴ� �޼ҵ�. ����ȣ��x (treeSet�� student��ü�� ���� ��)
	//�� �۾��� ������ treeSet�� ���� �� ����. 

	
	public int compareTo(Object o) {
		if(o instanceof Student){
			Student tmp = (Student)o;
			return tmp.ban - this.ban;//��������
			//return this.ban - tmp.ban;//�������� 0 : ���� �� , ��� : ���� ���� ū��, ���� : ���ǰ��� ū��
		} //������ ���� 
		
		
		return -1;//�׳� �⺻�������ϴ� �� 
	}

}
