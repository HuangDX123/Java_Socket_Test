package 网络编程实战;
//IP
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.UnknownHostException;

//测试IP
public class TestInetAddress {
    public static void main(String[] args) throws UnknownHostException {

        try {
            //查询本地地址
            InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress1);

            InetAddress inetAddress3 = InetAddress.getByName("localhost");
            System.out.println(inetAddress3);

            InetAddress inetAddress4 = InetAddress.getLocalHost();
            System.out.println(inetAddress4);


            //查询网站ip地址
            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress2);

            //常用方法
            System.out.println(inetAddress2.getCanonicalHostName()); //规范的名字
            System.out.println(inetAddress2.getHostAddress()); //IP
            System.out.println(inetAddress2.getHostName()); //域名，或者自己电脑的名字


        }catch (UnknownHostException e){
            e.printStackTrace();
        }


    }
}
