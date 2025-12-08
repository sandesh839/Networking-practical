import java.net.*;

public class DomainAddress {
    public static void main(String[] args) {
        try {
            String domain = "google.com";   // You can change this
            InetAddress address = InetAddress.getByName(domain);

            System.out.println("Domain Name: " + domain);
            System.out.println("IP Address : " + address.getHostAddress());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
