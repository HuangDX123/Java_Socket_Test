package 多线程聊天;

public class TalkStudent {
    public static void main(String[] args) {
        System.out.println("**********学生端**************");

        new Thread(new TalkSend(7777,"localhost",9555)).start();
        new Thread(new TalkReceive(4888,"老师")).start();
    }
}
