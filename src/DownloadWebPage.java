import java.io.*;
import java.net.*;

public class DownloadWebPage {
    public static void main(String[] args) {
        try {
            String urlString = "https://www.example.com"; // Change website here
            URL url = new URL(urlString);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("downloaded_page.html"));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Web page downloaded successfully!");
            System.out.println("Saved as downloaded_page.html");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
