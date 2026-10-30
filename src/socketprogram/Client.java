package socketprogram;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String hostname = "127.0.0.1";
        int port = 5000;

        // Allow passing custom host or empty message via command line for testing
        if (args.length > 0) {
            hostname = args[0];
        }

        try (Socket socket = new Socket()) {
            // Test Case 5: Handle unreachable / invalid host name gracefully
            socket.connect(new InetSocketAddress(hostname, port), 3000);
            
            // Test Case 2: Successful connection
            System.out.println("Client: Connected Successfully");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter message to send (Press Enter for 'Hello Server' or blank): ");
            String inputMsg = scanner.nextLine();
            
            if (inputMsg.isEmpty() && args.length > 1 && args[1].equals("empty")) {
                writer.println(""); // Test Case 9: Empty message
            } else if (inputMsg.isEmpty()) {
                writer.println("Hello Server"); // Test Case 1: Default message
            } else {
                writer.println(inputMsg);
            }

            // Test Case 4: Read server reply
            String response = reader.readLine();
            System.out.println("Client receives: " + response);

            // Test Case 7: Resource cleanup
            scanner.close();
            reader.close();
            writer.close();
            System.out.println("Client: Socket Closed");

        } catch (UnknownHostException e) {
            // Test Case 5 Output requirement
            System.out.println("Friendly error message instead of a stack trace: Unknown Host.");
        } catch (ConnectException e) {
            // Test Case 3 Output requirement
            System.out.println("Unable to connect to the server.");
        } catch (IOException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }
}