package task3;

import java.io.*;
import java.net.*;

public class ClientHandler implements Runnable {

    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private String clientName;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Enter your name:");
            clientName = in.readLine();

            String message;

            while ((message = in.readLine()) != null) {

                String fullMessage = clientName + ": " + message;

                System.out.println(fullMessage);

                Server.broadcastMessage(fullMessage, this);
            }

        } catch (IOException e) {
            System.out.println("Client disconnected");

        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Server.removeClient(this);
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }
}
