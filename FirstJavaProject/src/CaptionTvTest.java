//10-04상속 
public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv  ctv = new CaptionTv();
		ctv.channel = 10;
		System.out.println(ctv.channel);
		ctv.ChannelDown();
		System.out.println(ctv.channel);
	
		
		ctv.caption = true;
		ctv.displayCaption("오늘의 날씨를 알려드립니다."); //자신거
		
		I3dtv idd = new I3dtv();
		idd.i3d = true; 
		idd.i3dPower();
	
		InternetTv itv = new InternetTv();
		itv.internet = true;
		itv.internetSwitch();
	} 

}
