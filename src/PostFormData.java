import java.io.*;
import java.net.*;

public class PostFormData {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://httpbin.org/post");
            URLConnection con = url.openConnection();

            // Enable output for POST
            con.setDoOutput(true);
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            // Form data
            String formData = "username=Sandesh&course=JavaNetworking&year=2025";

            // Send data
            OutputStreamWriter writer =
                    new OutputStreamWriter(con.getOutputStream());
            writer.write(formData);
            writer.flush();

            // Read response
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(con.getInputStream()));

            String line;
            System.out.println("Server Response:\n");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            writer.close();
            reader.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
