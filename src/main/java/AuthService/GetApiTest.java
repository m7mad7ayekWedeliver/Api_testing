package AuthService;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import sun.misc.IOUtils;
import sun.net.www.http.HttpClient;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class GetApiTest {

//    public static void main(String[] args) throws IOException {
//        get_team_by_id(new URL("https://expressapis.wedeliverspace.dev/api/v1/team/get_team_by_id?team_id=1"));
//        get_all_teams(new URL("https://expressapis.wedeliverspace.dev/api/v1/team/get_all_teams"));
//        get_all_orders( new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_all_orders?filter_by=incomplete"));
//        get_all_captain(new URL("https://expressapis.wedeliverspace.dev/api/v1/captain/get_all_captains"));
//
//    }
    public static boolean get_all_captain(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
       // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_team_by_id(URL url)throws IOException {
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MDUzOTcsImxhbmd1YWdlIjoiYXIifQ.GC5GaDvqinECrfZrmlJOavWWW8zda5zUFlo4Qg_vEwA");

        if (http.getResponseCode() == 200) {
            System.out.println("Get all Teams By id api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }

    }
    public static boolean get_all_teams(URL url)throws IOException {
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MDUzOTcsImxhbmd1YWdlIjoiYXIifQ.GC5GaDvqinECrfZrmlJOavWWW8zda5zUFlo4Qg_vEwA");
        if (http.getResponseCode() == 200) {
            System.out.println("Get all Teams api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }

    }
    public static boolean get_all_orders(URL url) throws IOException {
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        http.setRequestMethod("OPTIONS");
        http.setRequestProperty("Accept", "application/json");
        //   http.setRequestProperty("Authorization", "Bearer {token}");
        if(http.getResponseCode()==200) {
            System.out.println("Get all orders api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        }else {
            return false;
        }
    }

    public static boolean get_abstract_all_captains(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_captain_tracking_ids(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_captain_by_id(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_captain_status_history(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_captain_path_history(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_business_categories(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean transport_types(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_all_abstract_cities(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_all_entry_types(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_currency(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_all_settings(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_amazon_transport_types(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }

    public static boolean get_city_by_id(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_all_cities(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean validate_iban(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_bank_account_by_id(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_all_bank_accounts(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_bank_by_id(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_all_banks(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_all_business_users(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_business_user_by_id(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_all_business_customers(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_all_customers(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_branch_default_values(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_abstract_business_branches(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_business_branch_by_id(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_all_businesses_branches(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_abstract_all_businesses(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_business_by_id(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }
    public static boolean get_all_businesses(URL url)throws IOException{
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.setRequestProperty("Accept", "application/json");
        http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
        // print_input_stream(http.getInputStream());
        if (http.getResponseCode() == 200) {
            System.out.println("Get all captain api " + "Status code " + http.getResponseCode() + " " + http.getResponseMessage());
            http.disconnect();
            return true;
        } else {
            return false;
        }
    }





    public static void print_input_stream(InputStream inputStream){
        String text = null;
        try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
            text = scanner.useDelimiter("\\A").next();
        }
        System.out.println(text);

    }
}
