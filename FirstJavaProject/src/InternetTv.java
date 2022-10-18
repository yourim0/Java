	//1004 상속
public class InternetTv extends Tv {
	boolean internet;

	void internetSwitch() {
		if (internet) {
			System.out.println("인터넷 사용 가능");
		}
	}

}
