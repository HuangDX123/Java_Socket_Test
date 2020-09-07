package 聊天;
//服务端
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSenderDemo01 {
    public static void main(String[] args)throws Exception {
        DatagramSocket socket = new DatagramSocket(8455);

//        准备数据 控制台读取 System.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String data = reader.readLine();        System.out.println("**********学生端**************");

            byte[] dates = data.getBytes();
            DatagramPacket packet = new DatagramPacket(dates,0,dates.length,new InetSocketAddress("localhost",8557));

            socket.send(packet);
            if (reader.equals("bay")){
                break;
            }

        }

        socket.close();


    }
}
