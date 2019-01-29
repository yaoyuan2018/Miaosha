package Array.test;

import java.util.Arrays;

/**
 * @Author: Y_uan
 * @Date: 2019/1/28 10:13
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Fill_Test {
    public static void main(String[] args) {
        int arr[]=new int[]{45, 12, 2, 10};
        Arrays.fill(arr, 1, 2, 8);
        for (int i = 0; i < arr.length; i++){
            //将数组中的每个元素输出
            System.out.println("第" + i + "个元素是：" + arr[i]);
        }
    }
}
