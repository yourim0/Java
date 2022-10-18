import java.net.*; //1017 hashmap �̿�
import java.io.*;
import java.util.*;

public class TcpIpMultiChatServer {
   HashMap clients;
   
   TcpIpMultiChatServer() {
      clients = new HashMap();
      Collections.synchronizedMap(clients);
   }

   public void start() {
      ServerSocket serverSocket = null;
      Socket socket = null;

      try {
         serverSocket = new ServerSocket(7888);
         System.out.println("������ ���۵Ǿ����ϴ�.");

         while(true) {
            socket = serverSocket.accept();
            System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"���� �����Ͽ����ϴ�.");
            ServerReceiver thread = new ServerReceiver(socket);
            thread.start();
         }
      } catch(Exception e) {
         e.printStackTrace();
      }
   } // start()

   void sendToAll(String msg) {
      Iterator it = clients.keySet().iterator(); 
      
      while(it.hasNext()) {
         try {
            DataOutputStream out = (DataOutputStream)clients.get(it.next());
            out.writeUTF(msg);
         } catch(IOException e){}
      } // while
   } // sendToAll

   public static void main(String args[]) {
      new TcpIpMultiChatServer().start();
   } 
   
   
   class ServerReceiver extends Thread { //���� Ŭ���� ��� 
      Socket socket;
      DataInputStream in;
      DataOutputStream out;

      ServerReceiver(Socket socket) {
         this.socket = socket;
         try {
            in  = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
         } catch(IOException e) {}
      }

      public void run() {
         String name = "";
         try {
            name = in.readUTF();
            sendToAll("#"+name+"���� �����̽��ϴ�.");

            clients.put(name, out);
            System.out.println("���� ���������� ���� "+ clients.size()+"�Դϴ�.");

            while(in!=null) {
               sendToAll(in.readUTF());
            }
         } catch(IOException e) {
            // ignore
         } finally {
            sendToAll("#"+name+"���� �����̽��ϴ�.");
            clients.remove(name);
            System.out.println("["+socket.getInetAddress() +":"+socket.getPort()+"]"+"���� ������ �����Ͽ����ϴ�.");
            System.out.println("���� ���������� ���� "+ clients.size()+"�Դϴ�.");
         } // try
      } // run
   } // ReceiverThread
} // class