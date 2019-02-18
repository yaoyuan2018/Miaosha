package OverLoadTest;

/**
 * @Author: Y_uan
 * @Date: 2019/2/1 15:45
 * @mail: yy494818027@163.com
 * @Description:
 */
public class OverLoadTest {
    public static int add(int a, int b){    //定义一个方法
        return a + b;
    }

    //定义与第一个方法相同名称、参数类型不同的方法
    public static double add(double a, double b){
        return a + b;
    }
    public static int add(int a){   //定义与第一个方法参数个数不同的方法
        return a;
    }
    public static int add(int a, double b){
        return 1;
    }
    //这个方法与前一个方法参数次序不同
    public static int add(double a, int b){
        return 1;
    }
    public static int add(int ...a){
        int s = 0;
        for (int i = 0; i < a.length; i++)
            s+= a[i];
        return s;
    }

    public static void main(String[] args) {
        System.out.println("调用 add(int,int)方法：" + add(1,2));
        System.out.println("调用 add(double, double)方法：" + add(2.1, 3.3));
        System.out.println("调用 add(int)方法：" + add(1));
    }
}
