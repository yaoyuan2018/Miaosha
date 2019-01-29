package Array.test;

/**
 * @Author: Y_uan
 * @Date: 2019/1/28 9:31
 * @mail: yy494818027@163.com
 * @Description: 一维数组的使用
 */
public class One_Dimensional_Array {
    /**
     * 用弱智的方式将各月的天数输出
     */
    public static void main(String[] args) {
        //创建并初始化一维数组
        int day[] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < 12; i++){
            System.out.println((i + 1)+"月有" + day[i] + "天");
        }
    }
}
