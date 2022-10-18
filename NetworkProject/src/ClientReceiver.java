import java.io.DataInputStream; //1017 hashmap �̿�
import java.io.IOException;
import java.net.Socket;

public class ClientReceiver extends Thread {

	Socket socket;
	DataInputStream in; // �ޱ⸸

	public ClientReceiver(Socket socket) {
		super();
		this.socket = socket;
		
		try {
			in = new DataInputStream(socket.getInputStream());//stream����
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
