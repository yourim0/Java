package stringProject; //1007 string class ���� 

public class StringTest {
	public static void main(String[] args) {
		
		//charAt()
		//subString()
		//indexOf()
		//equals()
		//valueOf()
		
		
		
	
	//	1.String str1 = "abc"; //String�� ���� ���ڿ��� ������ �ٸ� �ּҰ��� �ƴ� ������ �ּҰ��� �����Ѵ�. 
		String str2 = "abc";
		
		//���� ��� ���
		String str3 = new String("abc"); //�ٸ� ���� �޾ƾ� �Ҷ��� �̷��� �����ϳ�, �� ���� �ʴ´�.
		String str4 = new String("abc");
		
		//���ڿ� ��
	//	str3 == str4 ==> ���ڰ��� �ƴ� �ּҰ��� ���ϴ� ��. 
		if(str3 == str4) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		} //�ٸ��� ���
		
		// ���� ���ڿ� �� 
		if(str3.equals(str4)) { //"abc".equals("abc") ���� �����񱳵� �����ϴ�.
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		} //���� ���
	
		
				
				/*
		System.out.println(str1.hashCode());
		
	
		String str1 = "abc"; 
		String str2 = "def";
		
		str1 = str1 + str2; //"abcdef" --> �ּҰ��� ������ ������ str1�� ����Ű�°��� �ƴ϶� ���ο� �޸𸮿� �Ҵ�Ǿ� �ּҰ��� ���Ѵ�. 
		*/
		
		
		
		/*		String fileName = "Hello.java";//���ڸ��� �ε��� ��ȣ�� ������. 
		
		//���̿� ������� �����ϰ� ���� ��
		//Ư�� ���ڸ� �����ϴ� ��ġ�� ��ȯ(�ε���) : .indexOf()
		int index = fileName.indexOf('.');
		System.out.println(fileName.substring(0,index));
		System.out.println(fileName.substring(index + 1));*/
		
	
		
						
		//���ڿ� �ڸ��� : charAt()
/*		char a = fileName.charAt(2);
		System.out.println(a);
		//��ü ���� �� ���ھ� ���
		for(int i=0;i<fileName.length();i++) {
			System.out.println(fileName.charAt(i));
			}
			*/
		
		//���ϴ� �κп��� ���ڿ� �ڸ���  : substring
		/*		String str = fileName.substring(0,5); //�����ε���, ���ε���
		System.out.println(str); //Hello
		String str2 = fileName.substring(6,10); 
		System.out.println(str2);
		String str3 = fileName.substring(3); //������ ����ϰ� ������ ���� �ε����� ����ȴ�. 
		System.out.println(str3); */
		
		//���ڸ� ���ڷ� ��ȯ�����ش�. : valueOf
		int x = 10;	
		String str = String.valueOf(x); 
			
			
		
		//String bufferŬ���� - stringŬ������ ���� ����ϴ�
	//���ο� �޸� �Ҵ��� �ƴ� �����޸𸮿� �����ؼ� �޸� �����ս��� �ξ� ����
		
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		sb.append("def");
		System.out.println(sb);
		
		
		
		
	}
}
