import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {


    String[] adviceList = {"Take smaller bites","Do something"};
   public void go(){
       try {
               ServerSocket serverSocket = new ServerSocket(8050);

               while (true) {
                   Socket socket1 = serverSocket.accept();
                   PrintWriter writer = new PrintWriter(socket1.getOutputStream());
                   String advice = getAdvice();
                   writer.println(advice);
                   writer.close();
                   System.out.println(advice);
               }

       }
       catch (Exception e){
           e.printStackTrace();
       }
   }
   private String getAdvice(){
       int random = (int) (Math.random() * adviceList.length);
       return adviceList[random];
   }
   public static void main(String args[]){
       SocketTest socketTest = new SocketTest();
       socketTest.go();
   }
}
