import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class APICall {
  public String decryptCipher(String message,int key){
       String decryptedMessage = "";
      char ch;

      for(int i = 0; i < message.length(); ++i){
          ch = message.charAt(i);

          if(ch >= 'a' && ch <= 'z'){
              ch = (char)(ch - key);

              if(ch < 'a'){
                  ch = (char)(ch + 'z' - 'a' + 1);
              }

              decryptedMessage += ch;
          }
          else if(ch >= 'A' && ch <= 'Z'){
              ch = (char)(ch - key);

              if(ch < 'A'){
                  ch = (char)(ch + 'Z' - 'A' + 1);
              }

              decryptedMessage += ch;
          }
          else {
              decryptedMessage += ch;
          }
      }

      System.out.println("Decrypted Message = " + decryptedMessage);
      return decryptedMessage;

  }
    public static void main(String args[]){
      TestThoughtWorks testThoughtWorks = new TestThoughtWorks();
      String inputUrl = "https://http-hunt.thoughtworks-labs.net/challenge/input";
      String outputUrl = "https://http-hunt.thoughtworks-labs.net/challenge/output";
      String outputString = testThoughtWorks.getFromConnection(inputUrl);
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonObject = jsonParser.parse(outputString).getAsJsonObject();
        JsonArray jsonObject1 = jsonObject.getAsJsonArray("toolUsage");
        JsonArray jsonArray = new JsonArray();
        for (int i =0;i<jsonObject1.size();i++){
            JsonObject jsonArray1 = jsonObject1.get(i).getAsJsonObject();
            System.out.println(jsonArray1.get("name"));
            System.out.println(Integer.parseInt(jsonArray1.get("useEndTime").getAsString().substring(14,16)) - Integer.parseInt(jsonArray1.get("useStartTime").getAsString().substring(14,16)));

        }



      System.out.println(outputString);
//      String output = testThoughtWorks.postToConnection(outputUrl,outputString);

    }
}
