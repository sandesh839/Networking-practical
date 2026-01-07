import java.net.*;
import java.util.*;

public class PrintHTTPHeader {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection con = url.openConnection();

            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            con.connect();

            Map<String, List<String>> headers = con.getHeaderFields();

            System.out.println("HTTP Headers:\n");

            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                String key = entry.getKey();
                List<String> values = entry.getValue();

                System.out.println((key != null ? key : "Status") + " : " + values);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
