package Traversal;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Y_uan
 * @Date: 2019/2/13 15:28
 * @mail: yy494818027@163.com
 * @Description:
 */
public class MapTest {
    public static void main(String[] args) {
        //遍历Map
        Map<String,String> map = new HashMap<String, String>();
        map.put("aa", "xx");
        map.put("bb", "yy");
        map.put("cc", "zz");

        //1、增强的for循环(Entry集合)
        for (Map.Entry<String, String>entry : map.entrySet()){
            System.out.println(entry);
        }

        //2、增强的for循环(Key集合)
        for (String key : map.keySet()){
            System.out.println(key + "=" + map.get(key));
        }

        //3、遍历值的集合
        for (String value : map.values()){
            System.out.println(value);
        }
    }
}
