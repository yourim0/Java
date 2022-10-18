import java.io.IOException;//1014 server-client 1:1채팅
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpChatClient {

	public static void main(String[] args) {

	try {
		Socket socket = new Socket("192.168.0.80", 7888); //호출 하는 순간 문제가 없다면 바로 접속
		System.out.println("서버에 연결 되었습니다.");
		
		Sender sender = new Sender(socket);
		sender.start();
		
		Receiver receiver = new Receiver(socket);
		receiver.start();
		
	} catch (UnknownHostException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}

}
