package AuthService;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilites {

    public void print_input_stream(InputStream inputStream) {
        String text = null;
      //  ObjectMapper mapper = new ObjectMapper();
       // JsonNode jsonMap = mapper.readTree(is);
//        ObjectMapper mapper = new ObjectMapper();
//        Map<String, Object> jsonMap = mapper.readValue(inputStream, MappingChange.Map.class);
        try (Scanner scanner = new Scanner(inputStream,StandardCharsets.UTF_8.name())) {
            text = scanner.useDelimiter("\\A").next();
            System.out.println("AAA");
        }
        System.out.println(text);

    }

    public String fill_array_string(ArrayList<String> arrayList) {
        String urlParameters = "";
        if (arrayList.size() != 0) {
            for (int i = 0; i <= arrayList.size() - 1; i++) {
                if (i != arrayList.size() - 1) {
                    System.out.println(arrayList.get(i));
                    urlParameters += arrayList.get(i) + "&";
                } else {
                    urlParameters += arrayList.get(i);
                }
            }
            return urlParameters;
        }
        return urlParameters;
    }
}
