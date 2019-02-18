package IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: Y_uan
 * @Date: 2019/2/14 9:57
 * @mail: yy494818027@163.com
 * @Description: 读文件的代码
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        String path = "E:/Java读写文件测试/a.txt";
        FileInputStream in = null;
        try {
            //打开流
            in = new FileInputStream(path);
            //使用流读文件内容
            int b = in.read();
            while (b != -1){
                System.out.print((char) b);
                b = in.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //释放资源
            if (in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
