import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviceClient {
    public void go(){
        try{
            Socket socket = new Socket("127.0.0.1",8050);
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String advice = bufferedReader.readLine();
            System.out.println(" advice is ::"+advice);
            bufferedReader.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String args[]){
        DailyAdviceClient adviceClient = new DailyAdviceClient();
        adviceClient.go();
    }
}
