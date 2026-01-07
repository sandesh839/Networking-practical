import java.io.*;
import java.net.*;

public class OpenDirectorySearch {
    public static void main(String[] args) {
        try {
            String query = "Java networking";
            String encodedQuery = URLEncoder.encode(query, "UTF-8");

            String urlString = "https://en.wikipedia.org/w/index.php?search=" + encodedQuery;
            URL url = new URL(urlString);

            URLConnection con = url.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            String line;
            int count = 0;

            System.out.println("Searching Open Directory for: " + query);
            System.out.println("------------------------------------");

            while ((line = reader.readLine()) != null && count < 10) {
                System.out.println(line);
                count++;
            }

            reader.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
