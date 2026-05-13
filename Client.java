package task3;

import java.io.*;
import java.net.*;

public class Client {

    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 5000;

    public static void main(String[] args) {

        try (
                Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);

                BufferedReader keyboard =
                        new BufferedReader(new InputStreamReader(System.in));

                BufferedReader in =
                        new BufferedReader(
                                new InputStreamReader(socket.getInputStream()));

                PrintWriter out =
                        new PrintWriter(socket.getOutputStream(), true);

        ) {

            // Thread for reading messages
            Thread readThread = new Thread(() -> {
                String serverMessage;

                try {
                    while ((serverMessage = in.readLine()) != null) {
                        System.out.println(serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            readThread.start();

            // Sending messages
            String userInput;

            while ((userInput = keyboard.readLine()) != null) {
                out.println(userInput);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
