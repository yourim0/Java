import java.io.IOException;//1014 server-client 1:1ä��
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpChatClient {

	public static void main(String[] args) {

	try {
		Socket socket = new Socket("192.168.0.80", 7888); //ȣ�� �ϴ� ���� ������ ���ٸ� �ٷ� ����
		System.out.println("������ ���� �Ǿ����ϴ�.");
		
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
