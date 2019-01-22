import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: Y_uan
 * @Date: 2019/1/10 15:02
 * @mail: yy494818027@163.com
 * UI的实现，通过绑定各个按钮的操作来实现别的功能
 */
public class ChatWindow extends JFrame {

    private JButton sendButton;
    private JButton cancelButton;
    private JButton receiveButton;
    private JTextArea receiveText;
    private JTextField sendText;

    private JLabel localPort;

    private JTextField remoteAddress;
    private JTextField remotePort;
    private SendThread sendThread;
    private ReceiveThread receiveThread;
    
    public ChatWindow(){
        GUIini();
        ActionIni();
        ThreadIni();
    }

    private void ThreadIni() {
        sendThread = new SendThread(this);
        receiveThread = new ReceiveThread(this);
    }

    private void ActionIni() {
        //键盘动作
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    sendThread.sendMessage(remoteAddress.getText(), Integer.parseInt(remotePort.getText()),sendText.getText());
                    receiveText.setText(receiveText.getText() + "\n" + "发送" + sendText.getText());
                }
            }
        });

        //取消按钮的动作
        cancelButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                sendText.setText("");
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        sendButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //发送文本
                sendThread.sendMessage(remoteAddress.getText(),Integer.parseInt(remotePort.getText()),sendText.getText());
                receiveText.setText(receiveText.getText() + "发送" + sendText.getText() + "\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    private void GUIini() {
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        setSize(400,500);

        //第一个panel
        JPanel panel1 = new JPanel(new GridLayout(4,2));
        panel1.setSize(400,75);
        panel1.add(new JLabel("当前及其的IP地址是："));
        try {
            panel1.add(new JLabel(InetAddress.getLocalHost().getHostAddress()));
        } catch (UnknownHostException e) {
            panel1.add(new JLabel("当前及其的IP地址：Unknown"));
        }
        panel1.add(new JLabel("当前对话的端口是："));
        panel1.add(localPort = new JLabel(""+0));
        panel1.add(new JLabel("Remote Host IP Address:"));
        remoteAddress = new JTextField();
        remoteAddress.setColumns(0);
        panel1.add(remoteAddress);
        panel1.add(new JLabel("Remote Host Port:"));
        remotePort = new JTextField();
        remotePort.setColumns(0);
        panel1.add(remotePort);
        c.add(panel1,BorderLayout.NORTH);

        //第二个panel
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
        panel2.setSize(400,200);
        panel2.add(new JLabel("收到的内容"));
        receiveText = new JTextArea(15,30);
        receiveText.setEditable(false);
        receiveText.setAutoscrolls(true);
        JScrollPane jsp = new JScrollPane(receiveText);
        panel2.add(jsp);
        //第三个panel
//      JPanel panel3 = new JPanel(new GridLayout(2, 1));
        panel2.add(new JLabel("请输入发送的内容"));
        sendText = new JTextField(30);
        sendText.setAutoscrolls(true);
        panel2.add(sendText);
        c.add(panel2,BorderLayout.CENTER);
        //c.add(panel3);
        //第四个panel
        JPanel panel4 = new JPanel(new GridLayout(1, 0));
        panel4.setSize(400,20);
        receiveButton = new JButton("开始接受数据");
        sendButton = new JButton("发送");
        cancelButton = new JButton("取消");
        panel4.add(receiveButton);
        panel4.add(cancelButton);
        panel4.add(sendButton);
        c.add(panel4,BorderLayout.SOUTH);
        //四个面板内容设置完毕

        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void printError(String err) {
        System.out.println("Error occur:" + err);
    }

    public void setLocalPort(int localPort) {
    }

    //回调函数，用于接受从
    public void setReceive(String toString) {
    }
}
