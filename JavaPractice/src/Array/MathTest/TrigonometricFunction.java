package Array.MathTest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Author: Y_uan
 * @Date: 2019/1/29 15:38
 * @mail: yy494818027@163.com
 * @Description:
 */
public class TrigonometricFunction {
    public static void main(String[] args) {
        //取90°的正弦
        System.out.println("90度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));    //取0°的余弦
        //取60°的正切
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
        //取2的平方根与2商的反正弦
        System.out.println("2的平方根与2商的反正弦值：" + Math.asin(Math.sqrt(2)/2));
        //取2的平方根与2上的反余弦
        System.out.println("2的平方根与2商的反余弦值：" + Math.acos(Math.sqrt(2)/2));

        System.out.println("1的反正切值：" + Math.atan(1));

        System.out.println("120度的弧度值：" + Math.toRadians(120.0));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
    }
}
