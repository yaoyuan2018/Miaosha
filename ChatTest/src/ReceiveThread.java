import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: Y_uan
 * @Date: 2019/1/10 15:02
 * @mail: yy494818027@163.com
 * 这个类实现的功能是维护一个阻塞线程，来对端口进行监听，接受收到的信息，每当收到信息时，都会显示。
 */
public class ReceiveThread extends Thread {

    private ServerSocket serverSocket;
    private ChatWindow chatWindow;

    public ReceiveThread(ChatWindow chatWindow){
        this.chatWindow = chatWindow;
        try {
            this.serverSocket = new ServerSocket(0);
            this.chatWindow.setLocalPort(serverSocket.getLocalPort());
            start();
        } catch (IOException e) {
            chatWindow.printError("连接出错");
        }
    }

    @Override
    public void run() {
        while (true){
            Socket socket;
            try {
                socket = serverSocket.accept();
                InputStreamReader reader = new InputStreamReader(socket.getInputStream());
                int c;
                StringBuilder sb = new StringBuilder();
                while ((c = reader.read()) != -1){
                    sb.append(c);
                }
                chatWindow.setReceive(sb.toString());
            } catch (IOException e) {
                System.out.println("线程将接收到的数据写入对话框出错");
            }
        }
    }



}
