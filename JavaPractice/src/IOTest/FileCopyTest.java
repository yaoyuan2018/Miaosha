package IOTest;

import java.io.*;

/**
 * @Author: Y_uan
 * @Date: 2019/2/14 10:20
 * @mail: yy494818027@163.com
 * @Description:
 */
public class FileCopyTest {
    public static void main(String[] args) {
        String srcPath = "E:/Java读写文件测试/a.txt";
        String destPath = "E:/Java读写文件测试/b.txt";

        //一定要使用字节流
        InputStream in = null;
        OutputStream out = null;

        try {
            //打开流
            in = new FileInputStream(srcPath);
            out = new FileOutputStream(destPath);
            //使用流
            byte[] buf = new byte[1024 * 8];
            for (int len = -1; (len = in.read(buf))!=-1;){
                out.write(buf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
