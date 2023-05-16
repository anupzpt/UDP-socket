import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client {
    public static void main(String[] args) throws IOException {

        System.out.println("Client");
        DatagramSocket socket=new DatagramSocket(12345);

        //grab data send in byte
        byte[] data=new byte[1024];
        DatagramPacket packet=new DatagramPacket(data,data.length);

        //receive the message
        socket.receive(packet);

        String message =new String(packet.getData(),0,packet.getLength());
        System.out.println(message);
        socket.close();

    }
}
