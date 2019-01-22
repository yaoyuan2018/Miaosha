import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @Author: Y_uan
 * @Date: 2019/1/10 15:01
 * @mail: yy494818027@163.com
 * 这个类用来实现数据的发送，当按键按下时，会调用SendMessage方法
 */
public class SendThread {
    ChatWindow chatWindow;
    private String remoteIP = "";
    private int port = 0;
    private String message = "";

    public SendThread(ChatWindow window){
        this.chatWindow = window;
    }

    public void notRun() {

        try {
            InetSocketAddress isa = new InetSocketAddress(remoteIP, port);
            Socket socket = new Socket();
            socket.connect(isa);
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write(message);
            writer.flush();
            writer.close();
            System.out.println("将数据写入到流中");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            message = "";
        }
    }

    public void sendMessage(String host, int prot, String message){
        this.remoteIP = host;
        this.port = prot;
        this.message = message;
        notRun();
    }
}
