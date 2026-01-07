import java.net.*;

public class SplitURL {
    public static void main(String[] args) {
        try {
            String urlString = "https://www.google.com:8080/docs/index.html?name=java&year=2025";
            URL url = new URL(urlString);

            System.out.println("Full URL   : " + urlString);
            System.out.println("Protocol   : " + url.getProtocol());
            System.out.println("Host       : " + url.getHost());
            System.out.println("Port       : " + url.getPort());
            System.out.println("Path       : " + url.getPath());
            System.out.println("Query      : " + url.getQuery());
            System.out.println("File       : " + url.getFile());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
