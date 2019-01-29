package Array.test;

/**
 * @Author: Y_uan
 * @Date: 2019/1/28 9:37
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Two_Dimensional_Array {
    public static void main(String[] args) {
        /*int b[][] = new int[][]{{1},{2,3},{4,5,6}};
        for (int k = 0; k < b.length; k++) {
            for (int c = 0; c < b[k].length; c++) {
                System.out.println(b[k][c]);        //将数组中的元素输出
            }
            System.out.println();                       //输出空格
        }*/
        /**
         * 遍历数组时，使用foreach语句可能会更简单
         */
        int arr2[][] = {{4,3},{1,2}};
        System.out.println("数组中的元素是：");
        for (int x[] : arr2){                   //外层循环变量为一维数组
            for (int e : x){                    //循环遍历每一个数组元素
//                System.out.println(x.length);
                if (e == x.length){             //判断变量是否是二维数组中的最后一个元素
                    System.out.print(e);        //输出二维数组的最后一个元素
                } else
                    System.out.print(e + "、"); //如果不是二维数组中的最后一个元素
            }
        }
    }
}
