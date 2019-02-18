package Object_Test;

/**
 * @Author: Y_uan
 * @Date: 2019/2/1 15:17
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Quadrangle {
    //实例化保存四边形对象数组对象
    private Quadrangle[] qtest = new Quadrangle[6];
    private int nextIndex = 0;
    public void draw(Quadrangle q){
        if (nextIndex < qtest.length){
            qtest[nextIndex] = q;
            System.out.println(nextIndex);
            nextIndex++;
        }
    }

    public static void main(String[] args) {
        //实例化两个四边形对象，用于调用draw()方法
        Quadrangle q = new Quadrangle();
        q.draw(new Square());   //以正方形对象为参数调用draw()方法
        //以平行四边形对象为参数调用draw()方法
        q.draw(new Parallelogram());
    }
}
