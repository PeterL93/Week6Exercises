package peter.Server;

import peter.Client.EchoClient;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Peter
 */
public class EchoServer {

    public static String IP = "localhost";

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket();
            server.bind(new InetSocketAddress(5566));
            while (true) {
                Socket client = server.accept();
                Thread t;
                t = new Thread(new EchoClient(client));
                t.start();
            }
        } catch (IOException e) {
            System.err.println("EchoServer has thrown an exception: " + e);
        }
    }
}
