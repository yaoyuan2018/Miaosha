package Random;

import java.util.Random;

/**
 * @Author: Y_uan
 * @Date: 2019/1/30 16:19
 * @mail: yy494818027@163.com
 * @Description:
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();    //实例化一个Random类
        //随机产生一个整数
        System.out.println("随机产生一个整数：" + r.nextInt());
        //随机产生一个大于等于0小于10的整数
        System.out.println("随机产生一个大于等于0小于10的整数：" + r.nextInt(10));
        //随机产生一个布尔型的值
        System.out.println("随机产生一个布尔型的值：" + r.nextDouble());
        //随机产生一个双精度的值
        System.out.println("随机产生一个双精度的值：" + r.nextDouble());
        //随机产生一个浮点型的值
        System.out.println("随机产生一个浮点型的值：" + r.nextFloat());
        //随机产生一个概率密度为高斯分布的双精度值
        System.out.println("随机产生一个概率密度为高斯分布的双精度值：" + r.nextGaussian());
    }
}
