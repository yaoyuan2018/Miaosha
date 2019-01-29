package Array.SortTest;

/**
 * @Author: Y_uan
 * @Date: 2019/1/29 9:07
 * @mail: yy494818027@163.com
 * @Description:
 */
public class SelectSort {
    public static void main(String[] args) {
        //创建一个数组，这个数组元素是乱序的
        int[] array = {63, 4, 24, 1, 3, 15};
        //创建直接排序类的对象
        SelectSort sorter = new SelectSort();
        //调用排序对象的方法将数组排序
        sorter.sort(array);

    }

    /**
     * 直接选择排序法
     *@Param array
     *      要排序的数组
     */
    public void sort(int[] array){
        int index;
        for (int i = 1; i < array.length; i++){
            //每次大循环 index初始化为0
            index = 0;
            for (int j = 1; j <= array.length-i; j++){
                if (array[j] > array[index]){
                    index = j;
                }
            }
            //交换在位置array.length-i和index(最大值)上的两个数
            int temp = array[array.length-i];           //把第一个元素保存到临时变量中
            array[array.length - i] = array[index];     //把第二个元素值保存到第一个元素单元中
            array[index] = temp;                        //把临时变量也就是第一个元素原值保存到第二个元素中
        }
        showArray(array);
    }
    /**
     * 显示数组中的所有元素
     *@Param array
     *      要显示的数组
     *@return
     */
    public void showArray(int[] array){
        for (int i : array){
            System.out.print(">" + i);
        }
        System.out.println();
    }
}
