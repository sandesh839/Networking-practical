import java.io.*;
import java.net.*;

public class DownloadWebPageURLConnection {
    public static void main(String[] args) {
        try {
            String urlString = "https://www.example.com";
            URL url = new URL(urlString);

            URLConnection con = url.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("downloaded_page_urlconnection.html"));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Web page downloaded successfully using URLConnection!");
            System.out.println("Saved as downloaded_page_urlconnection.html");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
