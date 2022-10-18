import java.io.DataOutputStream; //1017 hashmap �̿�
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientSender extends Thread {

	Socket socket;
	DataOutputStream out;
	String name;

	public ClientSender(Socket socket, String name) {
		super();
		this.socket = socket;
		this.name = name;

		try {
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);

		try {
			if (out != null) {
				out.writeUTF(name); // Ư���Ǵ� ������ ������ ������ ���� �޼ҵ� //�г���
			}
			while (out != null) {
				out.writeUTF("[" + name + "]" + sc.nextLine()); //����ä��
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
