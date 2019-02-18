package Object_Test;

/**
 * @Author: Y_uan
 * @Date: 2019/2/1 15:34
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Parallelogram extends Quadrangle {

    public Parallelogram() {
        System.out.println("平行四边形");
    }

    public static void main(String[] args) {
        Quadrangle q = new Quadrangle();    //实例化父类对象
        //判断父类对象是否为Parallelogram子类的一个实例
        if (q instanceof Parallelogram){
            Parallelogram p = (Parallelogram) q;    //向下转型操作
        }
        //判断父类对象是否为Parallelogram子类的一个实例
        if (q instanceof Square){
            Square s = (Square) q;  //进行向下转型操作
        }
    }
}
