import java.net.*;

public class SplitURI {
    public static void main(String[] args) {
        try {
            String uriString = "https://www.example.com:8080/docs/index.html?name=java#section1";
            URI uri = new URI(uriString);

            System.out.println("Full URI  : " + uriString);
            System.out.println("Scheme    : " + uri.getScheme());
            System.out.println("Host      : " + uri.getHost());
            System.out.println("Port      : " + uri.getPort());
            System.out.println("Path      : " + uri.getPath());
            System.out.println("Query     : " + uri.getQuery());
            System.out.println("Fragment  : " + uri.getFragment());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
