package ru.gb.ilyashuk.secondquarter.homework2_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class EchoServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Ждём подключения клиента...");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился.");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            Scanner scanner = new Scanner(System.in);
            new Thread(()->{

               while (true) {
                   String message = scanner.nextLine();
                   try {
                       out.writeUTF(message);
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }

            }).start();
            while (true) {
                String message = in.readUTF();
                if ("/end".equalsIgnoreCase(message)) {
                    out.writeUTF( message);
                    System.out.println("Сообщение от клиента: " + message);
                    System.out.println("Сервер остановлен");
                    break;
                }
                System.out.println("Сообщение от клиента: " + message);
                out.writeUTF("[echo] " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
