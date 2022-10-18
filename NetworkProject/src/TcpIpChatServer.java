import java.io.IOException;//1014 server-client  1:1채팅
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpChatServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7888);
			System.out.println("서버가 실행됨");
			socket = serverSocket.accept(); //client socket과 server socket 연결되는 부분
			 //소켓을 여러개 설정하면 다자간 채팅이 가능해진다.
			
			
			Sender sender = new Sender(socket);
			sender.start();
			
			Receiver receiver = new Receiver(socket);
			receiver.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
