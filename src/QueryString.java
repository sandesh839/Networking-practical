import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class QueryString {

    private List<String> params = new ArrayList<>();

    public void add(String key, String value) {
        try {
            String encodedKey = URLEncoder.encode(key, StandardCharsets.UTF_8.toString());
            String encodedValue = URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
            params.add(encodedKey + "=" + encodedValue);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getQuery() {
        return String.join("&", params);
    }

    public static void main(String[] args) {
        QueryString qs = new QueryString();
        qs.add("name", "java programming");
        qs.add("level", "beginner");
        qs.add("year", "2025");

        System.out.println("Encoded Query String:");
        System.out.println(qs.getQuery());
    }
}
