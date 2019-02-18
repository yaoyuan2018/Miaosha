package GenericTest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: Y_uan
 * @Date: 2019/2/13 15:37
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Demo5 {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(new Tiger("华南虎"));
        arr.add(new Tiger("东北虎"));
        arr.add(new Sheep("喜羊羊"));
        System.out.println(arr);
        Iterator it = arr.iterator();
        while (it.hasNext()){
            Object next = it.next();
            Tiger t = (Tiger) next;
            t.eat();
        }

    }

    static class Tiger{
        String name;

        public Tiger(){

        }

        public Tiger(String name){
            this.name = name;
        }

        @Override
        public String toString(){
            return "Tiger@name: " + this.name;
        }

        public void eat(){
            System.out.println(this.name + "吃羊");
        }
    }

    static class Sheep{
        String name;

        public Sheep(){

        }

        public Sheep(String name){
            this.name = name;
        }

        public String toString(){
            return "Sheep@name: " + this.name;
        }

        public void eat(){
            System.out.println(this.name + "吃青草");
        }
    }
}
