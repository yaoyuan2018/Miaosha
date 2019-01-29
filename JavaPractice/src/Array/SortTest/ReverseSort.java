package Array.SortTest;

/**
 * @Author: Y_uan
 * @Date: 2019/1/29 9:32
 * @mail: yy494818027@163.com
 * @Description:
 */
public class ReverseSort {
    public static void main(String[] args) {
        //创建一个数组
        int[] array = {10, 20, 30, 40, 50, 60};
        //创建反转排序类的对象
        ReverseSort sorter = new ReverseSort();
        //调用排序对象的方法将数组反转
        sorter.sort(array);
    }

    /**
     * 反转排序法
     *
     *@Param array  要排序的数组
     */
    public void sort(int[] array){
        System.out.println("数组原有内容：");
        showArray(array);
        int temp;
        int len = array.length;
        for (int i = 0; i < len; i++){
            temp = array[i];
            array[i] = array[len-1-i];
            array[len-1-i] = temp;
        }
        System.out.println("数组反转后内容：");
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
