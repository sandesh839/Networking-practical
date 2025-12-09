import java.net.*;
import java.util.*;

public class ListNetworkInterfaces {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();

                System.out.println("====================================");
                System.out.println("Interface Name: " + ni.getName());
                System.out.println("Display Name : " + ni.getDisplayName());

                // Print MAC Address
                byte[] mac = ni.getHardwareAddress();
                if (mac != null) {
                    System.out.print("MAC Address  : ");
                    for (int i = 0; i < mac.length; i++) {
                        System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
                    }
                    System.out.println();
                } else {
                    System.out.println("MAC Address  : Not Available");
                }

                // Print IP Addresses
                Enumeration<InetAddress> addresses = ni.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress address = addresses.nextElement();
                    System.out.println("IP Address   : " + address.getHostAddress());
                }

                System.out.println("====================================\n");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
