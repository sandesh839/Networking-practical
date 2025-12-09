import java.net.*;

public class IPCharacteristics {
    public static void main(String[] args) {
        try {
            String ip = "8.8.8.8";  // Change to any IP
            InetAddress address = InetAddress.getByName(ip);

            System.out.println("IP Address: " + ip);
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("Is Reachable (2 sec): " + address.isReachable(2000));
            System.out.println("Is Loopback Address: " + address.isLoopbackAddress());
            System.out.println("Is Multicast Address: " + address.isMulticastAddress());
            System.out.println("Is Link Local Address: " + address.isLinkLocalAddress());
            System.out.println("Is Site Local Address: " + address.isSiteLocalAddress());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
