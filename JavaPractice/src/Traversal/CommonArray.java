package Traversal;

/**
 * @Author: Y_uan
 * @Date: 2019/2/13 14:46
 * @mail: yy494818027@163.com
 * @Description:
 */
public class CommonArray {
    public static void main(String[] args) {
        //遍历数组
        String[] arr = new String[] {"xx", "yy", "zz"};

        //1、增强的for循环
        for (String elt : arr){
            System.out.println(elt);
        }

        //2、下标的方式
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
