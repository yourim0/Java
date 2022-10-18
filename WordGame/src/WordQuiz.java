import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WordQuiz {
	private String name;
	private ArrayList<Word> w; //컬렉션 사용 1012_연습문제(WordQuiz)
	
	
	public WordQuiz(String name) {
		super();
		this.name = name;
	
		w = new ArrayList<Word>();
		
		w.add(new Word("love","사랑"));
		w.add(new Word("animal","동물"));
		w.add(new Word("emotion","감정"));
		w.add(new Word("human","인간"));
		w.add(new Word("stock","주식"));
		w.add(new Word("trade","거래"));
		w.add(new Word("society","사회"));
		w.add(new Word("baby","아기"));
		w.add(new Word("honey","꿀"));
		w.add(new Word("dall","인형"));
		w.add(new Word("bear","곰"));
		w.add(new Word("picture","사진"));
		w.add(new Word("painting","그림"));
		w.add(new Word("fault","오류"));
		w.add(new Word("example","보기"));
		w.add(new Word("eye","눈"));
		w.add(new Word("statue","조각상"));
		//배열을 이용한 매개변수 처리 방식
		}
	
	//보기 구성하기(랜덤 4개) 매개변수-정답번호 
	private int makeExample(int ex[], int answerIndex) { //ex:4개 크기의 빈배열과 0번(정답) 전달
		int n[] = {-1, -1, -1, -1};//보기 출력 위한 index번호로 활용 //0-16의 인덱스 번호가 들어갈것
		//int n[] = new int[4]; //0,0,0,0 이 초기값이라?
		int index;
		
//=========================================================		
	
		for(int i=0; i<n.length;i++) {//무조건 4번은 돌지만 같은 index 번호가 
			do {
				index = (int)(Math.random()* w.size()); //0~16 ex:1,5,9,6
				System.out.println("-----index----" + index);
			}while(index == answerIndex || exists(n, index)); //둘중 하나라도 true면 true / 정답과 같은 index번호 이거나, n 배열에 이미 들어있는 값이면 사용 불가판정
			//while문은 false일 때 종료 
			 //문제의 정답과 같아서도 안되고 || n과 같아서도 안된다.
			//ex: index1 이 answer index0 과 같지 않고
		
			n[i] = index; //while문에 해당안되면 넣어라 //,
		}
		
//=========================================================			
		
		
		for(int i =0; i<n.length;i++) {
			ex[i] = n[i]; //배열의 복사 ex[i]는 exists 가 호출되면 정답인덱스 보내줄고
		}
		return (int)(Math.random()*n.length); //0~3 ex 배열의 정답이 들어갈 위치값 2
		
	}
	
	
	//보기가 중복되지 않도록//받아온 주소값을 이용 n배열의 값과 인덱스 같은게 있는지
	private boolean exists(int n[], int index) { //ex:n배열과 1전달
		for(int i=0; i<n.length;i++) {
			if(n[i] == index) {
				return true;
			}
		}
		return false;
	}
	
	//게임 시작 하기 
	public void run() { 
		System.out.println("["+name+"]"+"의 단어테스트 게임 시작 | -1을 입력하면 게임 종료");
		System.out.println("현재" + w.size()+"개의 단어가 있습니다.");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int answerIndex = (int)(Math.random() * w.size()); //0-16사이의 값을 받으면 문제낼 영단어이자 정답 //ex:0
			String eng = w.get(answerIndex).getEnglish(); //키값으로 가져옴 //ex: eng = love
		
			int example[] = new int[4];
			int answerLoc = makeExample(example,answerIndex); //ex:빈배열과 0번 전달 /ex:2리턴
			
			example[answerLoc] = answerIndex;//정답위치값 //answerLoc -> 0~3 
			
			System.out.println(eng + "?");
			for(int i=0;i<example.length;i++) {
				System.out.println("("+(i+1)+")"+w.get(example[i]).getKorean()); //정답에 해당된다?
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
					System.out.println("정답입니다.");
				}else {
					System.out.println("분발하세요");
				}
			}catch(InputMismatchException e) { //숫자를 입력해야 하는데 문자를 입력한 경우 
				sc.next(); //buffer를 비워주는 역할이다.
				System.out.println("숫자를 입력하세요!");
			}
		}
	
		System.out.println("["+name+"]"+"를 종료합니다.");
	}



}
