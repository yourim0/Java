import java.util.Random;
import java.util.Scanner;

public class LoopTest { // 0921 �ݺ���

	public static void main(String[] args) {
		// �ݺ��� : ���๮�� ������ �����ϰ� �Ѵ�.
		// for, while, do-while(���� �� �Ⱦ�)

//		for(�ʱ⹮; ���ǽ�; ������) {
//			���๮
//		}

//		for(int i=0; i<10; i++) {
//			System.out.println(i + "Hello");
//		}
//		System.out.println();

//		for(int i =0; i<10; i+=2) { //0,2,4,6,8 �ټ����� ����
//			System.out.println(i + " : hello");
//		}

//		for(int i=10;i>0;i--) {
//			System.out.println(i + " : hello");
//		}

//		for(;true;) { // ������ �׻� true�̱� ������ ���� �ݺ�
//			System.out.println("hello");
//		}

//		int k = 1;
//		for(int i=1; i<=10;i++) {
//			System.out.println(k++);
//		}

		// 1���� 10������ �������� ¦���� ���

//		for(int i=1; i<=10;i++) {
//			if(i%2 == 0) {
//			System.out.println(i);
//			}
//		}

		/*
		 * int k = 0; for(int a=1;a<=10;a++) { k = k+a; System.out.println(k); }
		 */

		// 1~10 ������ ������ Ȧ���� �հ� ¦������ ���ؼ� ���
		// �ݺ��� �ϳ�

		/*
		 * int a=0; int b=0;
		 * 
		 * for(int i=1;i<=10;i++) { if(i%2==0) { a += i; }else { b += i; } }
		 * System.out.println("Ȧ����:"+a+"¦����:"+b);
		 */

		/*
		 * i�� 6�� ����ΰ�� 6�ǹ�� ���, Ȧ����� Ȧ�� ���, �׿� ��� x int i = 12;
		 * 
		 * if (i % 2 == 0) { if (i % 3 == 0) { System.out.println("6�ǹ��"); } else {
		 * System.out.println(""); } } else { System.out.println("Ȧ��"); }/*
		 * 
		 * // while��
		 * 
		 * /* int j = 1; while(j<=10) { System.out.println(j); j++; }
		 * 
		 * 
		 * int o = 10; while(o > 0){ System.out.println(o); o--; }
		 * 
		 * int sum = 0; int p =1; while(i <= 10) { sum += p; System.out.println(sum); }
		 */

		// while���� ���� ����
		// while(true){
		// System.out.println("hello");
		// }

		/*
		 * boolean flag = true; int cnt = 0; while(flag) { //cnt++;
		 * //System.out.println(cnt); if(cnt > 100) { flag = false; //flase�� �ٲ�� ���� }
		 * //cnt++; //System.out.println(cnt); }
		 */

		// ��ø for�� i*j���ݺ�
		/*
		 * int k =1;
		 *  for (int i = 0; i < 5; i++) {
		 *   for (int j = 0; j < 5; j++) {
		 * System.out.println(i+","+j);
		 *  } 
		 * }
		 */

		// ������ ����ϱ�

//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + "x" + j + "=" + (i * j));
//			}
//		}
		
		// ���� ���� ���߿� ����
//		for (int l = 1; l < 10; l++) {
//			for (int f = 2; f < 10; f++) {
//				System.out.print(f + "x" + l + "=" + (f * l) + " ");
//			}
//			System.out.println();
//		}

		//while���� ��ø5*5
//		int i =0;
////		int j =0; //while�� �ȿ��� �ʱ�ȭ �ؾ���
//		int b=1;
//		
//		while(i<5) { //j���� while�� �ۿ� ����,�ʱ�ȭ�ϸ� �ٱ� while�� �� ������ j�� �ʱ�ȭ���� �ʾƼ� ��������
//			int j =0; 
//			while(j<5) {
//				System.out.println(b++);
//				j++;
//			}
////			System.out.println(i);
//			i++;
//		}
		//System.out.println(i+","+j);
		
		
		
		
		//������, �����α����� ���
//		int i =2;
//		//int j =1;
//		
//		while(i<10) {
//			int j =1; 
//			while(j<10) {
//				System.out.println(i+"*"+j+"="+(i*j));
//				j++;
//			}
//			i++;
//		}

		
//		//�����α����� ���
//		
//		int i =1; 
//		
//		while(i<10) { //��
//			int j =2; 
//			while(j<10) { //����
//				System.out.print(j+"*"+i+"="+(j*i)+" ");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
	//��� ����1
		//	for(int i=0, j=10; i<10; i++, j--) {
	//		System.out.println("i:"+i+"  j:"+j);
	//	}
		
		//��� ����2 ---		�ݺ������� ����� ������ ��� �ۿ��� ������ �� ���� : ��������. �ۿ��� ���� ������ int i;������ ���� �س����� ��� �� �� �ִ�
//		int s = 0;
//		int i; //�ݺ������� ����� ������ ��� �ۿ��� ������ �� ���� : ��������. �ۿ��� ���� ������ int i;������ ���� �س����� ��� �� �� �ִ�
//		
//		for(i=0; i<10;i++,s++) { //�ʱ�ȭ�� for�� �ȿ���.(int i-0->i=0;)
//			System.out.println("i : "+i+"  s : "+s);
//		}
//		System.out.println(i);
		
		
		//do while��
		
//		int i =11;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<=10);
//	

		//���� 1+(1+2)+(1+2+3)---------(1+2+3+----+10)���
		
//		int a=0;
//		int b=0;
//		int c=0;
//		
//		for(int i=1;i<11;i++) {			
//			a = a+i; //1,2,3,4,5....
//			b = b+a;//1,1+2,
//			}
//		System.out.println(b);
//		
		
		//2
		
//		int sum = 0;
//		int tot = 0;
//		for(int x=1;x<=10;x++) {
//			sum += x; //(0+1)(0+1+2)(0+1+2+3)(0+1+2+3+4)
//			tot += sum;
//		} 
//		System.out.println(sum);//55
//		System.out.println(tot);//220	
		
		
		
		
		
	//do while�� ��ø���� �߾Ⱦ�
//		do {
//			do {
//				
//			}while();
//		}while();
		
	
		//�ݺ����� ���� : break(�ݺ����� ��������), continue
		//���ǹ� ������ ���. 
		
//		for(int i=1;i<=10;i++) {
//			if(i > 5) {
//				break;
//			}
//			System.out.println(i);
//		}
		
//		int k=1;
//		for(int i =0;i<5;i++) {
//			System.out.println("i= "+i);
//			for(int j=0;j<5;j++) {
//				System.out.println("k=:"+k++);
//				if(k % 3 == 0){
//					break;
//				}
//
//			}
//		}
		
		//�ݺ����� ���� : continue -----------------------------------------0922
//		for(int i=1;i<=10;i++) {
//			if(i%2 ==1) {
//				continue;
//			}
//			System.out.println(i); //���忡 ���� ����� ����
//		}
		
		//12345 -> 1+2+3+4+5 -> 15
		
		//��� �ݺ��ؾ����� �𸣴ϱ� while�� ��õ
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int sum = 0;
//		
//		while(num > 0) {
//			sum += num % 10;
//			num = num / 10;
//		}
//		System.out.println(sum);
		
		//%, /�� �ݺ�
		//12345 % 10 => 5
		//12345/ 10 => 1234
		//1234%10 -> 4
		//1234%10 -> 123
		
		//num>0 �ɶ�����
		
		
		
		//�պ��� ����
		
		
		//������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�. ��, x�� y�� �����̰� ������ ������
		//0<=x<=10, 0<=y<=10 �̴�. 
		//������ :
		//x=1, y=2
		//x=3, y=1
		//x=5, y=0
		
//		
//		for(int i=0;i<=10;i++) {
//			for(int j = 0; j<=10;j++) {
//				if((2*i) + (4*j) == 10) {
//					System.out.println("i="+i+"j="+j);
//
//						}
//			}
//		}
		
		
		//1+(-2)+3+(-4)+...�� ���� ������ ������ �� ����� ���ؾ� ������ 100�̻�(�Ѿ�� ù���� ����)�� �Ǵ��� ����ϼ���.
		
		
	//if((a-b)>=100) {
	//System.out.println("100����");
		
		//¦���� ���� //Ȧ���� ������ �� - ¦���� �������� = 100
//		int sum =0;
//		int s =1;
//		int num = 0;
//		int i;
//		for(i =1;true;i++,s=-s) { //�ݺ����۾���
//			num = s * i;
//			System.out.println("num"+num);
//			sum += num;
//			System.out.println("sum"+sum);
//			if(sum >=100) {
//				break;
//			}
//		}
//		
		//���ѹݺ����� ����������
	/*	Scanner sc = new Scanner(System.in);
		int sel;
		while(true) {
			System.out.println("��ȣ�� �����ϼ���");
			System.out.println("1.������ 2. ��� 3.�Ķ��� 4.����");
			sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("����������");
			}else if(sel ==2) {
				System.out.println("�������");
			}else if(sel == 3) {
				System.out.println("�Ķ�������");
			}else if(sel == 4) {
				break;
			}
	
	}*/
		
		
		//���� �̱� �� ���� �ϴ� ���������� 
		//���� (����): math.random() 0.0 <= r <1.0 (0.0~0.999~)
		
		//System.out.println(Math.random());
		//Math.random () * 10 -> 0.0 -> 9.9999
		//(int)Math.random () * 10 -> 0-9
		//(int)Math.random () * 10 + 1 -> 1-10
		
		//System.out.println((int)(Math.random()*10) +1);
		//(int)(Math.randon()*�����ǰ���(������ �ִ밪 -������ �ּҰ�)) + ������ �ּҰ�
		//(int)(Math.randon()*3)+1 
	
		//��ȸ 3��, 3������ 1���̶� ���߸� ����
/*		int com;
		int me;	
		int random =(int)(Math.random()*3)+1 ;
		int wincnt = 0; //�̱��
		int challenges = 0; //��ü����Ƚ��
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			if(challenges == 3) {
				System.out.println("3����ȸ ��� ����ϼ̽��ϴ�.");
				break;
			}
			
			com = random;
			System.out.println("1.���� 2.���� 3.�� : ");
			me = sc.nextInt();
			
			int result = com - me;
			
			if(result == -1 || result ==2) {
				wincnt++;
				System.out.println("you win");
				if(wincnt == 2) {
					break; 
				}
				break;
			}else if(result == 0){
				challenges++;
				System.out.println("tie break");
			}else {
				challenges++;
				System.out.println("you lose");
			}
				
		}*/
		

		
		//Random random = new Random();
		//System.out.println(random.nextInt(3)+1);
		
		
		
		/*	System.out.println("com : "+ com + " me: "+me);
			if(com == me) {
				System.out.println("����.");
				}else if((com == 1 && me == 2) || (com == 2 && me ==3) || (com == 3 && me ==1)){
					System.out.println("���� win");
					break;
				}else if((com == 1 && me == 3) || (com == 2 && me ==1)|| (com == 3 && me ==2)){
				System.out.println("���� lose");
				}else {
					
				} */
		

		for(int i=4;i>1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}System.out.println("");
		}

		
		
			
		}

}


