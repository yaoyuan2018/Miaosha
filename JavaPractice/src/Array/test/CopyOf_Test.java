package Array.test;

import java.util.Arrays;

/**
 * @Author: Y_uan
 * @Date: 2019/1/28 11:04
 * @mail: yy494818027@163.com
 * @Description:
 */
public class CopyOf_Test {
    public static void main(String[] args) {
/*        int arr[] = new int[] {23,42,12};                   //定义数组
        int newarr[] = Arrays.copyOf(arr,5);     //复制数组arr
        for (int i = 0; i < newarr.length; i++){            //循环变量复制后的新数组
            System.out.println(newarr[i]);                  //将新数组输出
        }*/
        int arr[] = new int[]{23,42,12,84,10};
        int newarr[] = Arrays.copyOfRange(arr,0,3); //复制数组
        for (int i = 0; i < newarr.length;i++){              //循环遍历复制后的新数组
            System.out.println(newarr[i]);                   //将新数组的每个元素输出
        }
    }
}
