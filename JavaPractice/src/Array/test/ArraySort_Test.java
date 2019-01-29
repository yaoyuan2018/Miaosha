package Array.test;

import java.util.Arrays;

/**
 * @Author: Y_uan
 * @Date: 2019/1/28 10:54
 * @mail: yy494818027@163.com
 * @Description: 数组排序，Arrays.sort()对数组进行升序排序。
 * Java中的String类型数组的排序算法是根据字典编排顺序排序的，因此数字排在字母前面，大写字母排在小写字母前面。
 */
public class ArraySort_Test {
    public static void main(String[] args) {
        int arr[] = new int[] {23, 42, 12, 8};
        Arrays.sort(arr);                           //将数组进行排序
        for (int i = 0; i < arr.length; i++){       //循环遍历排序后的数组
            System.out.println(arr[i]);             //将排序后数组中的各个元素输出
        }
    }
}
