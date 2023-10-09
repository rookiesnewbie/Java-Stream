package Stream流的终结方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Stream;

/**
 * @Author LiTeng
 * @Date 2023/10/9 15:59
 * Version 1.0
 * @Description toArrary方法
 */
public class StreamOfToArrary {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌","周芷若","赵敏","张翠山","张三丰","张启山");

        //无参数的情况，返回一个Object数组
        Object[] array = list1.stream().toArray();
        System.out.println(Arrays.toString(array));


        System.out.println("=============================");

        //有参数的情况
        //1.匿名内部类的写法
        /**
         * IntFunction的泛型：具体的数组类型
         * 重写方法apply的形参：流中数据的个数，要与数组的长度保持一致
         * apply的返回值类型：具体类型的数组
         * 方法体：就是创建数组
         */
        String[] array1 = list1.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        System.out.println(Arrays.toString(array1));

        System.out.println("=============================");

        //2.lambda表达式的写法
        String[] array2 = list1.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array2));

    }

}
