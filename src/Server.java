import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket= new DatagramSocket();
        String message ="Hello Anu";
        InetAddress address=InetAddress.getByName("localhost");
        DatagramPacket packet=new DatagramPacket(message.getBytes(),message.length(),address,12345);

        //sending mgs
        socket.send(packet);
        socket.close();
    }
}