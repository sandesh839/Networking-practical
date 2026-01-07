import java.net.*;
import java.nio.charset.StandardCharsets;

public class URLEncodeDecode {
    public static void main(String[] args) {
        try {
            String original = "https://www.example.com/search?name=java programming&level=beginner";

            // Encode
            String encoded = URLEncoder.encode(original, StandardCharsets.UTF_8.toString());

            // Decode
            String decoded = URLDecoder.decode(encoded, StandardCharsets.UTF_8.toString());

            System.out.println("Original URL : " + original);
            System.out.println("Encoded URL  : " + encoded);
            System.out.println("Decoded URL  : " + decoded);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
