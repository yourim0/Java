import java.util.Scanner;

//0930 연습---2
public class BankApp { // 공급자 기능만 정의

	// account 정보 저장
	Account[] acc = new Account[100]; // -----------얘네도 다 참조형 멤버변수
	// 개인정보 받아서 account class로 넘겨주는 역할
	Scanner sc = new Scanner(System.in);

	// 무슨 업무를 볼지 선택하는 메소드. 모든 업무가 종료될때까지 반복적인 동작. <초기 화면>
	void info() {
		System.out.println("---------------------------------");
		System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
		System.out.println("---------------------------------");
		System.out.println("선택 : ");
	}

	// 계좌 개설 메소드
	void createAccount() {
		System.out.println("----------");
		System.out.println("계좌 생성 메뉴");
		System.out.println("----------");

		System.out.println("계좌번호 : ");
		String ano = sc.next();

		System.out.println("계좌주명 : ");
		String owner = sc.next();

		System.out.println("초기입금액 : ");
		int balance = sc.nextInt();

		System.out.println("이자율 입력 : ");
		double rate = sc.nextDouble();
		
		//중복계좌 확인
		if(findAccount(ano) != null) {
			System.out.println("이미 계좌가 존재합니다.");
			return;
		}
		
		// 계좌 생성 완료하기
		Account account = new Account(ano, owner, balance, rate);
		
		account.rateCal();

		// 생성된 계좌를 저장 //acc각 인덱스의 값이 null인지 확인 후 저장
		for (int i = 0; i < acc.length; i++) {
			if (acc[i] == null) {
				acc[i] = account;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}

		}
	}

	// 계좌 목록 보기 메소드
	
	void accountList() {
		System.out.println("-------------");
		System.out.println("계좌 목록 보기 메뉴");
		System.out.println("-------------");
		
		System.out.println("계좌번호    계좌주    입금액    이자율    출금가능액(이자)");

		for (int i = 0; i < acc.length; i++) {
			if (acc[i] == null) {
				break;
			}
			System.out.println(acc[i].getAno() + "    " + acc[i].getOwner() + "    " + acc[i].getBalance()+ "    " + acc[i].getRate()+"%   "+acc[i].getAmount());
		}

	}

	// 예금 기능 메소드 //****합산된 금액의 최종 이율계산
	void deposit() {
		System.out.println("----------");
		System.out.println("예금 기능 메뉴");
		System.out.println("----------");

		// 개설이 된 계좌인지 확인
		System.out.println("계좌번호 : ");
		String ano = sc.next();

		System.out.println("예금액 : ");
		int balance = sc.nextInt();

		Account account = findAccount(ano);

		// return 값으로 계좌 조회
		if (account == null) {
			System.out.println("계좌번호기 존재하지 않습니다.");
			return; // void 함수내에서 return은 함수 즉시 종료 / break는 반복문에 해당
		}


		//account.setBalance((account.getBalance() + balance)*(int)(account.getRate())); //이자곱한금액
		// 있으면 기존 금액에 더해주세요
		account.setBalance(account.getBalance() + balance);
		System.out.println("예금 처리가 정상적으로 되었습니다.");

	}

	// 출금기능
	void withdraw() {
		System.out.println("----------");
		System.out.println("출금 기능 메뉴");
		System.out.println("----------");

		System.out.println("계좌번호 :  ");
		String ano = sc.next();

		System.out.println("출금액 : ");
		int balance = sc.nextInt();

		Account account = findAccount(ano); // 계좌의 주소를 전달 받음

		if (account == null) {
			System.out.println("계좌번호가 존재하지 않습니다.");
			return;
		}

		if (account.getBalance() < balance) {
			System.out.println("예금액이 부족합니다");
			return;
		}

		account.setBalance(account.getBalance() - balance);
		System.out.println("출금 처리가 정상적으로 되었습니다.");

	}

	// 공통된 기능 : 계좌조회 (별도 메소드로 생성)

	Account findAccount(String ano) { // 반환값 타입이 Account 이기 때문에 void x
		// 배열에 들어있는 주소값의 타입은 Account객체
		Account account = null; // 지역변수는 초기화하여 사용

		for (int i = 0; i < acc.length; i++) {
			if (acc[i] != null) { // 반복횟수 최소화
				if (acc[i].ano.equals(ano)) { // 문자열 비교 함수 .equals()
					account = acc[i];
					break;
				}
			}
		}
		return account; // 실제 객체의 주소값
	}

}
