import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import javax.net.ssl.HttpsURLConnection;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TestThoughtWorks {

    public String getFromConnection(String connectionURL) {
        HttpsURLConnection connection = null;
        int responseCode = 0;
        JsonParser jsonParser = null;
        JsonElement jsonRoot = null;
        String responseString = "";
        URL url = null;

        try {
            jsonParser = new JsonParser();
            url = new URL(connectionURL);
            connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestProperty("userId","mTBO1cKen");
            responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                jsonRoot = jsonParser.parse(new InputStreamReader(connection.getInputStream()));
                responseString = jsonRoot.getAsJsonObject().toString();
            }
            System.out.println("connectionURL :: "+connectionURL+" responseCode :: "+responseCode);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return responseString;
    }


    public String postToConnection(String connectionURL, String requestBody) {
        Long startTime = System.currentTimeMillis();
        HttpsURLConnection connection = null;
        String response = "";
        URL url = null;
        URLConnection request = null;
        try {
            url = new URL(connectionURL);
            request = url.openConnection();
            connection = (HttpsURLConnection) request;
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("userId","mTBO1cKen");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.getOutputStream().write(requestBody.getBytes("UTF-8"));
            if (connection.getResponseCode() == 200) {
                InputStream inputStream = connection.getInputStream();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int length = 0;
                while ((length = inputStream.read(buffer)) != -1) {
                    baos.write(buffer, 0, length);
                }
                response = baos.toString("UTF-8");
            }
            System.out.println("connectionURL :: "+connectionURL+" responseCode :: "+connection.getResponseCode());
            System.out.println(System.currentTimeMillis() - startTime);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return response;
    }

}
