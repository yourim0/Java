import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WordQuiz {
	private String name;
	private ArrayList<Word> w; //�÷��� ��� 1012_��������(WordQuiz)
	
	
	public WordQuiz(String name) {
		super();
		this.name = name;
	
		w = new ArrayList<Word>();
		
		w.add(new Word("love","���"));
		w.add(new Word("animal","����"));
		w.add(new Word("emotion","����"));
		w.add(new Word("human","�ΰ�"));
		w.add(new Word("stock","�ֽ�"));
		w.add(new Word("trade","�ŷ�"));
		w.add(new Word("society","��ȸ"));
		w.add(new Word("baby","�Ʊ�"));
		w.add(new Word("honey","��"));
		w.add(new Word("dall","����"));
		w.add(new Word("bear","��"));
		w.add(new Word("picture","����"));
		w.add(new Word("painting","�׸�"));
		w.add(new Word("fault","����"));
		w.add(new Word("example","����"));
		w.add(new Word("eye","��"));
		w.add(new Word("statue","������"));
		//�迭�� �̿��� �Ű����� ó�� ���
		}
	
	//���� �����ϱ�(���� 4��) �Ű�����-�����ȣ 
	private int makeExample(int ex[], int answerIndex) { //ex:4�� ũ���� ��迭�� 0��(����) ����
		int n[] = {-1, -1, -1, -1};//���� ��� ���� index��ȣ�� Ȱ�� //0-16�� �ε��� ��ȣ�� ����
		//int n[] = new int[4]; //0,0,0,0 �� �ʱⰪ�̶�?
		int index;
		
//=========================================================		
	
		for(int i=0; i<n.length;i++) {//������ 4���� ������ ���� index ��ȣ�� 
			do {
				index = (int)(Math.random()* w.size()); //0~16 ex:1,5,9,6
				System.out.println("-----index----" + index);
			}while(index == answerIndex || exists(n, index)); //���� �ϳ��� true�� true / ����� ���� index��ȣ �̰ų�, n �迭�� �̹� ����ִ� ���̸� ��� �Ұ�����
			//while���� false�� �� ���� 
			 //������ ����� ���Ƽ��� �ȵǰ� || n�� ���Ƽ��� �ȵȴ�.
			//ex: index1 �� answer index0 �� ���� �ʰ�
		
			n[i] = index; //while���� �ش�ȵǸ� �־�� //,
		}
		
//=========================================================			
		
		
		for(int i =0; i<n.length;i++) {
			ex[i] = n[i]; //�迭�� ���� ex[i]�� exists �� ȣ��Ǹ� �����ε��� �����ٰ�
		}
		return (int)(Math.random()*n.length); //0~3 ex �迭�� ������ �� ��ġ�� 2
		
	}
	
	
	//���Ⱑ �ߺ����� �ʵ���//�޾ƿ� �ּҰ��� �̿� n�迭�� ���� �ε��� ������ �ִ���
	private boolean exists(int n[], int index) { //ex:n�迭�� 1����
		for(int i=0; i<n.length;i++) {
			if(n[i] == index) {
				return true;
			}
		}
		return false;
	}
	
	//���� ���� �ϱ� 
	public void run() { 
		System.out.println("["+name+"]"+"�� �ܾ��׽�Ʈ ���� ���� | -1�� �Է��ϸ� ���� ����");
		System.out.println("����" + w.size()+"���� �ܾ �ֽ��ϴ�.");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int answerIndex = (int)(Math.random() * w.size()); //0-16������ ���� ������ ������ ���ܾ����� ���� //ex:0
			String eng = w.get(answerIndex).getEnglish(); //Ű������ ������ //ex: eng = love
		
			int example[] = new int[4];
			int answerLoc = makeExample(example,answerIndex); //ex:��迭�� 0�� ���� /ex:2����
			
			example[answerLoc] = answerIndex;//������ġ�� //answerLoc -> 0~3 
			
			System.out.println(eng + "?");
			for(int i=0;i<example.length;i++) {
				System.out.println("("+(i+1)+")"+w.get(example[i]).getKorean()); //���信 �ش�ȴ�?
			}
			//break;
			System.out.println(":>");
			
			try {
				int in = sc.nextInt();
				if(in == -1) {
					break;
				}
				in--;
				if(in == answerLoc) {
					System.out.println("�����Դϴ�.");
				}else {
					System.out.println("�й��ϼ���");
				}
			}catch(InputMismatchException e) { //���ڸ� �Է��ؾ� �ϴµ� ���ڸ� �Է��� ��� 
				sc.next(); //buffer�� ����ִ� �����̴�.
				System.out.println("���ڸ� �Է��ϼ���!");
			}
		}
	
		System.out.println("["+name+"]"+"�� �����մϴ�.");
	}



}
