package Array.test;

import java.util.Arrays;

/**
 * @Author: Y_uan
 * @Date: 2019/1/28 11:29
 * @mail: yy494818027@163.com
 * @Description: 数组查询
 */
public class BinarySearch {
    public static void main(String[] args) {
/*        int arr[] = new int[]{4, 25, 10};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,0,1,11);
        System.out.println(index);*/

        //必须在进行此调用之前对数组进行排序
        //如果没有对数组进行排序，则结果是不确定的。如果数组包含多个带有指定值的元素，则无法保证找到的是哪一个。
        int ia[] = new int[]{1,8,9,4,5};    //定义int型数组ia
        Arrays.sort(ia);
        int index = Arrays.binarySearch(ia,4);  //查找数组ia中元素4的索引位置
        System.out.println("4的索引位置是：" + index); //将索引输出
    }
}
