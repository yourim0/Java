import java.io.DataInputStream;//1014 server-client
import java.io.IOException;
import java.net.Socket;

public class Receiver extends Thread {

	Socket socket;
	DataInputStream in;
	
	
	
	public Receiver(Socket socket) {
		super();
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void run() {

	while(in != null) { //stream�� null�϶� ������ ����
		try {
			System.out.println(in.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	}

}
