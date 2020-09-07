package 多线程聊天;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class TalkSend implements Runnable{
    DatagramSocket socket = null;
    BufferedReader reader = null;

    private int fromPort;
    private String toIP;
    private int toPort;


    public TalkSend(int fromIP,String toIP,int toPort){
        this.fromPort = fromPort;
        this.toIP = toIP;
        this.toPort = toPort;

        try {
            socket = new DatagramSocket(fromPort);
            reader = new BufferedReader(new InputStreamReader(System.in));
        }catch (Exception e){
            e.printStackTrace();
        }


    }


    @Override
    public void run(){

        while (true){
            String data = null;
            try {
                data = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] dates = data.getBytes();
            DatagramPacket packet = new DatagramPacket(dates,0,dates.length,new InetSocketAddress(this.toIP,this.toPort));

            try {
                socket.send(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (reader.equals("bay")){
                break;
            }

        }

        socket.close();

    }
}
