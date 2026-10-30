package socketprogram;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 5000;
        
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            // Test Case 8: Network Info using InetAddress
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Server Host Name: " + localAddress.getHostName());
            System.out.println("Server IP Address: " + localAddress.getHostAddress());
            System.out.println("Server started on port " + port + ". Waiting for clients...");

            while (true) {
                try {
                    // Test Case 2 & 10: Client Connected
                    Socket socket = serverSocket.accept();
                    System.out.println("Server: Client Connected");

                    BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

                    String message = reader.readLine();
                    
                    // Test Case 1 & 9: Handle normal and empty messages
                    if (message == null || message.trim().isEmpty()) {
                        System.out.println("Server displays: Received: (blank)");
                    } else {
                        System.out.println("Server displays: Received: " + message);
                    }

                    // Test Case 4: Two-way communication reply
                    writer.println("Reply: Welcome Client");

                    // Test Case 7: Resource cleanup
                    reader.close();
                    writer.close();
                    socket.close();
                    System.out.println("Server: Connection Closed");

                } catch (IOException e) {
                    System.out.println("Error handling client session: " + e.getMessage());
                }
            }

        } catch (BindException e) {
            // Test Case 6: Port conflict handling
            System.out.println("Second instance reports: the port is already in use");
        } catch (IOException e) {
            System.out.println("Server exception: " + e.getMessage());
        }
    }
}