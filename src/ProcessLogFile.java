import java.io.*;
import java.util.regex.*;

public class ProcessLogFile {
    public static void main(String[] args) {
        String filePath = "C:\\logs\\access.log";   // change file path here
        int count = 0;

        // Regular expression to find IP address
        Pattern ipPattern = Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+)");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            System.out.println("Processing Log File...\n");

            while ((line = reader.readLine()) != null) {
                count++;
                System.out.println("Line " + count + ": " + line);

                // Find IP
                Matcher matcher = ipPattern.matcher(line);
                if (matcher.find()) {
                    System.out.println(" → IP Found: " + matcher.group());
                }
            }

            reader.close();
            System.out.println("\nTotal Log Lines: " + count);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
