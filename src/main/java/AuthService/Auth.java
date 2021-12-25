package AuthService;

import com.sun.javafx.collections.MappingChange;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Auth {
    public static void main(String[] args) throws IOException {
        ArrayList<String >para=new ArrayList<>();
        para.add("user_identifier=966598888811");
        para.add("password=98320795");
        para.add("language=en");
        para.add("platform=Android");
        para.add("app_version=1.0.0");
        para.add("platform_version=28");
        para.add("login_type=busniess");
        new Auth().send_api("authenticate",new URL("https://auth.services.wedeliver-dev.com/api/v1"+"/login"),para);



    }
    private String country_code;
    private String service_url;
    private String authorization;

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getService_url() {
        return service_url;
    }

    public void setService_url(String service_url) {
        this.service_url = service_url;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public Auth(String country_code,String service_url){
        this.country_code=country_code;
        this.service_url=service_url;

    }

    public Auth() {
    }

    public Auth(String country_code, String service_url, String authorization) {
        this.country_code = country_code;
        this.service_url = service_url;
        this.authorization = authorization;
    }
    public void send_api(String api_name, URL url, ArrayList<String>parameters) throws IOException {
        try {


            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.setRequestMethod("POST");
            http.setRequestProperty("Accept", "application/json");
            String urlParameters = "";
            if (parameters.size() != 0) {
                for (int i = 0; i <= parameters.size() - 1; i++) {
                    if (i != parameters.size() - 1) {
                        System.out.println(parameters.get(i));
                        urlParameters += parameters.get(i) + "&";
                    } else {
                        urlParameters += parameters.get(i);
                    }
                }
                String urlParametersa = "user_identifier=966598888811&password=98320795&language=en&platform=Android&app_version=1.0.0&platform_version=28&login_type=busniess";
                byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
                int postDataLength = postData.length;
                http.setDoOutput(true);
                http.setInstanceFollowRedirects(false);

                http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                http.setRequestProperty("charset", "utf-8");
                http.setRequestProperty("Content-Length", Integer.toString(postDataLength));
                http.setUseCaches(false);
                try (DataOutputStream wr = new DataOutputStream(http.getOutputStream())) {
                    wr.write(postData);
                }
            }
            // http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
            print_input_stream(http.getInputStream());
            if (http.getResponseCode() == 200) {
                System.out.println(api_name + " Status code " + http.getResponseCode() + " " + http.getResponseMessage());
                System.out.println(http.getInputStream());
                http.disconnect();
            } else {
                System.out.println(api_name + " fail");
            }
        }catch (IOException e){
            System.out.println( e.getMessage());
        }
    }
    public void print_input_stream(InputStream inputStream){
        String text = null;
//        ObjectMapper mapper = new ObjectMapper();
//        Map<String, Object> jsonMap = mapper.readValue(inputStream, MappingChange.Map.class);
        try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
            text = scanner.useDelimiter("\\A").next();
            System.out.println("AAA");
        }
        System.out.println(text);

    }
}


