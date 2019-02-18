package Traversal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: Y_uan
 * @Date: 2019/2/13 15:25
 * @mail: yy494818027@163.com
 * @Description:
 */
public class SetTest {
    public static void main(String[] args) {
        //遍历Set
        Set<String> set = new HashSet<String>();
        set.add("dd");
        set.add("ee");
        set.add("ff");

        //1、增强的for循环
        for (String elt:set){
            System.out.println(elt);
        }

        //2、迭代器
        for (Iterator<String> iter = set.iterator(); iter.hasNext();){
            String elt = iter.next();
            System.out.println(elt);
        }
    }
}
