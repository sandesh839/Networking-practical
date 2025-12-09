import java.net.*;

public class CheckIPType {
    public static void main(String[] args) {
        try {
            String ip = "2400:1a00:b020:8b21::1";   // Change IP here
            InetAddress address = InetAddress.getByName(ip);

            System.out.println("IP Address: " + ip);

            if (address instanceof Inet4Address) {
                System.out.println("This is an IPv4 address.");
            }
            else if (address instanceof Inet6Address) {
                System.out.println("This is an IPv6 address.");
            }
            else {
                System.out.println("Unknown IP format.");
            }

        } catch (Exception e) {
            System.out.println("Invalid IP Address: " + e.getMessage());
        }
    }
}
