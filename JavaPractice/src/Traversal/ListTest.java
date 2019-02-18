package Traversal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Y_uan
 * @Date: 2019/2/13 15:16
 * @mail: yy494818027@163.com
 * @Description:
 */
public class ListTest {
    public static void main(String[] args) {
        //遍历List
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        //1、增强的for循环
        for (String elt:list){
            System.out.println(elt);
        }

        //2、下标
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //3、迭代器
        for (Iterator<String> iter = list.iterator(); iter.hasNext();){
            String elt = iter.next();
            System.out.println(elt);
        }
    }
}
