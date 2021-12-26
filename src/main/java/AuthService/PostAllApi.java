package AuthService;

import javax.xml.ws.Response;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PostAllApi {
    private static int counter = 0;
    private static int countera = 0;

    public static void main(String[] args) throws IOException {
    POSTRequest();
        //    postApi("create customer", new URL("https://expressapis.wedeliverspace.dev/api/v1/business/create_customer"));
    }

    public static void postApi(String api_name, URL url) throws IOException {
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("POST");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjozMTIsImZ1bGxfbmFtZSI6IllhcWluIFNodXJyYWIiLCJ1c2VyX3R5cGUiOiJCdXNpbmVzcyBVc2VyIiwicm9sZSI6IkJ1c2luZXNzIFVzZXIiLCJtb2JpbGUiOiI1MzQ1NzM0NzkiLCJlbWFpbCI6InlzaHVycmFiQGhvdG1haWwuY29tIiwiZXhwIjoxNjI4Njc0MDUwLCJsYW5ndWFnZSI6ImFyIiwiYnVzaW5lc3NfaWQiOjEyN30.tHV26fNHw7ixSMdPl6CxT6UDQaqsSrdoECvEkkA56gw");
        http.setRequestProperty("name", "mohammed");
        http.setRequestProperty("email", "a@a.a");
        http.setRequestProperty("mobile", "0592133241");
        http.setRequestProperty("business_id", "1");

        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println(api_name + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            counter++;
        } else {
            System.out.println(api_name + " fail");
            countera++;
        }

    }

    public static void printInputStream(InputStream inputStream) {
        String text = null;
        try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
            text = scanner.useDelimiter("\\A").next();
        }
        System.out.println(text);

    }

    public static void POSTRequest() throws IOException {
String name ="mohammed";

        final String POST_PARAMS = "name:"+name+"," + "mobile:"+"0592533534\",\r\n" +"\"email\": \"mmm@gmail.com\",\r\n";
        HashMap<String, String> param = new HashMap<>();
        param.put("name","mohammed");
        param.put("mobile","0592533533");
        param.put("email","tes@tes.com");


       // Response response_post=given()
        final String POST_PARAMSa =  "'name'"+":"+"'mohamedTest'"+","+
        "'mobile'"+":"+"'0599884433'"+","+
        "'email'"+":"+"'test1@test1.com'";
        System.out.println(param);
        URL obj = new URL("https://expressapis.wedeliverspace.dev/api/v1/business/create_customer");
        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
        postConnection.setRequestMethod("POST");
        postConnection.setRequestProperty("Accept", "application/json");
        postConnection.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjozMTIsImZ1bGxfbmFtZSI6IllhcWluIFNodXJyYWIiLCJ1c2VyX3R5cGUiOiJCdXNpbmVzcyBVc2VyIiwicm9sZSI6IkJ1c2luZXNzIFVzZXIiLCJtb2JpbGUiOiI1MzQ1NzM0NzkiLCJlbWFpbCI6InlzaHVycmFiQGhvdG1haWwuY29tIiwiZXhwIjoxNjI4Njc0MDUwLCJsYW5ndWFnZSI6ImFyIiwiYnVzaW5lc3NfaWQiOjEyN30.tHV26fNHw7ixSMdPl6CxT6UDQaqsSrdoECvEkkA56gw");


        postConnection.setDoOutput(true);
        OutputStream os = postConnection.getOutputStream();
       // os.write(POST_PARAMS.getBytes(param.);
        os.flush();
        os.close();
        System.out.println( postConnection.getResponseCode());
        postConnection.disconnect();
    }

}