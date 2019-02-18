package GenericTest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: Y_uan
 * @Date: 2019/2/13 15:54
 * @mail: yy494818027@163.com
 * @Description: 使用泛型后，规定该集合只能放羊，老虎就进不来了
 */
public class Demo6 {

    public static void main(String[] args) {
        ArrayList<Demo5.Sheep> arr = new ArrayList<Demo5.Sheep>();
        arr.add(new Demo5.Sheep("美羊羊"));
        arr.add(new Demo5.Sheep("懒羊羊"));
        arr.add(new Demo5.Sheep("喜羊羊"));
        //编译失败
//        arr.add(new Demo5.Tiger("东北虎"));
        System.out.println(arr);

        Iterator<Demo5.Sheep> it = arr.iterator();
        while (it.hasNext()){
            //使用泛型后，不需要强制类型转换了
            Demo5.Sheep next = it.next();
            next.eat();
        }
    }
}
