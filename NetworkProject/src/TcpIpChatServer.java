import java.io.IOException;//1014 server-client  1:1ä��
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpChatServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7888);
			System.out.println("������ �����");
			socket = serverSocket.accept(); //client socket�� server socket ����Ǵ� �κ�
			 //������ ������ �����ϸ� ���ڰ� ä���� ����������.
			
			
			Sender sender = new Sender(socket);
			sender.start();
			
			Receiver receiver = new Receiver(socket);
			receiver.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
