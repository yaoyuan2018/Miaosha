package Object_Test;

/**
 * @Author: Y_uan
 * @Date: 2019/2/1 15:08
 * @mail: yy494818027@163.com
 * @Description:
 */
public class ObjectInstance {
    public String toString(){
        return "在" + getClass().getName() + "类中重写toString()方法"; //重写toStirng()方法
    }

    public static void main(String[] args) {
        System.out.println(new ObjectInstance());   //打印本类对象
    }
    /**
     * 当用户打印ObjectInstance类对象时，将自动调用toString()方法。
     */
}
