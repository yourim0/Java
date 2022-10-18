import java.io.IOException; //1017 hashmap �̿�
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpIpMultiChatClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�г��� �Է�: ");
		String nickName = sc.next();

		try {
			Socket socket = new Socket("192.168.0.80", 7888);
			System.out.println("������ �����");
			Thread sender = new Thread(new ClientSender(socket,nickName));
			Thread receiver = new Thread(new ClientReceiver(socket));
			
			sender.start();
			receiver.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
