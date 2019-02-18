package Extends_Test;

/**
 * @Author: Y_uan
 * @Date: 2019/1/29 16:38
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Test {
    public Test(){
        //构造方法
    }
    protected void doSomething(){
        //成员方法
    }
    protected Test dolt(){
        //方法返回类型为Test类型
        return new Test();
    }
}
