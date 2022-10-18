package HashMap;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest { //1012_Properties

	public static void main(String[] args) {
		
		
		//Properties : k -> String, v -> String (Ÿ���� �ϳ��� ����)
/*		Properties prop = new Properties();
		
		
		//�ߺ��� ������� �ʴ´�.
		
		prop.setProperty("myid", "1234");
		prop.setProperty("qwer", "1244");
		prop.setProperty("qwer", "1111");
		
		//getProperty value ���� ��ȯ. �� Ÿ�� �״�� 
		//String value = prop.getProperty("myid");
		//System.out.println(value);
	
		Enumeration e = prop.propertyNames(); //Enumeration : boolean Ÿ���� ��ȯ(������ Ŀ�� ���Ŀ� ��ҵ��� �ִ��� ���θ� üũ)
		while(e.hasMoreElements()){  //true�϶�
			String element = (String)e.nextElement(); //String�ۿ� ��� ���׸� �ʿ����. 
			String value = prop.getProperty(element);
			System.out.println(value);
			}
		*/
		
		
		//���ϰ� ����� �����͸� �о����
		
		Properties prop = new Properties();
		
		//1.�ε��۾�(��ġ �˷��ֱ�) - ����ó�� �ؾ���
		try {
			prop.load(new FileInputStream("input.txt")); //load�� ���ܼ����� �Ǿ��ֱ� ������ �ݵ�� ����ó�� ���־�� �Ѵ�.
		}catch(IOException e) { //������ ��ã�� �� �߻�
			System.out.println("������ ������ �����ϴ�.");
			System.exit(0); //���α׷� ���� ���� ��ɾ�
		}
	
		String name = prop.getProperty("name"); //txt������ name�� ���ڿ� ���� �����ͷ� �Ѿ�´�. //Hong Kil Dong
		String[] data = prop.getProperty("data").split(","); //���ϰ� �����ؼ� �ɰ��� ������ -> String�� 1���� �迭�� ��ȯ
		
		
		
		//�̸� max min sum ��� ���ϱ�
		 
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
		
		
		
	/*		//min�� ���ϱ� �߰�
			min = max;
			
			for(int i=0;i<data.length;i++) {
				int value = Integer.parseInt(data[i]);
				
				if(min>value) {
					min = value;
				}
			}
		*/
		
		
		System.out.println("�̸� " + name + " min " + min+" max "+max+" sum "+sum+" ��� "+(double)sum / data.length);
		
		//���ڿ� -> ���ڴ� : Integer.parseInt(���ڿ�);
		//���� -> ���� : String.valueOf(����)
		



		}
	
}
