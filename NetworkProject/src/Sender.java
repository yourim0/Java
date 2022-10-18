import java.io.DataOutputStream;//1014 server-client
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Sender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;
	
	
	public Sender(Socket socket) {
		super();
		this.socket = socket;
		
		try {
			out = new DataOutputStream(socket.getOutputStream()); //통신통로
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
  		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void run() {
		Scanner sc  = new Scanner(System.in);
		
		while(out!= null) { //outputstream이 살아있는동안 (server나 client가 종료되면 null로 바뀜)
		try {
			out.writeUTF(name + sc.nextLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
		
	}



}
