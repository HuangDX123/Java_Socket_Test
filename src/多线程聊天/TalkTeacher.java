package 多线程聊天;

public class TalkTeacher {
    public static void main(String[] args) {
        System.out.println("**********教师端**************");

        new Thread(new TalkSend(5555,"localhost",4888)).start();
        new Thread(new TalkReceive(9555,"学生")).start();
    }
}
