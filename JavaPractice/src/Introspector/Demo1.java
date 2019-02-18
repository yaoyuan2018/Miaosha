package Introspector;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * @Author: Y_uan
 * @Date: 2019/2/14 11:00
 * @mail: yy494818027@163.com
 * @Description:
 */
public class Demo1 {
    public static void testPropertyDescriptor() throws Exception{
        Person p = new Person();
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("id",Person.class);

        //获取属性的写的方法
        Method writeMethod = propertyDescriptor.getWriteMethod();
        Method readMethod = propertyDescriptor.getReadMethod();
        propertyDescriptor.getReadMethod();
        writeMethod.invoke(p,12);
        System.out.println(readMethod.invoke(p,null));
    }

    public static void testIntrospector() throws Exception{
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
        PropertyDescriptor[] descriptor = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor itemProperty : descriptor){
            System.out.println(itemProperty.getReadMethod().getName());
        }
    }
}
