import java.io.DataInputStream; //1017 hashmap 이용
import java.io.IOException;
import java.net.Socket;

public class ClientReceiver extends Thread {

	Socket socket;
	DataInputStream in; // 받기만

	public ClientReceiver(Socket socket) {
		super();
		this.socket = socket;
		
		try {
			in = new DataInputStream(socket.getInputStream());//stream생성
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void run() {
		while(in != null) {
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	

}
