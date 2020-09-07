package 聊天;
//客户端
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveDemo01 {
    public static void main(String[] args) throws Exception{
        System.out.println("**********接收端*************");
        DatagramSocket socket = new DatagramSocket(8557);

        while (true){
            //        准备接收包裹
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container,0,container.length);
            socket.receive(packet); //阻塞式接收包裹

//            断开连接 bye
            byte[] data = packet.getData();
            String receiveData = new String(data,0,data.length);

            System.out.println(receiveData);
            if (receiveData.equals("bay")){
                break;
            }

        }
        socket.close();

    }
}
