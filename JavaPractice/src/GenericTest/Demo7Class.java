package GenericTest;

/**
 * @Author: Y_uan
 * @Date: 2019/2/14 9:45
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Demo7Class<T> {
    public static void main(String[] args) {
        //使用泛型类，创建对象的时候需要指定具体的类型
        new Demo7Class<Integer>().getData(5);
    }

    public T getData(T data){
        return data;
    }

    //反序任意类型数组
    public void reverse(T[] arr){
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++){
            if (start < end){
                T temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
    }
}
